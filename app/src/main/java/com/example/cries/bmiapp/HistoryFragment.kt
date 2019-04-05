package com.example.cries.bmiapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_histroy.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : Fragment() {
//    var diaryTextList: ArrayList<String> = ArrayList()
    var itemDataList: ArrayList<ItemData> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return  inflater.inflate(R.layout.fragment_histroy, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        var itemList = arrayListOf<String>("item","item","item","item","item","item","item","item","item","item","item","item","item","item","item")
//        this.layoutManager = LinearLayoutManager(this)
//        list_fragment.adapter = ListAdapter(itemList)
//        addDiary()
        addItemData("1月", "", "","","")
        addItemData("1日", "身長：172cm", "体重：60kg","BMI:20.3","")
        addItemData("2日", "身長：172cm", "体重：60kg","BMI:20.3","ただで焼肉を食べてしまったせいで、大変なことになってしまった。")
        addItemData("2月", "", "","","")
        addItemData("3日", "身長：172cm", "体重：60kg","BMI:20.3","ただで焼肉を食べてしまったせいで、大変なことになってしまった。")
        addItemData("4日", "身長：172cm", "体重：60kg","BMI:20.3","")

        recycler_view.layoutManager = LinearLayoutManager(context)
        recycler_view.adapter = ViewAdapter(itemDataList)
    }
//    fun addDiary() {
//        diaryTextList.add("diary1")
//        diaryTextList.add("diary2")
//        diaryTextList.add("diary3")
//        diaryTextList.add("diary4")
//        diaryTextList.add("diary5")
//        diaryTextList.add("diary6")
//        diaryTextList.add("diary7")
//        diaryTextList.add("diary8")
//        diaryTextList.add("diary10")
//        diaryTextList.add("diary11")
//        diaryTextList.add("diary12")
//        diaryTextList.add("diary13")
//    }
    fun addItemData(dayText: String, heightText: String, weightText: String, bmiText: String, columText: String) {
        var itemData = ItemData()
        itemData.dayText = dayText
        itemData.heightText = heightText
        itemData.weightText = weightText
        itemData.bmiText = bmiText
        itemData.columText = columText
        itemDataList.add(itemData)
    }
}
