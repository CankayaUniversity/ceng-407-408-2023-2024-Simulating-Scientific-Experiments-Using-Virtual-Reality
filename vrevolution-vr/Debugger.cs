using UnityEngine;
using TMPro;
using Oculus.Interaction;

public class Debugger : MonoBehaviour
{
    public TMP_Text DebugText;
    public static Debugger Instance;

    public void Awake()
    {
        if (Instance != null && Instance != this)
        {
            Destroy(gameObject);
        }
        else
        {
            Instance = this;
            DontDestroyOnLoad(gameObject); // Optional if you want the debugger to persist across scenes
        }
    }

    public void PrintDebug(string text)
    {
        if (DebugText != null)
        {
            DebugText.text += text + " ";
        }
        else
        {
            Debug.LogWarning("BENNA - DebugText reference is missing.");
        }
    }
}