package com.example.cries.bmiapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by cries on 2019/03/01.
 */

class ViewHolder(itemData: View) : RecyclerView.ViewHolder(itemData){
    val dayText: TextView = itemData.findViewById(R.id.day)
    val heightText: TextView = itemData.findViewById(R.id.height)
    val weightText: TextView = itemData.findViewById(R.id.weight)
    val bmiText: TextView = itemData.findViewById(R.id.bmi)

}
