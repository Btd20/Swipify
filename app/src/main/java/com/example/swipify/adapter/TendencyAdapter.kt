package com.example.swipify.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swipify.R
import com.example.swipify.Tendency

class TendencyAdapter(private val tendencyList:List<Tendency>) : RecyclerView.Adapter<TendencyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TendencyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TendencyViewHolder(layoutInflater.inflate(R.layout.item_tendency, parent, false))
    }

    override fun getItemCount(): Int {
        return  tendencyList.size
    }

    override fun onBindViewHolder(holder: TendencyViewHolder, position: Int) {
        val item = tendencyList[position]
        holder.render(item)
    }

}