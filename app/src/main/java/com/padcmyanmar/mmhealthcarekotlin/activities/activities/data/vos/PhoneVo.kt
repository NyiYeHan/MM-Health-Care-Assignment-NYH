package com.padcmyanmar.mmhealthcare.data.vos

import com.google.gson.annotations.SerializedName

class PhoneVo {
    @SerializedName("phone-id")
    var phoneId : String = ""

    @SerializedName("phone-name")
    var phoneName : String = ""
}