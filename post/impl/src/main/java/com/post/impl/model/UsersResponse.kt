package com.post.impl.model

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

typealias UsersResponse = List<UsersResponseItem>

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class UsersResponseItem(
    val id: Int,
    val name: String
)