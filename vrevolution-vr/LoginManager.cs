using UnityEngine;
using UnityEngine.UI;

public class LoginManager : MonoBehaviour
{
    private InputField emailField;
    private InputField passwordField;
    private Button loginButton;
    private Text errorText;

    private FirebaseAuthManager firebaseManager;
    private FirestoreManager firestoreManager;
    private FirebaseDatabaseManager firebaseDatabaseManager;

    public bool loginButtonUpdate = false;
    public bool getAllUsersUpdated = false;

    void Start()
    {
        firebaseManager = FindObjectOfType<FirebaseAuthManager>();
        firestoreManager = FindObjectOfType<FirestoreManager>();
        firebaseDatabaseManager = FindObjectOfType<FirebaseDatabaseManager>();

        //emailField = ...;
        //passwordField = ...;
        //loginButton = ...;
        //errorText = ...;

        // Uncomment and use this if you're adding button listeners
        //loginButton.onClick.AddListener(() => {
        //    string email = emailField.text;
        //    string password = passwordField.text;
        //    AttemptLogin(email, password);
        //});
    }

    private void LoadUserData(string userId)
    {
    }

    private void Update()
    {
        if (loginButtonUpdate)
        {
            loginButtonUpdate = false;
            string email = "benna@benna.com";
            string password = "334576";
            AttemptLogin(email, password);
        }

        if (getAllUsersUpdated)
        {
            getAllUsersUpdated = false;
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
    }

    private void AttemptLogin(string email, string password)
    {
        firebaseManager.Login(email, password, (user) => {
            Debug.Log("Login Successful: " + user.UserId);
            // Load user data or proceed to the main game
            LoadUserData(user.UserId);
        }, (error) => {
            errorText.text = error;
            Debug.LogError("Login Failed: " + error);
        });
    }
}
