package com.nerostarx.sntf.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.sntf.R

class NotificationAdapter(): RecyclerView.Adapter<NotificationAdapter.NotificationHolder>() {


    class NotificationHolder(inflater: LayoutInflater, parent: ViewGroup):
            RecyclerView.ViewHolder(inflater
                    .inflate(R.layout.notification_item, parent, false))
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NotificationHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {

    }

    override fun getItemCount(): Int = 6

}