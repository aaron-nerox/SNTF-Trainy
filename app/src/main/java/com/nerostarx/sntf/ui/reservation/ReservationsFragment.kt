package com.nerostarx.sntf.ui.reservation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nerostarx.sntf.R

class ReservationsFragment : Fragment() {

    companion object {
        fun newInstance() = ReservationsFragment()
    }

    private lateinit var viewModel: ReservationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_reservations, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReservationsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}