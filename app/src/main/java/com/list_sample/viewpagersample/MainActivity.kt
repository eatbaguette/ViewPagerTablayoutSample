package com.list_sample.viewpagersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val adapter = ExampleFragmentPagerAdapter(manager)

        main_viewpager.adapter = adapter
        main_tab.setupWithViewPager(main_viewpager)
    }
}

