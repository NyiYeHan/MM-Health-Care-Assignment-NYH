package com.padcmyanmar.mmhealthcarekotlin.activities.activities.data.models

import com.padcmyanmar.mmhealthcarekotlin.activities.activities.network.RetrofitDatAgent

class HealthCareModel private constructor() {
    companion object {
        private var obj: HealthCareModel? = null
        fun getObj(): HealthCareModel {
            if (obj == null) {
                obj = HealthCareModel()
            }
            var i = obj
            return i!!
        }
    }

    fun loadHealthcareInfo() {
        RetrofitDatAgent.getObj().loadHealthCareInfo("b002c7e1a528b7cb460933fc2875e916")
    }
}