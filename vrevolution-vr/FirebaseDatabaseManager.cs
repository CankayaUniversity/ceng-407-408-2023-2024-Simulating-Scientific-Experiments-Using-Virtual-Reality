using Firebase;
using Firebase.Database;
using Firebase.Extensions;
using UnityEngine;
using System;
using System.Collections.Generic;

public class FirebaseDatabaseManager : MonoBehaviour
{
    private DatabaseReference databaseReference;
    public bool isFirebaseInitialized { get; private set; } = false;

    public event Action OnFirebaseInitialized;

    void Start()
    {
        FirebaseApp.CheckAndFixDependenciesAsync().ContinueWithOnMainThread(task => {
            if (task.IsCompleted)
            {
                databaseReference = FirebaseDatabase.DefaultInstance.RootReference;
                isFirebaseInitialized = true;
                Debug.Log("Firebase Database initialized.");
                OnFirebaseInitialized?.Invoke();
            }
            else
            {
                Debug.LogError("Failed to initialize Firebase Database: " + task.Exception);
            }
        });
    }

    public void GetAllUsers(System.Action<List<Dictionary<string, object>>> onUsersRetrieved, System.Action<string> onError)
    {
        if (!isFirebaseInitialized)
        {
            onError?.Invoke("Firebase is not initialized.");
            return;
        }

        databaseReference.Child("users").GetValueAsync().ContinueWithOnMainThread(task => {
            if (task.IsFaulted)
            {
                onError?.Invoke(task.Exception?.Message);
                return;
            }

            if (task.IsCompleted)
            {
                DataSnapshot snapshot = task.Result;
                List<Dictionary<string, object>> users = new List<Dictionary<string, object>>();

                foreach (DataSnapshot userSnapshot in snapshot.Children)
                {
                    Dictionary<string, object> user = userSnapshot.Value as Dictionary<string, object>;
                    if (user != null)
                    {
                        user["userId"] = userSnapshot.Key; // Include the user ID
                        users.Add(user);
                    }
                }

                Debug.Log("Retrieved " + users.Count + " users.");
                onUsersRetrieved?.Invoke(users);
            }
            else
            {
                Debug.LogError("Task not completed for unknown reasons.");
                onError?.Invoke("Failed to retrieve users for unknown reasons.");
            }
        });
    }
}
