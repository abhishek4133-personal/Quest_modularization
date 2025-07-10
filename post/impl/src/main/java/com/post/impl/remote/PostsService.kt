package com.post.impl.remote

import com.post.impl.model.PostsResponse
import com.post.impl.model.UsersResponse
import retrofit2.http.GET

interface PostsService {

    @GET("posts")
    suspend fun getPosts(): PostsResponse

    @GET("users")
    suspend fun getUsers(): UsersResponse

}