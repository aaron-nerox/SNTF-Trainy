package com.nerostarx.sntf.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.sntf.R

class NewsAdapter(val navController: NavController): RecyclerView.Adapter<NewsAdapter.NewsHolder>() {


    class NewsHolder(inflater: LayoutInflater, parent: ViewGroup):
            RecyclerView.ViewHolder(inflater
                    .inflate(R.layout.news_item, parent, false))
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NewsHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.itemView.setOnClickListener {
            navController.navigate(R.id.to_nav_detail)
        }
    }

    override fun getItemCount(): Int = 4

}