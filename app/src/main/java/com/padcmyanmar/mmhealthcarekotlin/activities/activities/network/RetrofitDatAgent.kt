package com.padcmyanmar.mmhealthcarekotlin.activities.activities.network

import com.padcmyanmar.mmhealthcarekotlin.activities.activities.events.ErrorEvent
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.events.SuccessGetInfoEvent
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.network.responses.GetInfoResponse
import okhttp3.OkHttpClient
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitDatAgent private constructor() {


    companion object {
        private var obj: RetrofitDatAgent? = null
        fun getObj(): RetrofitDatAgent {

            if (obj == null) {
                obj = RetrofitDatAgent()
            }
            var i = obj
            return i!!

        }
    }

    private val mHealthCareApi: HealthCareApi

    init {
        val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build()
        val retrofit = Retrofit.Builder()
                .baseUrl("http://padcmyanmar.com/padc-5/mm-healthcare/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        mHealthCareApi = retrofit.create(HealthCareApi::class.java)
    }

    fun loadHealthCareInfo(accessToken: String) {
        var infoResponseCall = mHealthCareApi.loadHealthCareList(accessToken)
        infoResponseCall.enqueue(object : Callback<GetInfoResponse> {

            override fun onFailure(call: Call<GetInfoResponse>?, t: Throwable?) {
                EventBus.getDefault().post(ErrorEvent.ApiErrorEvent(t))
            }

            override fun onResponse(call: Call<GetInfoResponse>?, response: Response<GetInfoResponse>) {
                val healthCareResponse: GetInfoResponse? = response.body()
                if (healthCareResponse != null && healthCareResponse.isResponseOk()) {
                    val event = SuccessGetInfoEvent.HealthCareInfoLoadedEvent(healthCareResponse.healthCareVo!!)
                    EventBus.getDefault().post(event)

                }


            }
        })

    }

}