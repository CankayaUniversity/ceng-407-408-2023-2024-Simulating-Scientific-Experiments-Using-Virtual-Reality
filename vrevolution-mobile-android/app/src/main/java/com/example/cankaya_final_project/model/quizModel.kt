package com.example.cankaya_final_project.model

data class Questions(
    val index: Double,//sorunun id indexi
    val text: String,//sorunun texti
    val options: List<Option>//sorunun şıkları
)

data class Option(
    val option_id: String,
    val text: String,
    val isCorrect: Boolean
)

