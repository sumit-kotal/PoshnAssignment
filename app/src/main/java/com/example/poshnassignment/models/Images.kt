package com.example.poshnassignment.models

import com.google.gson.annotations.SerializedName

data class Images (
	@SerializedName("preview") val preview : Preview,
	@SerializedName("original_still") val original_still : Original_still,
)