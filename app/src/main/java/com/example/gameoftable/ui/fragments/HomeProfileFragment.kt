package com.example.gameoftable.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gameoftable.R
import com.example.gameoftable.viewmodel.HomeProfileViewModel

class HomeProfileFragment : Fragment() {

    companion object {
        fun newInstance() = HomeProfileFragment()
    }

    private lateinit var viewModel: HomeProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}