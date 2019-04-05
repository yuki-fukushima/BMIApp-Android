package com.example.cries.bmiapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ViewAdapter(private val myDataset: ArrayList<ItemData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val sectionType = 0
    private val itemType = 1
    // RecyclerViewの一要素となるXML要素の型を引数に指定する
    // この場合はdiary_list_item.xmlのTextView
//    class ItemViewHolder(val textView: TextView) : RecyclerView.ItemViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType ==  sectionType) {
            return SectionViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_section, parent, false) as View)
        } else {
            return ItemViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_item, parent, false) as View)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.dayText?.text  = myDataset[position].dayText
            holder.heightText?.text = myDataset[position].heightText
            holder.weightText?.text = myDataset[position].weightText
            holder.bmiText?.text = myDataset[position].bmiText
            holder.columText.text = myDataset[position].columText
            // メモが空の時はviewを表示しない
            if (holder.columText.text.isEmpty()) {
                holder.columText.visibility = View.GONE
            } else {
                holder.columText.visibility = View.VISIBLE
            }
        } else if (holder is SectionViewHolder){
            holder.dayText?.text  = myDataset[position].dayText
            holder.heightText?.text = myDataset[position].heightText
            holder.weightText?.text = myDataset[position].weightText
            holder.bmiText?.text = myDataset[position].bmiText
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
