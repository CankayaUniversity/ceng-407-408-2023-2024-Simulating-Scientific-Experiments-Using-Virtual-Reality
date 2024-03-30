package com.example.cankaya_final_project.ui.quizUi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.adapters.UnitTestAdapter
import com.example.cankaya_final_project.databinding.FragmentQuestionsBinding
import com.example.cankaya_final_project.databinding.FragmentQuizBinding


class QuizFragment : Fragment() {

    private lateinit var binding: FragmentQuizBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.class5button.setOnClickListener{
            navigateToQuizDetails("5")
        }

        binding.class6button.setOnClickListener{
            navigateToQuizDetails("6")
        }

        binding.class7button.setOnClickListener{
            navigateToQuizDetails("7")
        }

    }


    fun navigateToQuizDetails(classType: String) {
        val quizDetailsFragment = QuizDetailsFragment().apply {
            arguments = Bundle().apply {
                putString("classType", classType)
            }
        }

        // FragmentTransaction ile QuizDetailsFragment'e geçiş yapılıyor.
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment, quizDetailsFragment) // 'fragment_container' ana aktivitenizin içerisindeki FrameLayout'un ID'si olmalıdır.
            addToBackStack(null) // Bu, kullanıcının geri tuşuna bastığında önceki fragment'a dönmesini sağlar.
            commit() // Değişiklikleri uygula
        }
    }








}