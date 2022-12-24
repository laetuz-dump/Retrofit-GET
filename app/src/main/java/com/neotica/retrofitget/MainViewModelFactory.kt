package com.neotica.retrofitget

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.neotica.retrofitget.repository.Repository

//Step 30: Create a new class named MainViewModelFactory. Extends ViewModelProvider.Factory.
//Step 31: Specify the parameter of the class to the Repository class.
class MainViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    //Step 32: Override function to T ViewModel class. return to MainViewModel(repository).
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}