package com.example.cries.bmiapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    var diaryTextList: ArrayList<String> = ArrayList()
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_input -> {
                setTitle("入力")
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, InputFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_history -> {
                setTitle("履歴")
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, HistoryFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//        addDiary()
//
//        recycler_view.layoutManager = LinearLayoutManager(this)
//
//        recycler_view.adapter = ViewAdapter(diaryTextList)
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
}
