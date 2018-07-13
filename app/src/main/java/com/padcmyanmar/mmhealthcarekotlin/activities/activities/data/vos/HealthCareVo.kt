package com.padcmyanmar.mmhealthcare.data.vos

import com.google.gson.annotations.SerializedName

class HealthCareVo {

    @SerializedName("id")
    var healthId: Long = 0

    @SerializedName("title")
    var title: String = ""

    @SerializedName("image")
    var image: String = ""

    @SerializedName("author")
    var author : AuthorVo? = null
    get() {
        return if (field == null)
            AuthorVo()
        else
            field
    }

    @SerializedName("short-description")
    var shortDescription : String = ""

    @SerializedName("published-date")
    var publishedDate : String = ""

    @SerializedName("complete-url")
    var completeUrl : String = ""
}