package com.example.myapplication.networking

object ApiServices {
    fun getLiveAttendanceServices(): LiveAttendanceApiServices{
        return RetrofitClient
            .getClient()
            .create(LiveAttendanceApiServices::class.java)
    }
}