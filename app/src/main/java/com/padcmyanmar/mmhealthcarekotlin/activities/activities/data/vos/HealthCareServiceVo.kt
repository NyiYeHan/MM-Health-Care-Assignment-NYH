package com.padcmyanmar.mmhealthcare.data.vos

import com.google.gson.annotations.SerializedName

class HealthCareServiceVo {
    @SerializedName("health-care-id")
    var healthCareId: String = ""

    @SerializedName("health-care-name")
    var healthCareName: String = ""

    @SerializedName("category")
    var category: String = ""

    @SerializedName("image")
    var image: String = ""

    @SerializedName("address")
    var address: String = ""

    @SerializedName("email")
    var email: String = ""

    @SerializedName("website")
    var website: String = ""

    @SerializedName("mapinfo")
    var mapinfo: String = ""

    @SerializedName("facebook")
    var facebook: String = ""

    @SerializedName("remark")
    var remark: String = ""

    @SerializedName("phones")
    var phones: PhoneVo? = null
        get() {
            return if (field == null)
                PhoneVo()
            else
                field
        }

    @SerializedName("fax")
    var fax: List<FaxVo>? = null
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("operations")
    var operations: List<Opeartionsvo>? = null
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("price-category")
    var priceCategory: Int = 0

    @SerializedName("available-doctors")
    var availableDoctors: List<DoctorVo> ? = null
}