using UnityEngine;
using UnityEngine.UI;
using TMPro;
using System.Collections.Generic;

public class UserDisplayManager : MonoBehaviour
{
    private FirebaseDatabaseManager firebaseDatabaseManager;

    public GameObject UsersBaseButton;
    public Transform UsersParent;

    public GameObject ClassBaseButton;
    public Transform ClassesParent;

    List<GameObject> instantiatedButtons = new List<GameObject>();

    public static UserDisplayManager Instance;

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

    void Start()
    {
        firebaseDatabaseManager = FindObjectOfType<FirebaseDatabaseManager>();

        if (firebaseDatabaseManager == null)
        {
            Debug.LogError("FirebaseDatabaseManager not found.");
            return;
        }
    }

    public void DisplayUsers(string className)
    {
        firebaseDatabaseManager.GetAllUsers((users) => {
            foreach (var user in users)
            {
                GameObject userButton = Instantiate(UsersBaseButton, UsersParent);
                instantiatedButtons.Add(userButton);
                userButton.GetComponentInChildren<TMP_Text>().text = user["username"].ToString();

                string userName = user["username"].ToString();
                string userId = user["userId"].ToString(); // Make sure to get the correct userId
                Debug.Log("Display UserID: " + userId);
                userButton.GetComponent<Button>().onClick.AddListener(() => LoginManager.Instance.ChooseUser(userName, userId));
            }
        }, (error) => {
            Debug.LogError("Error retrieving users: " + error);
        }, className);
    }

    public void DisplayClasses()
    {
        firebaseDatabaseManager.GetAllClasses((classes) => {
            foreach (var classData in classes)
            {
                Debug.Log("Classes count " + classes.Count);
                GameObject classButton = Instantiate(ClassBaseButton, ClassesParent);
                instantiatedButtons.Add(classButton);
                classButton.GetComponentInChildren<TMP_Text>().text = "Sınıf: " + classData["classID"].ToString();
                string classID = classData["classID"].ToString();
                classButton.GetComponent<Button>().onClick.AddListener(() => LoginManager.Instance.ChooseClass(classID));
            }
        }, (error) => {
            Debug.LogError("Error retrieving classes: " + error);
        });
    }

    public void ControlPassword(string className, string userId, string password)
    {
        firebaseDatabaseManager.CheckUserPassword(className, userId, password, (isPasswordCorrect) => {
            if (isPasswordCorrect)
            {
                Debug.Log("Password correct. Proceed with login.");
                // Proceed with the next steps, such as logging the user in or navigating to another screen.
            }
            else
            {
                Debug.Log("Password incorrect. Show error message.");
                // Show an error message to the user.
            }
        });
    }

    public void DestroyButtons()
    {
        foreach(GameObject instantiatedButton in instantiatedButtons)
        {
            Destroy(instantiatedButton);
        }
        instantiatedButtons.Clear();
    }

    void OnDestroy()
    {
        if (firebaseDatabaseManager != null)
        {
            firebaseDatabaseManager.OnFirebaseInitialized -= DisplayClasses;
        }
    }
}
