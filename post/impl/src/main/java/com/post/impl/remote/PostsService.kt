package com.post.impl.remote

import retrofit2.http.GET

interface PostsService {

    @GET("posts")
    suspend fun getPosts(): PostsResponse

    @GET("users")
    suspend fun getUsers(): UsersResponse

}