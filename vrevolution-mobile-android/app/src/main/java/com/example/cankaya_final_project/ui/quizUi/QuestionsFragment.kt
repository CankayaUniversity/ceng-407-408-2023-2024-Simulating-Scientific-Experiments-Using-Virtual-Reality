package com.example.cankaya_final_project.ui.quizUi

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.databinding.FragmentQuestionsBinding
import com.example.cankaya_final_project.api.RetrofitClient
import com.example.cankaya_final_project.model.Questions
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

        // Soruların yüklenip yüklenmediğini kontrol et
        if (::currentQuizQuestions.isInitialized) {
            // ProgressBar'ı her durumda güncelle
            binding.progressIndicator.progress = ((currentQuestionIndex + 1).toFloat() / currentQuizQuestions.size * binding.progressIndicator.max).toInt()

            if (currentQuestionIndex < currentQuizQuestions.size - 1) {
                currentQuestionIndex++
                displayCurrentQuestion()
                lastSelectedOptionIsCorrect = null

                // Eğer sonraki soru son soruysa, buton metnini "Finish" olarak güncelle
                if (currentQuestionIndex == currentQuizQuestions.size - 1) {
                    binding.continueButton.text = "Finish"
                }
            } else if (currentQuestionIndex == currentQuizQuestions.size - 1) {
                // Son soruda ve "Finish" butonuna basıldığında skoru göster
                Toast.makeText(context, "Test bitti. Skorunuz: $quizScore", Toast.LENGTH_SHORT).show()
                lastSelectedOptionIsCorrect = null
            }
        } else {
            Toast.makeText(context, "Sorular henüz yüklenmedi.", Toast.LENGTH_SHORT).show()
        }
    }







}