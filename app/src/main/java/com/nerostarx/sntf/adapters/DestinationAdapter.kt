package com.nerostarx.sntf.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.nerostarx.sntf.R
import com.nerostarx.sntf.dialogs.ReservationDialog

class DestinationAdapter(val navController: NavController)
    : RecyclerView.Adapter<DestinationAdapter.DestinationHolder>() {


    class DestinationHolder(inflater: LayoutInflater, parent: ViewGroup):
            RecyclerView.ViewHolder(inflater
                    .inflate(R.layout.destination_item, parent, false))
    {
                val reserveButton: Button = itemView.findViewById(R.id.reserve)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DestinationHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {
        holder.reserveButton.setOnClickListener {
            //ReservationDialog.createReservationDialog(holder.itemView.context)
            val dialog = MaterialAlertDialogBuilder(holder.itemView.context)
                    .setView(R.layout.info_dialog)
                    .create()

            dialog.show()
        }
    }

    override fun getItemCount(): Int = 4

}