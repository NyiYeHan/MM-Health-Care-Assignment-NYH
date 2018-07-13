package com.padcmyanmar.mmhealthcare.data.vos

import com.google.gson.annotations.SerializedName

class DoctorVo {
    @SerializedName("doctor-id")
    var doctorId: String = ""

    @SerializedName("doctor-name")
    var doctorName: String = ""

    @SerializedName("title")
    var title: String = ""

    @SerializedName("speciality")
    var speciality: SpecialityVo? = null

    @SerializedName("time-slots")
    var timeSlots: List<TimeSlotVo>? = null
        get() {
            return if (field == null)
                return ArrayList()
            else
                field
        }
}