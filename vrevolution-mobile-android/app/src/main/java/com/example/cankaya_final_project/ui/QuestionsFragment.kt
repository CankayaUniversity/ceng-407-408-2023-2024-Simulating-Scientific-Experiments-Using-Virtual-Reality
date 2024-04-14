package com.example.cankaya_final_project.ui

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import com.airbnb.lottie.LottieAnimationView
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.databinding.FragmentQuestionsBinding
import com.example.cankaya_final_project.api.RetrofitClient
import com.example.cankaya_final_project.model.Questions
import com.example.cankaya_final_project.ui.QuestionsFragmentDirections
import com.example.cankaya_final_project.ui.quizUi.QuizResultsFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class QuestionsFragment : Fragment() {

    private lateinit var binding: FragmentQuestionsBinding
    private lateinit var currentQuizQuestions: List<Questions>
    private var currentQuestionIndex = 0  // ilk soruyu getirir.
    private var quizScore = 0
    private var lastSelectedOptionIsCorrect: Boolean? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val testId = arguments?.getString("testId") ?: return
        showQuestion(testId)
        binding.continueButton.setOnClickListener {
            onContinueClicked()
        }

        // Geri tuşu basıldığında özel davranışı tanımla
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            Toast.makeText(context, "Soruları gördükten sonra geri dönemezsiniz.", Toast.LENGTH_SHORT).show()
        }
    }


    //withContecxt methodu threadler arası geçiş yapmayaı sağlar
    //yani IO thread inde çalışırken  main thread e geçiş yapmayı sağlar
    private fun showQuestion(testId: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = RetrofitClient.userService.getQuestions(testId)
                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        currentQuizQuestions = response.body() ?: emptyList()
                        if (currentQuizQuestions.isNotEmpty()) {
                            displayCurrentQuestion()
                        }
                    } else {
                        Toast.makeText(context, "Sorular yüklenemedi: ${response.message()}", Toast.LENGTH_SHORT).show()
                    }
                }
            } catch (e: Throwable) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Hata: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }



    private fun displayCurrentQuestion() {
        val currentQuestion = currentQuizQuestions[currentQuestionIndex]
        binding.questionText.text = currentQuestion.text
        val buttons = listOf(
            binding.optionA,
            binding.optionB,
            binding.optionC,
            binding.optionD
        )

        buttons.forEachIndexed { index, button ->
            // Yeni soru için butonların arka planını text_border tasarımına döndür
            button.setBackgroundResource(R.drawable.text_border)
            val option = currentQuestion.options[index]
            button.text = option.text
            button.setOnClickListener {
                highlightSelection(button, option.isCorrect)
            }
        }
    }


    private fun highlightSelection(selectedButton: Button, isCorrect: Boolean) {
        val buttons = listOf(
            binding.optionA,
            binding.optionB,
            binding.optionC,
            binding.optionD
        )

        // Tüm butonların arka planını orijinal tasarımına döndür
        buttons.forEach { button ->
            button.setBackgroundResource(R.drawable.text_border)
        }

        // Yalnızca seçilen butonun arka plan rengini değiştir
        selectedButton.setBackgroundColor(Color.YELLOW)

        lastSelectedOptionIsCorrect = isCorrect
    }





    private fun onContinueClicked() {
        if (lastSelectedOptionIsCorrect == true) {
            quizScore++ // Continue'a basıldığında, son seçilen seçenek doğruysa skoru artır
        }

        if (::currentQuizQuestions.isInitialized) {
            binding.progressIndicator.progress = ((currentQuestionIndex + 1).toFloat() / currentQuizQuestions.size * binding.progressIndicator.max).toInt()

            if (currentQuestionIndex < currentQuizQuestions.size - 1) {
                currentQuestionIndex++
                displayCurrentQuestion()
                lastSelectedOptionIsCorrect = null

                if (currentQuestionIndex == currentQuizQuestions.size - 1) {
                    binding.continueButton.text = "Finish"
                }
            } else if (currentQuestionIndex == currentQuizQuestions.size - 1) {
                showCongratulationsDialog()
            }
        } else {
            Toast.makeText(context, "Sorular henüz yüklenmedi.", Toast.LENGTH_SHORT).show()
        }
    }





    //cevap anahtarı sayfası için kullanıbilir

    private fun generateResultsString(): String {
        val resultsStringBuilder = StringBuilder()
        currentQuizQuestions.forEachIndexed { index, question ->
            val questionNumber = index + 1 // Soru numarasını 1'den başlatmak için
            val correctOption = question.options.firstOrNull { it.isCorrect }?.text ?: "Doğru cevap bulunamadı"
            resultsStringBuilder.append("${questionNumber}. Soru: ${question.text}\nDoğru cevap: $correctOption\n\n")
        }
        return resultsStringBuilder.toString()
    }




    private fun navigateToResultsFragment(){
        Toast.makeText(context, "Sonuçlar sayfasına yönlendiriliyorsunuz...", Toast.LENGTH_SHORT).show()
        val resultsString = generateResultsString()
        val quizResultsFragment = QuizResultsFragment().apply {
            arguments = Bundle().apply {
                putString("resultsString", resultsString)
                putInt("quizScore", quizScore)
            }
        }
        // QuizResultsFragment'a doğrudan geçiş yapma
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, quizResultsFragment)
            .addToBackStack(null)
            .commit()
    }


    private fun showCongratulationsDialog() {
        val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_congratulations, null)
        val lottieAnimationView = dialogView.findViewById<LottieAnimationView>(R.id.animation_view)
        lottieAnimationView.setAnimation(R.raw.quizdoneanimation)
        lottieAnimationView.playAnimation()

        val tvScore = dialogView.findViewById<TextView>(R.id.tvScore)
        tvScore.text = "Skorunuz: $quizScore"


        AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .setPositiveButton("Tamam") { _, _ ->
                // Dialog kapandığında, doğrudan Fragment'tan findNavController() çağrısı yapın.
                try {
                    navigateToResultsFragment()
                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(context, "Navigasyon hatası!", Toast.LENGTH_SHORT).show()
                }
            }
            .show()
    }



}