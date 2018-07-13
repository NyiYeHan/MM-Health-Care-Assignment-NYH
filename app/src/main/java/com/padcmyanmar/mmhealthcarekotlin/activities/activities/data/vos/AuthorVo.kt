package com.padcmyanmar.mmhealthcare.data.vos

import com.google.gson.annotations.SerializedName

class AuthorVo {
    @SerializedName("author-id")
    var authorId : Long = 0

    @SerializedName("author-name")
    var authorName : String = ""

    @SerializedName("author-picture")
    var authorPicture : String = ""
}