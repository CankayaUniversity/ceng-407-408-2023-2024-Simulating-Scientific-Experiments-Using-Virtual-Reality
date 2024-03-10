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
        return achievements?.let {
            """
            ${it.topic1}
            1. ${it.topic1Achievement1}
            2. ${it.topic1Achievement2}
            3. ${it.topic1Achievement3}

            ${it.topic2}
            1. ${it.topic2Achievement1}
            2. ${it.topic2Achievement2}
            3. ${it.topic2Achievement3}
            
            
             ${it.topic3}
            1. ${it.topic3Achievement1}
            2. ${it.topic3Achievement2}
            3. ${it.topic3Achievement3}


            """.trimIndent()
        } ?: "Başarımlar yüklenemedi."
    }



}
