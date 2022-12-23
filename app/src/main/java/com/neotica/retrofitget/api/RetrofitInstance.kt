package com.neotica.retrofitget.api

import com.neotica.retrofitget.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    //Step 13: Create a new retrofit variable and pass it by lazy.
    private val retrofit by lazy {
        //Step 14: Initialize the builder
        Retrofit.Builder()
        //Step 15: Specify the base url from the Constants class.
            .baseUrl(BASE_URL)
        //Step 16: Add Converter factory to convert GSON
            .addConverterFactory(GsonConverterFactory.create())
        //Step 17: And build.
            .build()
    }

    //Step 18: Create one more variable named api and pass the type of our SimpleApi Dataclass.
    //Delegates it by lazy to initialize retrofit.
    val api: SimpleApi by lazy {
        //Step 19: Call Retrofit.create function on our Retrofit
        //Pass our SimpleApi DataClass Interface.
        retrofit.create()
    }
}