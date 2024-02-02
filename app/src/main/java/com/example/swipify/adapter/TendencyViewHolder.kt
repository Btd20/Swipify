package com.example.swipify.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.swipify.R
import com.example.swipify.Tendency

class TendencyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvTendencyName: TextView = view.findViewById(R.id.tvTendencyName)
    private val tvTendency: ImageView = view.findViewById(R.id.tvTendency)

    fun render(tendencyModel: Tendency) {
        tvTendencyName.text = tendencyModel.tendency

        val resourceId = tvTendency.resources.getIdentifier(tendencyModel.tendency, "drawable", tvTendency.context.packageName)
        tvTendency.setImageResource(resourceId)
    }

}
