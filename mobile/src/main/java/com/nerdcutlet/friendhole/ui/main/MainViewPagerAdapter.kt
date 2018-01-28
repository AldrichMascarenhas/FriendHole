package com.nerdcutlet.friendhole.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.security.InvalidParameterException

class MainViewPagerAdapter(
        supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private val pages = listOf(0, 1, 2)

    override fun getItem(position: Int): Fragment =
            when (pages[position]) {
                0 -> MainFragment.newInstance(pages[position])
                1 -> MainFragment.newInstance(pages[position])
                2 -> MainFragment.newInstance(pages[position])
                else -> throw InvalidParameterException("Could not recognise the page: ${pages[position]}")
            }

    override fun getCount(): Int = pages.size

}