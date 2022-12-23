package com.neotica.retrofitget.repository

import com.neotica.retrofitget.api.RetrofitInstance
import com.neotica.retrofitget.model.Post

class Repository {
    //Step 21: Create a new suspend function that returns Post.
    //This is our Post function in the application.
    suspend fun getPost(): Post {
        //Step 22: Return and Call the RetrofitInstance
        //Get the reference of this api
        //Get the reference of the getPost function.
        return RetrofitInstance.api.getPost()
    }
}