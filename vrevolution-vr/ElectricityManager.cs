using System.Collections;
using UnityEngine;
using UnityEngine.SceneManagement;
using TMPro;

public class ElectricityManager : MonoBehaviour
{
    public static ElectricityManager Instance;
    public ElementPlace[] elementPlaces;

    public GameObject[] instructions;
    public GameObject serialElementsParent;
    public GameObject parallelElementsParent;
    public GameObject ElectricalCircuit;
    public GameObject SerialCircuit;
    public GameObject ParallelCircuit;
    public GameObject Quiz;
    public MeshRenderer[] Lamps;

    private int instructionIndex = 0;
    private int experimentIndex = 0;
    private Coroutine messageCoroutine;

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
        }
    }

    void OnDestroy()
    {
        SceneManager.sceneLoaded -= OnSceneLoaded;
    }

    private void OnSceneLoaded(Scene scene, LoadSceneMode mode)
    {
        if (scene.buildIndex == 0)
        {
            DestroyManagerInstance();
        }
    }

    private void Start()
    {
        InitializePlaces();
        NextInstruction();
        ElectricalCircuit.SetActive(true);
        Quiz.SetActive(false);
    }

    private void InitializePlaces()
    {
        if (serialElementsParent != null)
        {
            elementPlaces = serialElementsParent.GetComponentsInChildren<ElementPlace>();
        }
        else
        {
            Debug.LogError("Orbits Parent is missing!");
        }
    }

    public void NextInstruction()
    {
        if (instructionIndex < instructions.Length)
        {
            if(instructionIndex > 0) {
                instructions[instructionIndex].SetActive(false);
            }
            instructions[instructionIndex++].SetActive(true);
        }
        else
        {
            //EndExperiment();
        }
    }

    public void TrueAnswer()
    {
        ShowTemporaryMessage(true, 1f);

        if (CheckElementPlaces())
        {
            if(experimentIndex == 1)
            {
                LampSwitch(true);
                EndExperiment();
            }
            else
            {
                experimentIndex = 1;
                LampSwitch(true);
                NextInstruction();
                StartCoroutine(WaitSeconds());
            }
        }
    }

    public void WrongAnswer()
    {
        ShowTemporaryMessage(false, 1f);
    }

    private void ShowTemporaryMessage(bool answer, float delay)
    {
        if (messageCoroutine != null)
            StopCoroutine(messageCoroutine);
        messageCoroutine = StartCoroutine(ShowTemporaryMessageCoroutine(answer, delay));
    }

    private IEnumerator ShowTemporaryMessageCoroutine(bool answer, float delay)
    {
        int index = answer ? 4 : 5;
        instructions[instructionIndex-1].SetActive(false);
        instructions[index].SetActive(true);
        yield return new WaitForSeconds(delay);
        instructions[index].SetActive(false);
        instructions[instructionIndex-1].SetActive(true);
    }

    public bool CheckElementPlaces()
    {
        foreach (ElementPlace elementPlace in elementPlaces)
        {
            if (elementPlace.placeState != ElementPlace.State.True)
            {
                return false;
            }
        }
        return true;
    }
    private IEnumerator WaitFSeconds(float delay)
    {
        float elapsedTime = 0;
        NextInstruction();
        while (elapsedTime < delay)
        {
            elapsedTime += Time.deltaTime;
            yield return null;
        }
        ElectricalCircuit.SetActive(false);
        Quiz.SetActive(true);
    }

    public void NextExperiment()
    {
        elementPlaces = parallelElementsParent.GetComponentsInChildren<ElementPlace>();
        instructions[1].SetActive(false);
        SerialCircuit.SetActive(false);
        LampSwitch(false);
        ParallelCircuit.SetActive(true);
    }

    public void EndExperiment()
    {
        StopAllCoroutines();
        foreach(GameObject obj in instructions)
        {
            obj.SetActive(false);
        }
        StartCoroutine(WaitFSeconds(10));
    }

    private IEnumerator WaitSeconds()
    {
        yield return new WaitForSeconds(7);
        NextInstruction();
        StopAllCoroutines();
        NextExperiment();
    }

    private void LampSwitch(bool swtich)
    {
        foreach(MeshRenderer meshRenderer in Lamps)
        {
            Material[] materials = meshRenderer.materials;

            if (swtich)
            {
                materials[1].EnableKeyword("_EMISSION");
                meshRenderer.gameObject.GetComponentInChildren<Light>().enabled = true;
            }
            else
            {
                materials[1].DisableKeyword("_EMISSION");
                meshRenderer.gameObject.GetComponentInChildren<Light>().enabled = false;
            }
        }
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
            Destroy(Instance.gameObject);
            Instance = null;
        }
    }

    public void PassExperimentPart()
    {
        if (!Quiz.gameObject.activeInHierarchy)
        {
            ElectricalCircuit.SetActive(false);
            Quiz.SetActive(true);
        }
    }
}
