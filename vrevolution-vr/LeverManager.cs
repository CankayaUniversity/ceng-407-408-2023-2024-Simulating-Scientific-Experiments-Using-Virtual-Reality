using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class LeverManager : MonoBehaviour
{
    public static LeverManager Instance;

    public Transform tableParent;
    public GameObject leverParent;

    public Transform miniLever;

    public Transform[] tablePoints;
    public GameObject[] leverPoints;

    public GameObject lastImageUI;

    public GameObject[] weights;

    public GameObject LeverExperiment;
    public GameObject Quiz;

    private GameObject[] leverWeights;

    [SerializeField]
    private float rotationSpeed = 1.0f; // Control the speed of the rotation


    public enum RotationState { Left, Right, Balance };
    private RotationState rotationState = RotationState.Balance;

    public bool calc = false;

    private void Update()
    {
        if (calc)
        {
            calc = false;
            CalculateBalance();
        }
    }

    void Awake()
    {
        SceneManager.sceneLoaded += OnSceneLoaded;
        if (Instance != null && Instance != this)
        {
            Destroy(gameObject);
        }
        else
        {
            Instance = this;
            DontDestroyOnLoad(gameObject);
            // Initialize array sizes based on child count
            tablePoints = new Transform[tableParent.childCount];
            leverPoints = new GameObject[leverParent.transform.childCount];
            leverWeights = new GameObject[leverParent.transform.childCount];
        }
    }

    void OnDestroy()
    {
        SceneManager.sceneLoaded -= OnSceneLoaded;
    }

    private void OnSceneLoaded(Scene scene, LoadSceneMode mode)
    {
        // Example: destroy the instance if the loaded scene is the main menu (index 0)
        if (scene.buildIndex == 0)
        {
            DestroyManagerInstance();
        }
    }

    private void Start()
    {
        lastImageUI.SetActive(false);
        int count = Mathf.Min(tableParent.childCount, leverParent.transform.childCount);
        for (int i = 0; i < count; i++)
        {
            tablePoints[i] = tableParent.GetChild(i);
            leverPoints[i] = leverParent.transform.GetChild(i).gameObject;
            tableParent.GetChild(i).gameObject.GetComponent<LeverPlace>().index = i;
        }
    }

    public void UpdateWeightsPlaces(int placeIndex, int weightValue)
    {
        if (leverWeights[placeIndex] != null)
            Destroy(leverWeights[placeIndex]);

        if (weightValue > 0 && weightValue / 10 - 1 < weights.Length)
        {
            leverWeights[placeIndex] = Instantiate(weights[weightValue / 10 - 1], leverPoints[placeIndex].transform.position, Quaternion.identity, leverParent.transform);
        }
        else
        {
            Debug.LogError("Invalid weight value or weights array index out of bounds");
        }
    }

    public void DestroyWeight(int index)
    {
        if (leverWeights[index] != null)
        {
            Destroy(leverWeights[index]);
            leverWeights[index] = null;
        }
    }

    public void CalculateBalance()
    {
        int centerIndex = tablePoints.Length / 2;
        int value = 0;
        int weightCount = 0;

        for (int i = 0; i < tablePoints.Length; i++)
        {
            LeverPlace leverPlace = tablePoints[i].GetComponent<LeverPlace>();
            if (leverPlace != null)
            {
                if(leverPlace.weight > 0)
                {
                    weightCount++;
                }
                Debug.Log(leverPlace.gameObject.name + " weight " + leverPlace.weight);
                value += leverPlace.weight * (i - centerIndex);
            }
        }

        RotationState previousState = rotationState;
        if (value < 0)
            rotationState = RotationState.Left;
        else if (value > 0)
            rotationState = RotationState.Right;
        else
            rotationState = RotationState.Balance;

        if (previousState != rotationState)
            UpdatePosition();

        if (weightCount == 5 && rotationState == RotationState.Balance)
        {
            QuizPart();
        }
        Debug.Log("rotation state " + rotationState);
        Debug.Log("value " + value);
        Debug.Log("Benna we" + weightCount);
    }

    [SerializeField]
    private float rotationDuration = 1.0f; // Duration over which the rotation completes

    private IEnumerator RotateToAngle(float targetAngle)
    {
        Quaternion startRotation = leverParent.transform.rotation;
        Quaternion endRotation = Quaternion.Euler(0, 0, targetAngle);
        float time = 0.0f;

        while (time < rotationDuration)
        {
            leverParent.transform.rotation = Quaternion.Lerp(startRotation, endRotation, time / rotationDuration);
            if (miniLever != null)
            {
                miniLever.transform.rotation = Quaternion.Lerp(startRotation, endRotation, time / rotationDuration);
            }

            time += Time.deltaTime;
            yield return null;
        }

        leverParent.transform.rotation = endRotation;
        if (miniLever != null)
        {
            miniLever.transform.rotation = endRotation;
        }
    }

    private void UpdatePosition()
    {
        float targetAngle = (rotationState == RotationState.Left) ? -10f : (rotationState == RotationState.Right) ? 10f : 0f;
        StartCoroutine(RotateToAngle(targetAngle));
    }

    void QuizPart()
    {
        StartCoroutine(QuizPartNumerator());
    }

    IEnumerator QuizPartNumerator() {
        lastImageUI.SetActive(true);
        yield return new WaitForSeconds(10);
        LeverExperiment.SetActive(false);
        Quiz.SetActive(true);
    }

    public void GoToMainMenu()
    {
        DestroyManagerInstance();
        SceneManager.LoadSceneAsync(0);
    }

    private void DestroyManagerInstance()
    {
        if (Instance != null)
        {
            Destroy(Instance.gameObject); // Destroy the GameObject
            Instance = null; // Clear the static reference
        }
    }
    public void PassExperimentPart()
    {
        if (!Quiz.gameObject.activeInHierarchy)
        {
            LeverExperiment.SetActive(false);
            Quiz.SetActive(true);
        }
    }
}
