package com.post.model

import android.annotation.SuppressLint
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.Serializable

typealias PostsResponse = List<PostsResponseItem>

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class PostsResponseItem(
    val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)
