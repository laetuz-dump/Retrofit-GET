package com.neotica.retrofitget.api

import com.neotica.retrofitget.model.Post
import retrofit2.http.GET

interface SimpleApi {
    //Step 6: Create a GET function
    @GET
    //Step 7: Specify the value
        ("posts/1")
    //Step 8: Suspend because we are going to use Kotlin coroutines at the ViewModel.
    //The suspend function will return a Post.
    suspend fun getPost(): Post
}