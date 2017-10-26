package com.list_sample.viewpagersample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by monkey on 2017/10/26.
 */
class ExampleFragmentPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ExampleFragment.newInstance(android.R.color.holo_blue_bright)
            1 -> return ExampleFragment.newInstance(android.R.color.holo_green_light)
            2 -> return ExampleFragment.newInstance(android.R.color.holo_red_dark)
        }
        return null
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "ページ" + (position + 1)
    }

}