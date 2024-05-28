using Firebase;
using Firebase.Auth;
using Firebase.Extensions;
using UnityEngine;

public class FirebaseAuthManager : MonoBehaviour
{
    private FirebaseAuth auth;
    private bool isInitialized = false;

    void Start()
    {
        FirebaseApp.CheckAndFixDependenciesAsync().ContinueWithOnMainThread(task => {
            FirebaseApp app = FirebaseApp.DefaultInstance;
            auth = FirebaseAuth.DefaultInstance;
            isInitialized = true;
        });
    }

    public void Login(string email, string password, System.Action<FirebaseUser> onLoginSuccess, System.Action<string> onLoginFailed)
    {
        if (!isInitialized)
        {
            onLoginFailed?.Invoke("Firebase not initialized yet. Please wait.");
            return;
        }

        auth.SignInWithEmailAndPasswordAsync(email, password).ContinueWithOnMainThread(task => {
            if (task.IsCanceled || task.IsFaulted)
            {
                onLoginFailed?.Invoke(task.Exception?.Message);
            }
            else
            {
                AuthResult result = task.Result;
                FirebaseUser user = result.User;
                onLoginSuccess?.Invoke(user);
            }
        });
    }
}
