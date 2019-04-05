package com.example.cries.bmiapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by cries on 2019/03/01.
 */

class ItemViewHolder(itemData: View) : RecyclerView.ViewHolder(itemData){
    var dayText: TextView? = itemData.findViewById(R.id.day)
    var heightText: TextView? = itemData.findViewById(R.id.height)
    var weightText: TextView? = itemData.findViewById(R.id.weight)
    var bmiText: TextView? = itemData.findViewById(R.id.bmi)
    val columText: TextView = itemData.findViewById(R.id.colum)


}
