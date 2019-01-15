package com.sunnat629.clientside.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class Post(
    @SerializedName("id") var postId: Long?,
    @SerializedName("text") var text: String?,
    @SerializedName("postedBy") var profile: Profile?,
    @SerializedName("postCreatedTime") var postCreatedTime: Date?,
    @SerializedName("comments") var comment: ArrayList<Comment>?,
    @SerializedName("likes") var likes: ArrayList<Like>?
)