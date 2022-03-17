package com.example.poshnassignment.models



import com.google.gson.annotations.SerializedName

data class GifModel(
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("bitly_gif_url")
    val bitlyGifUrl: String? = null,
    @SerializedName("bitly_url")
    val bitlyUrl: String? = null,
    @SerializedName("embed_url")
    val embedUrl: String? = null,
    @SerializedName("username")
    val username: String? = null,
    @SerializedName("source")
    val source: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("rating")
    val rating: String? = null,
    @SerializedName("content_url")
    val contentUrl: String? = null,
    @SerializedName("source_tld")
    val sourceTld: String? = null,
    @SerializedName("source_post_url")
    val sourcePostUrl: String? = null,
    @SerializedName("is_sticker")
    val isSticker: Int? = null,
    @SerializedName("import_datetime")
    val importDatetime: String? = null,
    @SerializedName("trending_datetime")
    val trendingDatetime: String? = null
)

data class PaginationModel(
    @SerializedName("offset")
    val offset: Int?,
    @SerializedName("total_count")
    val totalCount: Int?,
    @SerializedName("count")
    val count: Int?
)


data class UserModel(
    @SerializedName("avatar_url")
    var avatarUrl: String?  = null,
    @SerializedName("banner_image")
    var bannerImage: String?  = null,
    @SerializedName("banner_url")
    var bannerUrl: String?  = null,
    @SerializedName("profile_url")
    var profileUrl: String?  = null,
    @SerializedName("username")
    var username: String?  = null,
    @SerializedName("display_name")
    var displayName: String?  = null,
    @SerializedName("description")
    var description: String?  = null,
    @SerializedName("instagram_url")
    var instagramUrl: String?  = null,
    @SerializedName("website_url")
    var websiteUrl: String?  = null,
    @SerializedName("is_verified")
    var isVerified: Boolean? = null
)



