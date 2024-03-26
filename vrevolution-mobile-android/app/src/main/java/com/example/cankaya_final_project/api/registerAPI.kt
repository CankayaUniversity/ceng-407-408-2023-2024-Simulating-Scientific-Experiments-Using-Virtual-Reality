package com.example.cankaya_final_project.api
import com.example.cankaya_final_project.model.AchievementResponse
import com.example.cankaya_final_project.model.LoginUser
import com.example.cankaya_final_project.model.Questions
import com.example.cankaya_final_project.model.User
import com.example.cankaya_final_project.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface UserService {
    @POST("api/v1/users")//endpoint
    suspend fun createUser(@Body userData: User): Response<UserResponse> // body ye data class user ı gönderir.ve Userresponse döner.

    @POST("api/v1/auth")
    suspend fun loginUser(@Body userLogin: LoginUser): Response<UserResponse>

    //Quizzes
    @GET("api/questions/{testId}")
    suspend fun getQuestions(@Path("testId") testId: String):  Response<List<Questions>>

    @GET("api/achievements/{achievementId}")
    suspend fun getAchievements(@Path("achievementId") achievementId: String): Response<AchievementResponse>


}




