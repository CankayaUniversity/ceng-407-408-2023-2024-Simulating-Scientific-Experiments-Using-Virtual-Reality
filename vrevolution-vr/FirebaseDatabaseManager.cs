using Firebase;
using Firebase.Database;
using Firebase.Extensions;
using UnityEngine;
using System;
using System.Collections.Generic;

public struct ExperimentData
{
    public string experimentName;
    public string finishTime;
    public int quizScore;
    public string finishingTime;

    public ExperimentData(string experimentName, string finishTime, int quizScore, string finishingTime)
    {
        this.experimentName = experimentName;
        this.finishTime = finishTime;
        this.quizScore = quizScore;
        this.finishingTime = finishingTime;
    }

    public Dictionary<string, object> ToDictionary()
    {
        return new Dictionary<string, object>
        {
            { "experimentName", experimentName },
            { "finishTime", finishTime },
            { "quizScore", quizScore },
            { "finishingTime", finishingTime }
        };
    }
}

public class FirebaseDatabaseManager : MonoBehaviour
{
    private DatabaseReference databaseReference;
    public bool isFirebaseInitialized { get; private set; } = false;

    public event Action OnFirebaseInitialized;

    public string className = "7A";

    void Start()
    {
        CheckAndInitializeFirebase();
    }

    private void CheckAndInitializeFirebase()
    {
        FirebaseApp.CheckAndFixDependenciesAsync().ContinueWithOnMainThread(task =>
        {
            if (task.IsCompletedSuccessfully)
            {
                InitializeFirebase();
            }
            else
            {
                Debug.LogError("Failed to initialize Firebase: " + task.Exception);
            }
        });
    }

    private void InitializeFirebase()
    {
        databaseReference = FirebaseDatabase.DefaultInstance.RootReference;
        isFirebaseInitialized = true;
        Debug.Log("Firebase initialized.");
        OnFirebaseInitialized?.Invoke();
    }

    public void GetAllUsers(Action<List<Dictionary<string, object>>> onUsersRetrieved, Action<string> onError, string className)
    {
        if (!isFirebaseInitialized)
        {
            onError?.Invoke("Firebase is not initialized.");
            return;
        }

        databaseReference.Child("classes").Child(className).Child("users").GetValueAsync().ContinueWithOnMainThread(task =>
        {
            if (task.IsFaulted)
            {
                onError?.Invoke(task.Exception?.Message);
                return;
            }

            if (task.IsCompletedSuccessfully)
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

                onUsersRetrieved?.Invoke(users);
            }
            else
            {
                onError?.Invoke("Failed to retrieve users for unknown reasons.");
            }
        });
    }

    public void GetAllClasses(Action<List<Dictionary<string, object>>> onClassesRetrieved, Action<string> onError)
    {
        if (!isFirebaseInitialized)
        {
            onError?.Invoke("Firebase is not initialized.");
            return;
        }

        databaseReference.Child("classes").GetValueAsync().ContinueWithOnMainThread(task =>
        {
            if (task.IsFaulted)
            {
                onError?.Invoke(task.Exception?.Message);
                return;
            }

            if (task.IsCompletedSuccessfully)
            {
                DataSnapshot snapshot = task.Result;
                List<Dictionary<string, object>> classes = new List<Dictionary<string, object>>();

                foreach (DataSnapshot classSnapshot in snapshot.Children)
                {
                    Dictionary<string, object> classData = new Dictionary<string, object>();
                    foreach (DataSnapshot seatSnapshot in classSnapshot.Child("seats").Children)
                    {
                        Dictionary<string, object> seatData = seatSnapshot.Value as Dictionary<string, object>;
                        classData[seatSnapshot.Key] = seatData;
                    }
                    classData["classID"] = classSnapshot.Key;
                    classes.Add(classData);
                }

                onClassesRetrieved?.Invoke(classes);
            }
            else
            {
                onError?.Invoke("Failed to retrieve classes for unknown reasons.");
            }
        });
    }

    public void SaveExperimentResult(string userId, string experimentId, ExperimentData experimentData)
    {
        if (!isFirebaseInitialized)
        {
            Debug.LogError("Firebase is not initialized.");
            return;
        }

        if (string.IsNullOrEmpty(userId) || string.IsNullOrEmpty(experimentId))
        {
            Debug.LogError("Invalid input parameters for saving experiment result.");
            return;
        }

        Debug.Log($"Saving experiment result for user: {userId}, experiment: {experimentId}");

        string key = PlayerPrefs.GetString("experimentId");
        Dictionary<string, object> childUpdates = new Dictionary<string, object>
        {
            { $"classes/{PlayerPrefs.GetString("classname")}/users/{userId}/experiments/{key}", experimentData.ToDictionary() }
        };

        databaseReference.UpdateChildrenAsync(childUpdates).ContinueWithOnMainThread(task =>
        {
            if (task.IsCompletedSuccessfully)
            {
                Debug.Log("Experiment result saved successfully. path: " + $"/users/{userId}/experiments/{key}");
            }
            else
            {
                Debug.LogError("Failed to save experiment result: " + task.Exception);
            }
        });
    }

    public void CheckUserPassword(string classname, string userId, string inputPassword, Action<bool> onPasswordChecked)
    {
        databaseReference.Child("classes").Child(classname).Child("users").Child(userId).Child("password").GetValueAsync().ContinueWithOnMainThread(task =>
        {
            Debug.Log("Classname: " + classname + " User ID: " + userId);
            if (task.IsFaulted)
            {
                Debug.LogError("Error checking user password: " + task.Exception);
                onPasswordChecked?.Invoke(false);
                return;
            }

            if (task.IsCompletedSuccessfully)
            {
                DataSnapshot snapshot = task.Result;

                string correctPassword = snapshot.Value.ToString();
                Debug.Log("Correct password: " + correctPassword + " - Input password: " + inputPassword);
                if (correctPassword == inputPassword)
                {
                    Debug.Log("Password is correct.");
                    onPasswordChecked?.Invoke(true);
                }
                else
                {
                    Debug.Log("Password is incorrect.");
                    onPasswordChecked?.Invoke(false);
                }
            }
            else
            {
                Debug.LogError("Failed to check password for unknown reasons.");
                onPasswordChecked?.Invoke(false);
            }
        });
    }
}
