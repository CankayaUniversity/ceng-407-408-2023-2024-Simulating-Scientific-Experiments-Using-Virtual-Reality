package com.example.cankaya_final_project.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.api.RetrofitClient
import com.example.cankaya_final_project.api.UserService
import com.example.cankaya_final_project.model.AchievementResponse
import kotlinx.coroutines.launch

class AchievementDialogFragment : DialogFragment() {

    private var achievementId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            achievementId = it.getString("achievementId")
        }
    }
    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.90).toInt() // Ekran genişliğinin %'i
        dialog?.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achievement_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvAchievements = view.findViewById<TextView>(R.id.tvAchievements)
        val btnClose = view.findViewById<ImageButton>(R.id.btnClose)

        btnClose.setOnClickListener {
            dismiss()  // Dialog'u kapat
        }

        achievementId?.let {
            fetchAchievements(it) { achievements ->
                tvAchievements.text = formatAchievements(achievements) // Format this as needed
            }
        }
    }

    private fun fetchAchievements(achievementId: String, callback: (AchievementResponse?) -> Unit) {
        val apiService = RetrofitClient.userService

        lifecycleScope.launch {
            try {
                val response = apiService.getAchievements(achievementId)
                if (response.isSuccessful && response.body() != null) {
                    callback(response.body())
                } else {
                    // Handle the case where the response is unsuccessful
                    callback(null)
                }
            } catch (e: Exception) {
                // Handle any exceptions that might occur during the network request
                callback(null)
            }
        }
    }




    companion object {
        fun newInstance(achievementId: String) = AchievementDialogFragment().apply {
            arguments = Bundle().apply {
                putString("achievementId", achievementId)
            }
        }
    }

    private fun formatAchievements(achievements: AchievementResponse?): String {
        return achievements?.let { ach ->
            listOf(
                ach.topic1 to listOfNotNull(ach.topic1Achievement1, ach.topic1Achievement2, ach.topic1Achievement3),
                ach.topic2 to listOfNotNull(ach.topic2Achievement1, ach.topic2Achievement2, ach.topic2Achievement3),
                ach.topic3 to listOfNotNull(ach.topic3Achievement1, ach.topic3Achievement2, ach.topic3Achievement3)
            ).mapNotNull { (topic, achievementList) ->
                if (achievementList.isNotEmpty()) {
                    val separator = "-".repeat(topic.length+2)
                    val achievementsFormatted = achievementList.mapIndexed { index, achievement ->
                        "${index + 1}. $achievement"
                    }.joinToString("\n")

                    """
                |$topic
                |$separator
                |$achievementsFormatted
                """.trimMargin()
                } else null
            }.joinToString("\n\n\n").takeIf { it.isNotBlank() }
        } ?: "Başarımlar yüklenemedi."
    }




}
