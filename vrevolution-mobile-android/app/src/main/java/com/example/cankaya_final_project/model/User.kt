package com.example.cankaya_final_project.model

data class User(    //user data classı
    val username: String,
    val email: String,
    val password: String
)

data class LoginUser(
    val email: String,
    val password: String
)

data class UserResponse( // dönen response data classı verileri
    val message: String,
    val validationErrors: Map<String, String>?
)