package com.example.myapplication.networking

import com.example.myapplication.model.ForgotPasswordResponse
import com.example.myapplication.model.LoginResponse
import com.example.myapplication.model.LogoutResponse
import com.example.myapplication.views.forgotpass.ForgotPasswordRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface LiveAttendanceApiServices {

    @Headers("Accept: application/json", "Content-Type: application/json")
    @POST("auth/login")
    fun loginRequest(@Body body: String): Call<LoginResponse>

    @Headers("Accept: application/json", "Content-Type: application/json")
    @POST("auth/password/forgot")
    fun forgotPasswordRequest(@Body body: String): Call<ForgotPasswordResponse>
}




