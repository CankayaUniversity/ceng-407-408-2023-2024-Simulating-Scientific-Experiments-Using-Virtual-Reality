package com.example.cankaya_final_project.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://10.0.2.2:8080/api/" // endpointsiz olan base url .

    val userService: UserService by lazy {  // base url ile bir retrofit objesi oluşturur ve localhosta bağlanmak için bu obje üzerinden işlem yapılır.
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserService::class.java)
    }
}
