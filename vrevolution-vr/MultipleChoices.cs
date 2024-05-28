using UnityEngine;
using UnityEngine.UI;
using TMPro;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

public class MultipleChoices : MonoBehaviour
{
    public TMP_Text questionText;
    public TMP_Text[] optionTexts;
    public TMP_Text timeText;
    public TMP_Text remainQuestionText;

    public GameObject restartButton;

    private List<Question> questions = new List<Question>();
    private List<Question> selectedQuestions = new List<Question>();
    private Question currentQuestion;
    private int questionIndex = 0;
    private float timeLeft = 60f;  // Time for each question in seconds
    private int questionNumber = 1;
    private bool isWaitingForNext = false;  // To control the flow between questions
    private Coroutine questionCoroutine;  // To hold reference to the coroutine

    bool isEnd = false;
    private int Score = 0;

    private struct Question
    {
        public string QuestionText;
        public string[] Options;
        public int CorrectAnswerIndex;

        public Question(string questionText, string[] options, int correctAnswerIndex)
        {
            QuestionText = questionText;
            Options = options;
            CorrectAnswerIndex = correctAnswerIndex;
        }
    }

    void Start()
    {
        InitializeQuestions();
        SelectRandomQuestions(5); // Selects 5 random questions from the pool
        DisplayQuestion();
    }

    void Update()
    {
        if (!isWaitingForNext)
        {
            if (timeLeft > 0)
            {
                timeLeft -= Time.deltaTime;
                timeText.text = "Remaining Time: " + Mathf.Ceil(timeLeft).ToString() + "s";
            }
            else
            {
                if (!isEnd)
                {
                    isWaitingForNext = true;  // Prevent multiple coroutine launches.
                    questionText.text = "Time's up! Moving to next question...";
                    if (questionCoroutine != null)
                        StopCoroutine(questionCoroutine);
                    questionCoroutine = StartCoroutine(WaitAndShowNext(5)); // Start waiting for the next question
                }
            }
        }
    }

    private void InitializeQuestions()
    {
        questions.Add(new Question("İki ayrı cismin bir üçüncü cisimle ısısal dengede olması durumunda, bu cisimlerin birbirleriyle de ısısal dengede olduklarını ifade edilir. Bu termodinamiğin kaçıncı yasasını tanımlar?", new string[] { "3", "2", "1", "0" }, 3));
        questions.Add(new Question("Bir bravis örgüsünün hücre parametreleri a=b=c, α = β ≠ γ < 120 ise hangi kristal sisteme uyar?", new string[] { "Tetragonal", "Hegzagonal", "Trigonal", "Triklinik" }, 2));
        questions.Add(new Question("Kırılma indisi 4/√3 olan yüzeye gelen ışın yüzey normali ile 60 derecelik bir açı yapmaktadır. Işının girdiği ortamda yüzey normali ile yaptığı açı 30 derece ise yüzeyin kırılma indisi kaçtır?", new string[] { "2", "4", "2√3", "4/√3" }, 1));
        questions.Add(new Question("Bir sistemin doğal frekansı ile titreşim frekansı uyuşması aşağıdakilerden hangi olayı tanımlar?", new string[] { "Rezonans", "Mod", "Serbestlik Derecesi", "Moment" }, 0));
        questions.Add(new Question("Birbirinden ayırt edilemeyen ve herhangi bir enerji düzeyine birden fazla parçacık yollanabilen parçacıklar aşağıdakilerden hangi istatistiğe uyar?", new string[] { "Maxwell-Boltzmann İstatistiği", "Bose-Einstein İstatistiği", "Fermi-Dirac İstatistiği", "Hiçbiri" }, 1));
        questions.Add(new Question("Elektronun yükü nedir?", new string[] { "1.602×10^−19 C", "9.11x10^-28 C", "−1.602×10^−19 C", "−9.11x10^-28 C" }, 2));
        questions.Add(new Question("Yasak enerji aralığı 4eV’dan büyük olan maddeler aşağıdaki hangi katagoride yer alır?", new string[] { "İletken", "Metal", "Yarı iletken", "Yalıtkan" }, 3));
        questions.Add(new Question("Atom numarası 9 olan Flor atomunun son elektronu hangi alt kabukta bulunur?", new string[] { "s", "p", "d", "f" }, 1));
        questions.Add(new Question("Bir katot ışınları tüpünde aşağıdakilerden hangisi bulunmaz?", new string[] { "Isıtıcı", "Fosfor kaplı ekran", "Çapraz saptırıcılar", "Şiddet ayarlayıcı ızgara" }, 2));
        questions.Add(new Question("0.05 mm hassasiyet ile ölçüm yapmak isteyen bir mühendis hangi ölçüm aletini kullanmalıdır?", new string[] { "Verniyerli kumpas", "Mikrometre", "Dinamometre", "Cetvel" }, 0));
        questions.Add(new Question("Sesin havada yayılma hızı kaçtır?", new string[] { "1453 m/s", "340 m/s", "5000 m/s", "393 m/s" }, 1));
        questions.Add(new Question("Bir vektör alanın bir noktadaki ………, hacim sıfıra giderken, noktayı çevreleyen yüzeyi birim hacim başına terk eden akı miktarıdır. Cümlenin doğru olması için noktalı alana aşağıdakilerden hangisi koyulmalıdır?", new string[] { "Diverjans", "Rotasyonel", "Gradyent", "Del operatörü" }, 0));
        questions.Add(new Question("Aşağıdakilerden hangisi hem enine hem boyuna bir dalga çeşidi değildir?", new string[] { "Deprem", "Su", "Yay", "Ses" }, 3));
        questions.Add(new Question("Aşağıda verilen elektromanyetik spektrumdaki dalga çeşitlerinden hangisinin dalgaboyu içlerindeki en büyüğüdür?", new string[] { "Gama Işınları", "Kızılötesi", "Mikro Dalgalar", "X-Işınları" }, 2));
        questions.Add(new Question("I. Yerçekimi kuvveti\nII. Sürtünme kuvveti\nIII. Yay kuvveti\nIV.Sönüm kuvveti\nYukarıdaki verilenlerden kaç tanesi korunumlu kuvvettir?", new string[] { "1", "2", "3", "4" }, 1));
        questions.Add(new Question("Bir dalga cephesi üzerindeki her nokta, her yöne doğru yayılan ve ana dalga ile aynı hıza sahip ikincil dalgaların kaynağı olarak düşünülebilir. Bu olay aşağıdakilerden hangisi olarak tanımlanır?", new string[] { "Skotes teoremi", "Hund kuralı", "Huygens prensibi", "Özel görelilik" }, 2));
        questions.Add(new Question("Hızı 5 m/s olan bir araç 7 saniye sonra kaç metre yol kat etmiş olur?", new string[] { "30 m", "35 m", "42 m", "45 m" }, 1));
        questions.Add(new Question("60 volt gerilim verilen 4 metre uzunluğundaki bir telden 5 saniye boyunca kaç amper akım geçer?", new string[] { "4 A", "5 A", "15 A", "20 A" }, 1));
        questions.Add(new Question("Klasik fizik aşağıdakilerden hangisini açıklayamamıştır?", new string[] { "Newton yasaları", "Hamilton mekaniği", "Özel görelilik", "Maxwell denklemleri" }, 2));
        questions.Add(new Question("Aşağıdakilerden hangisi türetilmiş bir birimdir?", new string[] { "Uzunluk", "Akım Şiddeti", "Sıcaklık", "Enerji" }, 3));
        questions.Add(new Question("Hızı 50 m/s olan bir dalganın frekansı 5 saniye ise dalga boyu kaç metredir?", new string[] { "10 m", "250 m", "0,1 m", "2,5 m" }, 0));
        questions.Add(new Question("Bir para üst üste 2 kez atıldığında ikisinin de tura gelme olasılığı kaçtır?", new string[] { "1/2", "1/4", "4", "2" }, 1));
        questions.Add(new Question("Yay sabiti 5 N/m olan bir yay 0,5 m çekilirse geri çağırıcı kuvvet kaç N’dur?", new string[] { "25 N", "2,5 N", "250 N", "0,25 N" }, 3));
        questions.Add(new Question("Termal kameralar hangi elektromanyetik dalga aralığında çalışır?", new string[] { "X-Işınları", "Radyo Dalgaları", "Kızıl Ötesi", "Mikro Dalgalar" }, 2));
        questions.Add(new Question("Dalga hızının ve kırma indisinin dalga boyuna göre değişmesine ne ad verilir?", new string[] { "Kırınım", "Dağınım", "Yansıma", "Yayılma" }, 1));
    }

    private void SelectRandomQuestions(int count)
    {
        System.Random rng = new System.Random();
        selectedQuestions = questions.OrderBy(a => rng.Next()).Take(count).ToList();
        questionNumber = 1;  // Reset the question number
        questionIndex = 0;   // Reset index
        isWaitingForNext = false;
    }

    private void DisplayQuestion()
    {
        // Prepare the buttons and text for the next question.
        if (questionIndex < 5)
        {
            currentQuestion = selectedQuestions[questionIndex];
            questionText.text = currentQuestion.QuestionText;
            for (int i = 0; i < optionTexts.Length; i++)
            {
                optionTexts[i].text = currentQuestion.Options[i];
                Button btn = optionTexts[i].GetComponentInParent<Button>();
                btn.onClick.RemoveAllListeners();
                int captureIndex = i;
                btn.onClick.AddListener(() => Answer(captureIndex));
            }
            timeLeft = 60f; // Reset the timer for each question
            remainQuestionText.text = "Question " + questionNumber++ + "/5";
        }
        else
        {
            questionText.text = "Quiz completed!";
            EndQuiz();
        }
    }

    private void Answer(int index)
    {
        if (isWaitingForNext) return;

        isWaitingForNext = true;
        if (index == currentQuestion.CorrectAnswerIndex)
        {
            questionText.text = "Correct!";
            Score += 10;
        }
        else
        {
            questionText.text = "Wrong!";
        }
        if (questionCoroutine != null)
            StopCoroutine(questionCoroutine);
        questionCoroutine = StartCoroutine(WaitAndShowNext(5));
    }

    IEnumerator WaitAndShowNext(float waitTime)
    {
        float countdown = waitTime;
        while (countdown > 0)
        {
            timeText.text = "Next question in " + Mathf.Ceil(countdown).ToString() + "s";
            yield return new WaitForSeconds(1); // Wait for one second
            countdown -= 1; // Decrement the countdown by 1 second
        }

        // Proceed to the next question or end the quiz
        if (questionIndex < selectedQuestions.Count - 1)
        {
            questionIndex++;
            DisplayQuestion();
        }
        else
        {
            EndQuiz();
        }

        isWaitingForNext = false;  // Reset the state after the coroutine ends
    }

    private void EndQuiz()
    {
        isEnd = true;
        isWaitingForNext = true;
        foreach (var option in optionTexts)
        {
            option.text = "";
            //option.GetComponentInParent<Button>().onClick.RemoveAllListeners();  // Clean up listeners
            option.GetComponentInParent<Button>().gameObject.SetActive(false);
        }
        //timeText.text = "End of Quiz";
        timeText.text = "";
        remainQuestionText.text = "";
        restartButton.SetActive(true);
        GameManager.Instance.SetScore(Score);
        questionText.text = "Quiz completed! \nYour Total Score is: " + GameManager.Instance.GetScore() +
            "\nYou can restart the game.";
        //questionIndex = 0; // Reset for restart
        //questionNumber = 1; // Reset question numbering for restart
    }
}