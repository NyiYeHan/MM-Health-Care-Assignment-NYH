package com.padcmyanmar.mmhealthcarekotlin.activities.activities.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.mmhealthcare.data.vos.HealthCareVo

class GetInfoResponse {
    @SerializedName("code")
    var code: Int = 0

    @SerializedName("message")
    var message: String = ""

    @SerializedName("healthcare-info")
    var healthCareVo: List<HealthCareVo>? = null
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    fun isResponseOk(): Boolean{
        return (code == 200 && healthCareVo != null)
    }

    fun getNewsList(): List<HealthCareVo> {
        if (healthCareVo == null) {
            healthCareVo = java.util.ArrayList<HealthCareVo>()
        }
        val infoListVal = healthCareVo
        return infoListVal!!
    }

}