package com.example.cries.bmiapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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
    }
}
