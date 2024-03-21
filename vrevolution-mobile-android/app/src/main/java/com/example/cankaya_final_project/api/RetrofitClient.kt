package com.example.cankaya_final_project.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://vrevolution.azurewebsites.net/" // endpointsiz olan base url .

    val userService: UserService by lazy {  // base url ile bir retrofit objesi oluşturur ve localhosta bağlanmak için bu obje üzerinden işlem yapılır.
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserService::class.java)
    }
}
