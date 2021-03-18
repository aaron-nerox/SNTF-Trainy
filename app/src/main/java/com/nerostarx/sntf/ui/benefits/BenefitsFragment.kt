package com.nerostarx.sntf.ui.benefits

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nerostarx.sntf.R

class BenefitsFragment : Fragment() {

    companion object {
        fun newInstance() = BenefitsFragment()
    }

    private lateinit var viewModel: BenefitsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_benefits, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BenefitsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}