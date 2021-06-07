package com.example.gameoftable.ui

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gameoftable.R
import com.example.gameoftable.databinding.ActivityMainBinding
import com.example.gameoftable.viewModelFactory.MainActivityViewModelFactory
import com.example.gameoftable.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        //Night mode enable always
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        //Add view model factory and passing the context MainViewModel
        viewModel = ViewModelProviders.of(
            this,
            MainActivityViewModelFactory(this.applicationContext)
        ).get(MainViewModel::class.java)

        binding.viewModel = viewModel

        val navController = findNavController(R.id.home_fragment)
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}