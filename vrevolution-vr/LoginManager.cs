using UnityEngine;
using System.Collections.Generic;
using UnityEngine.SceneManagement;
using Firebase.Extensions;
using UnityEngine.UI;
using TMPro;

public class LoginManager : MonoBehaviour
{
    private FirebaseAuthManager firebaseManager;
    private FirebaseDatabaseManager firebaseDatabaseManager;

    public GameObject[] LoginObjects;
    public TMP_InputField passinputField;

    public bool updatelogin = false;
    public bool updateUser = false;
    public bool userChoosed = false;
    public bool passCheck = false;

    public string className = "7A";
    public string userName = "ali";
    public string password = "334576";
    public string userId;

    public static LoginManager Instance;

    void Awake()
    {
        if (Instance != null && Instance != this)
        {
            Destroy(gameObject);    
        }
        else
        {
            Instance = this;
        }
    }

    private void Update()
    {
        if (updatelogin)
        {
            updatelogin = false;
            LogginApp();
        }
        if (updateUser)
        {
            updateUser = false;
            ChooseClass(this.className);
        }
        if (userChoosed)
        {
            userChoosed = false;
            ChooseUser(userName, userId);
        }
        if (passCheck)
        {
            passCheck = false;
            ControlUserPassword();
        }
    }

    void Start()
    {
        PlayerPrefs.SetString("userId", "");
        PlayerPrefs.SetString("username", "");
        PlayerPrefs.SetString("classname", "");
        PlayerPrefs.SetString("userId", "");
        PlayerPrefs.SetString("experimentId", "");
        firebaseManager = FindObjectOfType<FirebaseAuthManager>();
        firebaseDatabaseManager = FindObjectOfType<FirebaseDatabaseManager>();
        SetLoginObjects(0);
    }

    private void AttemptLogin(string email, string password)
    {
        firebaseManager.Login(email, password, (user) => {
            Debug.Log("Login Successful: " + user.UserId);
        }, (error) => {
            Debug.LogError("Login Failed: " + error);
        });
    }

    public void LogginApp()
    {
        Debug.Log("LoginApp pressed");
        SetLoginObjects(1);
        UserDisplayManager.Instance.DisplayClasses();
    }

    public void ChooseClass(string className)
    {
        SetLoginObjects(2);
        UserDisplayManager.Instance.DisplayUsers(className);
        PlayerPrefs.SetString("classname", className);
    }

    public void ChooseUser(string userName, string userId)
    {
        SetLoginObjects(3);
        passinputField.placeholder.GetComponent<TMP_Text>().text = "Şifrenizi girin";
        this.userName = userName;
        this.userId = userId;
        PlayerPrefs.SetString("userId", userId);
        PlayerPrefs.SetString("username", userName);
    }

    void ControlUserPassword()
    {
        firebaseDatabaseManager.CheckUserPassword(className, userId, password, (isPasswordCorrect) => {
            if (isPasswordCorrect)
            {
                Debug.Log("Password correct. Proceed with login.");
                passinputField.placeholder.GetComponent<TMP_Text>().text = "Şifre doğru.";
                SetLoginObjects(4);

                Debug.Log("User Infos:");
                Debug.Log(PlayerPrefs.GetString("userId"));
                Debug.Log(PlayerPrefs.GetString("username"));
                Debug.Log(PlayerPrefs.GetString("classname"));
                // Proceed with the next steps, such as logging the user in or navigating to another screen.
            }
            else
            {
                Debug.Log("Password incorrect. Show error message.");
                passinputField.placeholder.GetComponent<TMP_Text>().text = "Şifre yanlış.";
                // Show an error message to the user.
            }
        });
    }

    public void SetLoginObjects(int index)
    {
        UserDisplayManager.Instance.DestroyButtons();
        foreach (GameObject canvas in LoginObjects)
        {
            canvas.SetActive(false);
        }
        LoginObjects[index].SetActive(true);
    }

    public void Numpad(string buttonName)
    {
        if(buttonName == "back")
        {
            ChooseClass(PlayerPrefs.GetString("classname"));
        }
        else if(buttonName == "erase")
        {
            passinputField.text = passinputField.text.Remove(passinputField.text.Length-1);
        }
        else
        {
            passinputField.text += buttonName;
            if (passinputField.text.Length >= 4)
            {
                password = passinputField.text;
                passinputField.text = "";
                ControlUserPassword();
            }
        }
    }
}
