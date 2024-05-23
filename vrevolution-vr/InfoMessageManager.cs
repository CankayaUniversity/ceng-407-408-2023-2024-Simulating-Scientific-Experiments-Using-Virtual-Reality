using System.Collections;
using UnityEngine;
using UnityEngine.Video;
using TMPro;
using UnityEngine.SceneManagement;

public class InfoMessageManager : MonoBehaviour
{
    public static InfoMessageManager Instance;

    public GameObject InfoMessage;
    public GameObject[] Contents;
    public VideoClip[] Videos;
    public VideoPlayer videoPlayer;
    private Coroutine moveCoroutine;

    public GameObject AllVideos;

    public Vector3 zeroPosition = Vector3.zero;
    private Camera mainCamera;

    public bool started = false;
    public bool control = false;

    private void Awake()
    {
        if (Instance != null && Instance != this)
        {
            Destroy(gameObject);
        }
        else
        {
            Instance = this;
            mainCamera = Camera.main;
            DontDestroyOnLoad(gameObject);
            SceneManager.sceneLoaded += OnSceneLoaded;
        }
    }

    private void Update()
    {
        if (control)
        {
            StartFollowing("Sun");
            control = false;
        }
    }

    private void Start()
    {
        if (InfoMessage == null)
        {
            InfoMessage = GameObject.FindGameObjectWithTag("InfoMessage");
            InfoMessage.SetActive(true);
        }
        videoPlayer.errorReceived += HandleVideoError;
        videoPlayer.prepareCompleted += OnVideoPrepared;
    }

    private void OnDestroy()
    {
        SceneManager.sceneLoaded -= OnSceneLoaded;
        videoPlayer.errorReceived -= HandleVideoError;
        videoPlayer.prepareCompleted -= OnVideoPrepared;
    }

    private void OnSceneLoaded(Scene scene, LoadSceneMode mode)
    {
        if (scene.buildIndex == 0)
        {
            Destroy(gameObject);
            Instance = null;
        }
    }

    public void StartFollowing(string planetName)
    {
        Debug.Log("BENNA - InfoManager " + gameObject.name);
        
        if (InfoMessage == null)
        {
            Debug.LogError("InfoMessage GameObject is not assigned.");
            return;
        }

        int index = -1;
        switch (planetName)
        {
            case "Sun": index = 0; break;
            case "Mercury": index = 1; break;
            case "Venus": index = 2; break;
            case "Earth": index = 3; break;
            case "Mars": index = 4; break;
            case "Jupiter": index = 5; break;
            case "Saturn": index = 6; break;
            case "Uranus": index = 7; break;
            case "Neptune": index = 8; break;
            default:
                Debug.LogError("Invalid planet name: " + planetName);
                InfoMessage.SetActive(false);
                return;
        }
        //AllVideos.SetActive(true);
        SetContent(index);
        
    }

    void SetContent(int index)
    {
        videoPlayer.clip = Videos[index];
        videoPlayer.Prepare();
        ///
        foreach (GameObject obj in Contents)
        {
            obj.SetActive(false);
        }
        Contents[index].SetActive(true);
    }

    void OnVideoPrepared(VideoPlayer vp)
    {
        if (!vp.isPlaying)
        {
            vp.Play();
        }
        foreach (GameObject obj in Contents)
        {
            obj.SetActive(false);
        }
        int index = System.Array.IndexOf(Videos, vp.clip);
        if (index >= 0 && index < Contents.Length)
        {
            Contents[index].SetActive(true);
        }
    }

    public void StopFollowing()
    {
        if (moveCoroutine != null)
        {
            StopCoroutine(moveCoroutine);
        }
        videoPlayer.Stop();
        AllVideos.SetActive(false);
        //moveCoroutine = StartCoroutine(MoveToZero());
        foreach (GameObject obj in Contents)
        {
            obj.SetActive(false);
        }
    }

    private IEnumerator MoveToZero()
    {
        Vector3 startPosition = InfoMessage.transform.position;
        float elapsedTime = 0f;
        float duration = 1f;
        videoPlayer.Stop();
        AllVideos.SetActive(false);
        foreach (GameObject obj in Contents)
        {
            obj.SetActive(false);
        }

        while (elapsedTime < duration)
        {
            InfoMessage.transform.position = Vector3.Lerp(startPosition, zeroPosition, elapsedTime / duration);
            elapsedTime += Time.deltaTime;
            yield return null;
        }
        InfoMessage.transform.position = zeroPosition;
    }

    public void FollowTarget(Vector3 targetPosition, float followSpeed, float rotationSpeed)
    {
        if (!mainCamera)
        {
            Debug.LogWarning("Main camera not found, checking again...");
            mainCamera = Camera.main;
            if (!mainCamera) return;
        }

        InfoMessage.transform.position = Vector3.Lerp(InfoMessage.transform.position, targetPosition, followSpeed * Time.deltaTime);

        Vector3 directionToCamera = mainCamera.transform.position - InfoMessage.transform.position;
        if (directionToCamera != Vector3.zero)
        {
            Quaternion desiredRotation = Quaternion.LookRotation(directionToCamera);
            InfoMessage.transform.rotation = Quaternion.Slerp(InfoMessage.transform.rotation, desiredRotation, rotationSpeed * Time.deltaTime);
        }
    }

    void HandleVideoError(VideoPlayer source, string message)
    {
        Debug.LogError("Video Player Error: " + message);
    }
}
