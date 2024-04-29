package com.example.cankaya_final_project.ui.quizUi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.databinding.FragmentQuizResultsBinding

class QuizResultsFragment : Fragment() {

    private lateinit var binding: FragmentQuizResultsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuizResultsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val results = arguments?.getString("resultsString") ?: "Sonuçlar yüklenemedi"
        val quizScore = arguments?.getInt("quizScore") ?: 0

        binding.tvQuizResults.text = results
        binding.tvQuizScore.text = getString(R.string.score_template, quizScore)


        binding.btnRestartQuiz.setOnClickListener{
         //   findNavController().navigate(R.id.action_quizResultsFragment_to_quizFragment);
        }
    }

}
