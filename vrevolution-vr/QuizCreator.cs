using System.Collections.Generic;
using System.Collections;
using System.Linq;
using UnityEngine;
using UnityEngine.UI;
using TMPro;
using UnityEngine.SceneManagement;

public class QuizCreator : MonoBehaviour
{
    public TMP_Text questionText;
    public TMP_Text[] optionTexts;
    public TMP_Text timeText;
    public TMP_Text remainQuestionText;

    public GameObject restartButton;
    public GameObject passButton;

    private List<Question> questions = new List<Question>();
    private List<Question> selectedQuestions = new List<Question>();
    private Question currentQuestion;
    private int questionIndex = 0;
    private float timeLeft = 60f;
    private int questionNumber = 1;
    private bool isWaitingForNext = false;
    private Coroutine questionCoroutine;

    bool isEnd = false;
    private int Score = 0;

    public enum QuizTopic { SolarSystem, Electric, Lever, Pendulum };

    public QuizTopic quizTopic;

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

    private Dictionary<Button, ColorBlock> originalButtonColors = new Dictionary<Button, ColorBlock>();

    void Start()
    {
        switch (quizTopic)
        {
            case QuizTopic.SolarSystem:
                InitializeSolarSystemQuestions();
                break;
            case QuizTopic.Electric:
                InitializeElectricQuestions();
                break;
            case QuizTopic.Lever:
                InitializeLeverQuestions();
                break;
            case QuizTopic.Pendulum:
                InitializePendulumQuestions();
                break;
        }

        SelectRandomQuestions(5);
        DisplayQuestion();
    }

    void Update()
    {
        if (!isWaitingForNext)
        {
            if (timeLeft > 0)
            {
                timeLeft -= Time.deltaTime;
                timeText.text = "Kalan Süre: " + Mathf.Ceil(timeLeft).ToString() + " s";
            }
            else
            {
                if (!isEnd)
                {
                    isWaitingForNext = true;
                    questionText.text = "Süre Doldu! Diğer Soruya Geçiliyor...";
                    if (questionCoroutine != null)
                        StopCoroutine(questionCoroutine);
                    questionCoroutine = StartCoroutine(WaitAndShowNext(5));
                }
            }
        }
    }

    private void InitializeSolarSystemQuestions()
    {
        questions.Add(new Question("Güneş sistemi kaç gezegenden oluşmaktadır?", new string[] { "7", "8", "9", "10" }, 1));
        questions.Add(new Question("Aşağıdaki gezegenlerden hangisinin çapı diğerlerine göre daha büyüktür?", new string[] { "Jüpiter", "Dünya", "Mars", "Venüs" }, 0));
        questions.Add(new Question("Güneşe en uzak gezegen hangisidir?", new string[] { "Neptün", "Satürn", "Uranüs", "Mars" }, 0));
        questions.Add(new Question("1.Doğal yollar ile oluşmuştur. 2.İnsanlar tarafından kontrol edilebilir 3.Uzun süre yaşayamaz. 4.İletişim ve hava tahmini gibi amaçlar için kullanılır.\nYukarıda doğal ve yapay uyduların bazı özellikleri verilmiştir. Buna göre hangi bilgiler doğal uydular için doğrudur?", new string[] { "1-2", "Yalnız 1", "Yalnız 2", "1-3-4" }, 1));
        questions.Add(new Question("Aşağıda verilen gezegenlerin hangisinin doğal uydusu yoktur?", new string[] { "Satürn", "Dünya", "Merkür", "Jüpiter" }, 2));
        questions.Add(new Question("Gezegenlerin 6 tanesi kendi eksenleri etrafında Güneş'e göre doğrusal yönde dönerler. 2 tanesi ise kendi eksenleri etrafında Güneş'e göre ters yönde dönerler. Aşağıdakilerden hangi ikili Güneş’e göre ters yönde dönen gezegenlerdir?", new string[] { "Venüs-Uranüs", "Jüpiter-Neptün", "Dünya-Satürn", "Mars-Merkür" }, 0));
        questions.Add(new Question("Güneş sistemindeki gezegenlerden bazıları karadan bazıları ise gazlardan oluşmaktadır. Aşağıdakilerden hangisi gazlardan oluşan gezegendir?", new string[] { "Dünya", "Merkür", "Venüs", "Satürn" }, 3));
        questions.Add(new Question("Aşağıdakilerden kaç tanesi yıldızların özelliklerindendir?\n1. Doğal ısı ve ışık kaynaklarıdır.\n2. Dünya’dan uzakta oldukları için titreşimli görünürler.\n3. Ay’dan küçük görünmelerinin nedeni uzak olmalarıdır.\n4. Sıcaklık ve parlaklıkları farklıdır.\n5. Hem doğal hem yapay olanları mevcuttur.", new string[] { "2", "3", "4", "5" }, 2));
        questions.Add(new Question("1.Uzay \n2.Samanyolu \n3.Güneş \n4.Güneş sistemi \nYukarıdakilerin küçükten büyüğe doğru sıralanışı hangisidir?", new string[] { "3-4-2-1", "3-4-1-2", "1-2-4-3", "1-2-3-4" }, 0));
        questions.Add(new Question("Aşağıda bazı gök cisimleri verilmiştir. Bir sınıflandırma yapılır ise hangisi dışarıda kalır?", new string[] { "Orion", "Halley", "Büyük Ayı", "Herkül takım yıldızı" }, 1));
        questions.Add(new Question("Yıldızlar sonsuza kadar var olamaz. Çok uzun zaman sürse de yaşamları son bulur. Büyük kütleli yıldızların patlaması sonucu ışığın dahi kaçamadığı, çok güçlü bir çekim gücüne sahip ……… adı verilen gök cisimleri oluşabilir. \nYukarıda anlatılan gök cismi aşağıdakilerden hangisidir?", new string[] { "Kara delik", "Takım yıldızı", "Cüce gezgen", "Kuyruklu yıldız" }, 0));
        questions.Add(new Question("Güneş Sistemi'ndeki en büyük gezegen hangisidir?", new string[] { "Venüs", "Dünya", "Jüpiter", "Mars" }, 2));
        questions.Add(new Question("Dünya'nın doğal uydusu hangisidir?", new string[] { "Mars", "Ay", "Güneş", "Venüs" }, 1));
        questions.Add(new Question("Hangi gezegen halkaları ile ünlüdür?", new string[] { "Jüpiter", "Mars", "Satürn", "Venüs" }, 2));
        questions.Add(new Question("Merkür hangi özellik ile bilinir?", new string[] { "En küçük gezegen", "En büyük gezegen", "En sıcak gezegen", "En soğuk gezegen" }, 0));
        questions.Add(new Question("Güneş Sistemi'nde bir gaz devi olan gezegen hangisidir?", new string[] { "Dünya", "Mars", "Venüs", "Satürn" }, 3));
        questions.Add(new Question("En sıcak gezegen hangisidir?", new string[] { "Venüs", "Merkür", "Mars", "Dünya" }, 0));
        questions.Add(new Question("Merkezde bulunan yıldız nedir?", new string[] { "Ay", "Dünya", "Güneş", "Jüpiter" }, 2));
        questions.Add(new Question("En soğuk gezegen hangisidir?", new string[] { "Uranüs", "Neptün", "Satürn", "Jüpiter" }, 1));
        questions.Add(new Question("Hangi gezegen Kızıl Gezegen olarak bilinir?", new string[] { "Dünya", "Venüs", "Mars", "Jüpiter" }, 2));
        questions.Add(new Question("En hızlı dönen gezegen hangisidir?", new string[] { "Dünya", "Mars", "Jüpiter", "Satürn" }, 2));
        questions.Add(new Question("Bir buz devi olan gezegen hangisidir?", new string[] { "Mars", "Neptün", "Venüs", "Dünya" }, 1));
        questions.Add(new Question("Cüce gezegen olarak bilinen gezegen hangisidir?", new string[] { "Mars", "Plüton", "Merkür", "Venüs" }, 1));
    }

    private void InitializeElectricQuestions()
    {
        questions.Add(new Question("Devrede akımın geçişini kontrol eden eleman hangisidir?", new string[] { "Pil", "Ampul", "Anahtar", "Direnç" }, 2));
        questions.Add(new Question("Paralel bağlı devrelerde bir ampul çıkarıldığında diğer ampullerin durumu ne olur?", new string[] { "Diğerleri yanmaya devam eder", "Diğerleri söner", "Diğerlerinin parlaklığı artar", "Diğerlerinin parlaklığı azalır" }, 0));
        questions.Add(new Question("Elektrik devresinde akım şiddetini ölçen cihaz hangisidir?", new string[] { "Voltmetre", "Ampermetre", "Ohmmetre", "Termometre" }, 1));
        questions.Add(new Question("Bir devrede direnç artırıldığında akım şiddeti nasıl değişir?", new string[] { "Akım artar", "Akım azalır", "Gerilim artar", "Gerilim azalır" }, 1));
        questions.Add(new Question("Paralel bağlı devrelerde ampuller nasıl bağlanır?", new string[] { "Aynı noktadan farklı kollara", "Aynı kolda ardışık", "Seri olarak", "Üçgen şeklinde" }, 0));
        questions.Add(new Question("Seri bağlı devrelerde toplam direnç nasıl hesaplanır?", new string[] { "Dirençlerin toplamı", "Dirençlerin çarpımı", "Dirençlerin farkı", "Dirençlerin karesi" }, 0));
        questions.Add(new Question("Elektrik akımının yönü nasıldır?", new string[] { "Artıdan eksiye", "Eksiden artıya", "Yukarıdan aşağıya", "Sağdan sola" }, 0));
        questions.Add(new Question("Bir devrede iki pil seri bağlandığında toplam gerilim nasıl değişir?", new string[] { "Gerilim artar", "Gerilim azalır", "Gerilim değişmez", "Gerilim sıfır olur" }, 0));
        questions.Add(new Question("Elektrik devresinde enerji kaynağı olarak hangisi kullanılır?", new string[] { "Ampul", "Pil", "Anahtar", "Direnç" }, 1));
        questions.Add(new Question("Bir devrede voltmetre nasıl bağlanır?", new string[] { "Seri", "Paralel", "Düz", "Ters" }, 1));
        questions.Add(new Question("Devredeki akım şiddetini artırmak için ne yapılabilir?", new string[] { "Direnç artırılır", "Gerilim artırılır", "Direnç azaltılır", "Gerilim sabit tutulur" }, 1));
        questions.Add(new Question("Ampulün parlaklığının en fazla olduğu devre hangisidir?", new string[] { "Seri bağlı iki ampul", "Paralel bağlı iki ampul", "Tek ampul", "Seri bağlı üç ampul" }, 2));
        questions.Add(new Question("Seri bağlı devrede, devreden bir ampul çıkarıldığında ne olur?", new string[] { "Diğer ampuller daha parlak yanar", "Diğer ampuller söner", "Diğer ampuller yanmaya devam eder", "Hiçbir şey değişmez" }, 1));
        questions.Add(new Question("Elektrik devresinde akım hangi birimle ölçülür?", new string[] { "Volt", "Ohm", "Amper", "Joule" }, 2));
    }

    private void InitializeLeverQuestions()
    {
        questions.Add(new Question("Kuvvet aşağıdakilerden hangisi ile ölçülenebilir?", new string[] { "Terazi", "Metre", "Dinamometre", "Kronometre" }, 2));
        questions.Add(new Question("Bir cismi farklı kuvvetlerle iterek farklı mesafelere taşımak, aşağıdaki özelliklerden hangisi ile ilişkilidir?", new string[] { "Kütle", "Hız", "Ağırlık", "İş" }, 3));
        questions.Add(new Question("Kütlesi 10 kg olan bir cismin Dünya üzerindeki ağırlığı kaç N’dur? (g=10 m/s²)", new string[] { "10 N", "100 N", "50 N", "5 N" }, 1));
        questions.Add(new Question("Aşağıdaki enerji türlerinden hangisi potansiyel enerjiye örnektir?", new string[] { "Yay enerjisi", "Hareket enerjisi", "Isı enerjisi", "Elektrik enerjisi" }, 0));
        questions.Add(new Question("Bir öğrencinin okul çantasını taşıması sırasında yaptığı fiziksel anlamda iş hangisidir?", new string[] { "Çantayı yere bırakması", "Çantayı kaldırması", "Çantayı omzunda tutması", "Çantayı masaya koyması" }, 1));
        questions.Add(new Question("Ağırlığı 30 N olan bir cismin kütlesi kaç kg’dır? (g=10 m/s²)", new string[] { "3 kg", "30 kg", "300 kg", "0.3 kg" }, 0));
        questions.Add(new Question("Hangi gezegenin yüzeyindeki yer çekimi kuvveti Dünya'dan daha fazladır?", new string[] { "Mars", "Venüs", "Jüpiter", "Merkür" }, 2));
        questions.Add(new Question("K ve L cisimleri aynı yükseklikten serbest bırakıldığında yere çarptıklarında sahip oldukları kinetik enerjiler eşittir. Bu durum hangi faktörle açıklanabilir?", new string[] { "Kütle", "Yükseklik", "Hız", "Kuvvet" }, 1));
        questions.Add(new Question("Bir arabanın kinetik enerjisi nasıl artırılabilir?", new string[] { "Hızını azaltarak", "Ağırlığını artırarak", "Hızını artırarak", "Yavaşlayarak" }, 2));
        questions.Add(new Question("Dinamometre ile ölçülen büyüklük aşağıdakilerden hangisidir?", new string[] { "Kütle", "Ağırlık", "Hız", "Mesafe" }, 1));
        questions.Add(new Question("Kuvvet ve mesafe ile ilgili aşağıdaki ifadelerden hangisi doğrudur?", new string[] { "Kuvvet artarsa iş azalır.", "Kuvvet azalırsa iş artar.", "Mesafe artarsa iş azalır.", "Mesafe artarsa iş artar." }, 3));
        questions.Add(new Question("Bir cismi 20 N kuvvetle 5 metre itmekle yapılan iş kaç Joule’dur?", new string[] { "4 J", "25 J", "100 J", "10 J" }, 2));
        questions.Add(new Question("Yüksekte bulunan bir cismin sahip olduğu enerji türü hangisidir?", new string[] { "Kinetik enerji", "Termal enerji", "Potansiyel enerji", "Elektrik enerjisi" }, 2));
        questions.Add(new Question("Aşağıdakilerden hangisi enerjinin korunumu yasasına örnektir?", new string[] { "Isının yayılması", "Işığın kırılması", "Bir topun yerden sektikten sonra tekrar yükselmesi", "Bir cismi itmek" }, 2));
        questions.Add(new Question("Bir yay sıkıştırıldığında hangi enerji türü depolanır?", new string[] { "Kimyasal enerji", "Potansiyel enerji", "Kinetik enerji", "Isı enerjisi" }, 1));
        questions.Add(new Question("Kütlesi 15 kg olan bir cisim Dünya'da farklı yüksekliklere çıkarıldığında sahip olduğu enerji türü nedir?", new string[] { "Kinetik enerji", "Kimyasal enerji", "Potansiyel enerji", "Elektrik enerjisi" }, 2));
    }

    private void InitializePendulumQuestions()
    {
        questions.Add(new Question("Kuvvet ve enerji arasındaki ilişkiyi ifade eden temel prensip nedir?", new string[] { "Kuvvet kütle ile ters orantılıdır.", "Enerji korunur.", "Kuvvet hızla orantılıdır.", "Enerji kuvvetle orantılıdır." }, 1));
        questions.Add(new Question("Kütlenin birimi nedir?", new string[] { "Newton", "Kilogram", "Metre", "Litre" }, 1));
        questions.Add(new Question("Hangi durumda fiziksel anlamda iş yapılmıştır?", new string[] { "Kitabı tutmak", "Sandalyeyi itmek", "Duvara yaslanmak", "Çanta taşımak" }, 1));
        questions.Add(new Question("Kuvvet ve hareket ilişkisini gösteren yasa nedir?", new string[] { "Newton'un 1. Yasası", "Newton'un 2. Yasası", "Newton'un 3. Yasası", "Termodinamiğin 1. Yasası" }, 1));
        questions.Add(new Question("Dinamometre ne ölçer?", new string[] { "Hacim", "Kuvvet", "Kütle", "Hız" }, 1));
        questions.Add(new Question("50 kg olan bir cismin ağırlığı yaklaşık kaç Newton'dur?", new string[] { "50", "100", "250", "500" }, 1));
        questions.Add(new Question("Kuvvetin etkisi olmayan durum hangisidir?", new string[] { "Hızlandırmak", "Yön değiştirmek", "Şekil değiştirmek", "Kütleyi değiştirmek" }, 3));
        questions.Add(new Question("Yükseklik arttıkça potansiyel enerji nasıl değişir?", new string[] { "Azalır", "Artar", "Değişmez", "Sabit kalır" }, 1));
        questions.Add(new Question("Hangisi yenilenebilir enerji kaynağıdır?", new string[] { "Kömür", "Doğalgaz", "Petrol", "Güneş" }, 3));
        questions.Add(new Question("Kuvvetin yaptığı iş hangi birimle ölçülür?", new string[] { "Joule", "Newton", "Watt", "Pascal" }, 0));
        questions.Add(new Question("Hangisi hareket enerjisi ile ilgilidir?", new string[] { "Hızla ilgili değil", "Kütleye bağlıdır", "Yüksekliğe bağlıdır", "Kütle çekimine bağlıdır" }, 1));
        questions.Add(new Question("Yay sıkıştırıldığında hangi enerji depolanır?", new string[] { "Kinetik", "Potansiyel", "Termal", "Kimyasal" }, 1));
        questions.Add(new Question("Hangi durumda yerçekimi kuvveti en azdır?", new string[] { "Ekvator", "Kuzey Kutbu", "Deniz seviyesi", "Dağ zirvesi" }, 3));
        questions.Add(new Question("Hangi durumda cisim hem kinetik hem potansiyel enerjiye sahiptir?", new string[] { "Binanın tepesinde duran", "Yukarı atılan top", "Hareket etmeyen taş", "Sabit yay" }, 1));
        questions.Add(new Question("Çekim potansiyel enerjisi neye bağlıdır?", new string[] { "Kütle ve yükseklik", "Hız ve kütle", "Hacim ve yoğunluk", "Hız ve ivme" }, 0));
    }

    private void SelectRandomQuestions(int count)
    {
        System.Random rng = new System.Random();
        selectedQuestions = questions.OrderBy(a => rng.Next()).Take(count).ToList();
        questionNumber = 1;
        questionIndex = 0;
        isWaitingForNext = false;
    }

    private void DisplayQuestion()
    {
        if (questionIndex < 5)
        {
            currentQuestion = selectedQuestions[questionIndex];
            questionText.text = currentQuestion.QuestionText;
            for (int i = 0; i < optionTexts.Length; i++)
            {
                optionTexts[i].text = currentQuestion.Options[i];
                Button btn = optionTexts[i].GetComponentInParent<Button>();

                if (!originalButtonColors.ContainsKey(btn))
                {
                    originalButtonColors[btn] = btn.colors;
                }

                btn.onClick.RemoveAllListeners();
                int captureIndex = i;
                btn.onClick.AddListener(() => Answer(captureIndex));
            }
            timeLeft = 60f;
            remainQuestionText.text = "Soru " + questionNumber++ + "/5";
        }
        else
        {
            questionText.text = "Quiz Tamamlandı!";
            EndQuiz();
        }
    }

    private void Answer(int index)
    {
        if (isWaitingForNext) return;

        isWaitingForNext = true;
        Button btn = optionTexts[index].GetComponentInParent<Button>();
        ColorBlock cb = btn.colors;

        if (index == currentQuestion.CorrectAnswerIndex)
        {
            questionText.text = "Doğru!";
            cb.normalColor = Color.green;
            cb.selectedColor = Color.green;
            Score += 10;
        }
        else
        {
            questionText.text = "Yanlış! Doğru Cevap: " + currentQuestion.Options[currentQuestion.CorrectAnswerIndex];
            cb.normalColor = Color.red;
            cb.selectedColor = Color.red;
        }

        btn.colors = cb;
        questionCoroutine = StartCoroutine(WaitAndShowNext(1));
    }

    IEnumerator WaitAndShowNext(float waitTime)
    {
        float countdown = waitTime;
        while (countdown > 0)
        {
            timeText.text = Mathf.Ceil(countdown).ToString() + " s içinde Yeni Soruya Geçiliyor";
            yield return new WaitForSeconds(1); 
            countdown -= 1; 
        }

        if (questionIndex < selectedQuestions.Count - 1)
        {
            questionIndex++;
            ResetButtonColors();
            DisplayQuestion();
        }
        else
        {
            EndQuiz();
        }

        isWaitingForNext = false;
    }

    private void ResetButtonColors()
    {
        foreach (TMP_Text optionText in optionTexts)
        {
            Button btn = optionText.GetComponentInParent<Button>();
            if (originalButtonColors.ContainsKey(btn))
            {
                btn.colors = originalButtonColors[btn];
            }
        }
    }

    public void PassQuestion()
    {
        questionText.text = "Yeni Soruya Geçiliyor!";
        if (questionCoroutine != null)
            StopCoroutine(questionCoroutine);
        questionCoroutine = StartCoroutine(WaitAndShowNext(1));
    }

    private void EndQuiz()
    {
        isEnd = true;
        isWaitingForNext = true;
        foreach (var option in optionTexts)
        {
            option.text = "";
            option.GetComponentInParent<Button>().gameObject.SetActive(false);
        }
        passButton.gameObject.SetActive(false);
        timeText.text = "";
        remainQuestionText.text = "";
        restartButton.SetActive(true);
        GameManager.Instance.SetScore(Score);
        StopAllCoroutines();
        questionText.text = "Quiz Tamamlandı!" +
            "\nQuizi Tekrar Çözmek İstersen Yeniden Başlatabilirsin.";
    }
}
