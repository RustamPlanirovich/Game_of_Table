package com.example.gameoftable.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gameoftable.R
import com.example.gameoftable.viewmodel.PurchaseViewModel

class PurchaseFragment : Fragment() {

    companion object {
        fun newInstance() = PurchaseFragment()
    }

    private lateinit var viewModel: PurchaseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.purchase_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PurchaseViewModel::class.java)
        // TODO: Use the ViewModel
    }

}