package com.padcmyanmar.mmhealthcarekotlin.activities.activities.network

import com.padcmyanmar.mmhealthcarekotlin.activities.activities.network.responses.GetInfoResponse
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.utils.HealthCareConstants
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface HealthCareApi {
    @FormUrlEncoded
    @POST("GetHealthcareInfo.php")
    fun loadHealthCareList(@Field("access_token") accessToken: String): Call<GetInfoResponse>
}