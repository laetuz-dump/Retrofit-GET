package com.neotica.retrofitget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.neotica.retrofitget.repository.Repository

class MainActivity : AppCompatActivity() {
    //Step 33: Initialize ViewModel late init
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step 34: Initialize Repository
        val repository = Repository()
        //Step 35: Initialize ViewModelFactory and pass repository as the parameter.
        val viewModelFactory = MainViewModelFactory(repository)
        //Step 36: Initialize ViewModel from viewModelFactory and pass it to MainViewModel.
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        //Step 37: Call getPost() function from MainViewModel
        viewModel.getPost()
        //Step 38: Observe the mutable livedata object and parse the result
        viewModel.myResponse.observe(this, Observer {
            //Step 39: Declare the response as Log.d containing the content of the JSON body
                response ->
            Log.d("Response", response.userId.toString())
            Log.d("Response", response.id.toString())
            Log.d("Response", response.title)
            Log.d("Response", response.body)
        })
    }
}