using UnityEngine;
using TMPro;
using System.Collections.Generic;

public class UserDisplayManager : MonoBehaviour
{
    private FirebaseDatabaseManager firebaseDatabaseManager;
    private FirestoreManager firestoreManager;

    public GameObject UsersBaseButton;
    public Transform UsersParent;

    void Start()
    {
        firebaseDatabaseManager = FindObjectOfType<FirebaseDatabaseManager>();
        firestoreManager = FindObjectOfType<FirestoreManager>();
        if (firebaseDatabaseManager == null)
        {
            Debug.LogError("FirebaseDatabaseManager not found!");
            return;
        }

        firebaseDatabaseManager.OnFirebaseInitialized += DisplayUsers;

        // If Firebase is already initialized (which might happen in some cases), display users immediately
        if (firebaseDatabaseManager.isFirebaseInitialized)
        {
            DisplayUsers();
        }
    }

    private void DisplayUsers()
    {
        if (firebaseDatabaseManager.isFirebaseInitialized)
        {
            firebaseDatabaseManager.GetAllUsers((users) => {
                if (users.Count > 0)
                {
                    foreach (var user in users)
                    {
                        Debug.Log("User ID: " + user["userId"]);
                        Debug.Log("Email: " + user["email"]);
                        Debug.Log("Username: " + user["username"]);
                        Debug.Log("School: " + user["school"]);
                        Debug.Log("Class: " + user["class"]);

                        GameObject userButton = Instantiate(UsersBaseButton, UsersParent);
                        userButton.GetComponentInChildren<TMP_Text>().text = user["username"].ToString();

                        // Add example experiment data for each user
                        Dictionary<string, object> experimentData = new Dictionary<string, object>
                        {
                            { "experimentName", "Physics Experiment 1" },
                            { "finishTime", "2024-05-28T14:00:00Z" },
                            { "quizScore", 42 }
                        };

                        firestoreManager.SaveExperimentResult(user["userId"].ToString(), "experiment1", experimentData);
                    }
                }
                else
                {
                    Debug.LogWarning("No users found.");
                }
            }, (error) => {
                Debug.LogError("Error retrieving users: " + error);
            });
        }
        else
        {
            Debug.LogError("Firebase is not initialized.");
        }
    }

    void OnDestroy()
    {
        if (firebaseDatabaseManager != null)
        {
            firebaseDatabaseManager.OnFirebaseInitialized -= DisplayUsers;
        }
    }
}
