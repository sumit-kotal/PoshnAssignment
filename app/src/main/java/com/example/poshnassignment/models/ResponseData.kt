package com.example.poshnassignment.models

import com.google.gson.annotations.SerializedName

data class ResponseData (

    @SerializedName("data") val data : List<GiphyMain>,
    @SerializedName("pagination") val pagination : Pagination,
    @SerializedName("meta") val meta : Meta
)