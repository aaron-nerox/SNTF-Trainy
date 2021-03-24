package com.nerostarx.sntf.dialogs

import android.app.Dialog
import android.content.Context
import com.nerostarx.sntf.R

object  ReservationDialog{

    fun createReservationDialog(context: Context){
        //add the dialog
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.info_dialog)

        dialog.show()
        //on cancel listener
    }
}