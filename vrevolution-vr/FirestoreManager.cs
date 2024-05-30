using Firebase.Firestore;
using Firebase.Extensions;
using UnityEngine;
using System.Collections.Generic;

public class FirestoreManager : MonoBehaviour
{
    private FirebaseFirestore db;

    void Start()
    {
        db = FirebaseFirestore.DefaultInstance;
        Debug.Log("Firestore initialized.");
    }

    public void SaveUserData(string userId, string email, string username, string school, string userClass, Dictionary<string, Dictionary<string, object>> experiments)
    {
        DocumentReference userDocRef = db.Collection("classes").Document(userId);
        Dictionary<string, object> user = new Dictionary<string, object>
        {
            { "email", email },
            { "username", username },
            { "school", school },
            { "class", userClass }
        };

        userDocRef.SetAsync(user).ContinueWithOnMainThread(task => {
            if (task.IsCompletedSuccessfully)
            {
                Debug.Log("User data saved successfully.");

                // Save experiments
                if (experiments != null)
                {
                    foreach (var experiment in experiments)
                    {
                        SaveExperimentResult(userId, experiment.Key, experiment.Value);
                    }
                }
            }
            else
            {
                Debug.LogError("Failed to save user data: " + task.Exception);
            }
        });
    }

    public void SaveExperimentResult(string userId, string experimentId, Dictionary<string, object> experimentData)
    {
        DocumentReference experimentDocRef = db.Collection("users").Document(userId).Collection("experiments").Document(experimentId);
        Debug.Log("Saving experiment result to: " + experimentDocRef.Path);

        experimentDocRef.SetAsync(experimentData, SetOptions.Overwrite).ContinueWithOnMainThread(task => {
            if (task.IsCompletedSuccessfully)
            {
                Debug.Log("Experiment result saved successfully.");
            }
            else
            {
                Debug.LogError("Failed to save experiment result: " + task.Exception);
            }
        });
    }
}
