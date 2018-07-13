package com.padcmyanmar.mmhealthcare.data.vos

import com.google.gson.annotations.SerializedName

class TimeSlotVo {
    @SerializedName("time-slot-id")
    var timeSlotId: String = ""

    @SerializedName("time")
    var time: String = ""

    @SerializedName("date")
    var date: String = ""
}