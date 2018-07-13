package com.padcmyanmar.mmhealthcarekotlin.activities.activities.events

import com.padcmyanmar.mmhealthcare.data.vos.HealthCareVo

class SuccessGetInfoEvent {

    class HealthCareInfoLoadedEvent(val healthInfo: List<HealthCareVo>)
}