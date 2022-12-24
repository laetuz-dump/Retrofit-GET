package com.neotica.retrofitget

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.neotica.retrofitget.model.Post
import com.neotica.retrofitget.repository.Repository
import kotlinx.coroutines.launch

//Step 23: Extends ViewModel()
//Step 24: Pass the parameter of the class to repository.
class MainViewModel(private val repository: Repository) : ViewModel() {
    //Step 27: Create a new variable for the response checker.
    //It will have a type of mutable livedata of our Post class.
    val myResponse: MutableLiveData<Post> = MutableLiveData()

    //Step 25: Create a new function named getPost.
    fun getPost() {
        //Step 26: Call ViewModelScope to launch coroutines.
        viewModelScope.launch {
            //Step 28: Pass the response in a new variable named response.
            //The Post class is the data class, the Repository class will function as the Retrofit's Post.
            val response:Post = repository.getPost()
            //Step 29: Pass the response to our mutable live object. myResponse.
            //Later we are going to use the mutablelivedata and observe it from the MainActivity.
            myResponse.value = response
        }
    }
}