package com.busrautmn.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagerAdapter(fm :FragmentManager):FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {

            0 -> return Fragment1()
            1-> return Fragment2()
            else -> return fragment3()
        }


    }

    override fun getCount(): Int {
        return 3
    }

}