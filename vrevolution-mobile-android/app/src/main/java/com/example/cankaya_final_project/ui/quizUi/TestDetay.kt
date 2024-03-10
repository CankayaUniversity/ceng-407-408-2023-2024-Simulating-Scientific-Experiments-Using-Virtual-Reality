package com.example.cankaya_final_project.ui.quizUi
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TestDetay(
    val test_id:String,
    val achievement_id:String,
    val title: String,
    val subject_title: String,
    val questionCount: String,
    val level: String
):Parcelable