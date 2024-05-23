using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using TMPro;

public class GameManager : MonoBehaviour
{
    public GameObject LeverExperiment;
    public GameObject PendulumExperiment;
    public GameObject Quiz;
    public GameObject PendulumImage;

    public GameObject ExperimetnsTool;

    public TMP_Text question;
    public TMP_Text questionText;
    private int Score = 0;

    public static GameManager Instance { get; private set; }

    public int Index;
    public bool WritableScore = true;

    private void Awake()
    {
        // If there is an instance, and it's not me, delete myself.

        if (Instance != null && Instance != this)
        {
            Destroy(this);
        }
        else
        {
            Instance = this;
        }
    }

    // Start is called before the first frame update
    void Start()
    {
        OVRPlugin.foveatedRenderingLevel = OVRPlugin.FoveatedRenderingLevel.High;
        ExperimentSettings(Index);
    }

    public void SetExperiment(int index, int Score)
    {
        question.text = "Deney " + (index) + "'deki Skorun: " + Score;
        StartCoroutine(WaitFSec(index));
    }

    void ExperimentSettings(int index)
    {
        Index = index;
        if (index == 0)
        {
            LeverExperiment.SetActive(true);
            PendulumExperiment.SetActive(false);
            Quiz.SetActive(false);
            question.text = "DENEY - 1";
            PendulumImage.SetActive(false);
            questionText.text = "Kaldıraç destek noktası etrafındaki hareketi Arşimet formülü ile tanımlanır. \n\nYük*Yük Kolu = Kuvvet*Kuvvet kolu\nKırmızı Top = 10 kg\nMavi Top = 20 kg\nSarı Top = 30 kg\nYeşil top = 40 kg\n\nAğırlıkları verilen topları Arşimet formülünü kullanıp kaldıraca yerleştirerek kaldıracın dengede durmasını sağlayınız.";
        }
        else if (index == 1)
        {
            LeverExperiment.SetActive(false);
            PendulumExperiment.SetActive(true);
            Quiz.SetActive(false);
            question.text = "DENEY - 2";
            PendulumImage.SetActive(true);
            questionText.text = "Verilen 2 sarkaç farklı ortamlarda bulunmaktadır. Tabloda verilen bilgilere göre mavi sarkacın yer çekimi ivmesinin kırmızı sarkaca oranı kaçtır? (gm/gk)";
        }
        else if (index == 2)
        {
            LeverExperiment.SetActive(false);
            PendulumImage.SetActive(false);
            PendulumExperiment.SetActive(false);
            ExperimetnsTool.SetActive(false);
            Quiz.SetActive(true);
        }
    }

    public void SetScore(int score)
    {
        Score += score;
    }

    public int GetScore()
    {
        return Score;
    }

    public void RestartGame()
    {
        SceneManager.LoadScene(0);
    }

    public void NextExperiment()
    {
        Index++;
        SetExperiment(Index, Score);
    }

    IEnumerator WaitFSec(int index)
    {
        PendulumImage.SetActive(false);
        questionText.text = "5 Saniye İçinde Diğer Bölüme Geçiliyor!";
        yield return new WaitForSeconds(5);
        ExperimentSettings(index);
    }
}
