package com.example.cries.bmiapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ViewAdapter(private val myDataset: ArrayList<ItemData>) : RecyclerView.Adapter<ViewHolder>() {
    private val sectionType = 0
    private val itemType = 1
    // RecyclerViewの一要素となるXML要素の型を引数に指定する
    // この場合はdiary_list_item.xmlのTextView
//    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if (viewType ==  sectionType) {
            return ViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_section, parent, false) as View)
        } else {
            return ViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_item, parent, false) as View)
        }

    }

    // 第１引数のViewHolderはこのファイルの上のほうで作成した`class ViewHolder`です。
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (getItemViewType(position) == sectionType) {
            holder.dayText?.text  = myDataset[position].dayText
        } else {
            holder.dayText?.text  = myDataset[position].dayText
            holder.heightText?.text = myDataset[position].heightText
            holder.weightText?.text = myDataset[position].weightText
            holder.bmiText?.text = myDataset[position].bmiText
//        holder.columText.text = myDataset[position].columText
        }



    }

    override fun getItemViewType(position: Int): Int {
        val dayText = myDataset[position].dayText
        if (dayText.contains("月")) {
            return sectionType
        } else {
            return itemType
        }
    }
        override fun getItemCount() = myDataset.size
}
