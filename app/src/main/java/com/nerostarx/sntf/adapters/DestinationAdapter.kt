package com.nerostarx.sntf.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.sntf.R

class DestinationAdapter(val navController: NavController)
    : RecyclerView.Adapter<DestinationAdapter.DestinationHolder>() {


    class DestinationHolder(inflater: LayoutInflater, parent: ViewGroup):
            RecyclerView.ViewHolder(inflater
                    .inflate(R.layout.destination_item, parent, false))
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DestinationHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {

    }

    override fun getItemCount(): Int = 6

}