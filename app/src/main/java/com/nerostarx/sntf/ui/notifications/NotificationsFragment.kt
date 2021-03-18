package com.nerostarx.sntf.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.sntf.R
import com.nerostarx.sntf.adapters.NotificationAdapter

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProvider(this).get(NotificationsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_notifications, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler:RecyclerView = view.findViewById(R.id.notification_recycler)
        recycler.layoutManager = LinearLayoutManager(requireContext(),VERTICAL,false)
        recycler.setHasFixedSize(false)
        recycler.adapter = NotificationAdapter()
    }
}