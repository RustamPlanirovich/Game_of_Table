package com.example.gameoftable.viewModelFactory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gameoftable.viewmodel.MainViewModel

class MainActivityViewModelFactory(private val application: Context?) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(application) as T
    }
}