package com.nerdcutlet.friendhole.ui.main.common

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.nerdcutlet.friendhole.ui.main.fragment.FriendsFragment
import com.nerdcutlet.friendhole.ui.main.fragment.HomeFragment
import com.nerdcutlet.friendhole.ui.main.fragment.ProfileFragment
import java.security.InvalidParameterException

class MainViewPagerAdapter(
        supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private val pages = listOf(0, 1, 2)

    override fun getItem(position: Int): Fragment =
            when (pages[position]) {
                0 -> HomeFragment.newInstance()
                1 -> FriendsFragment.newInstance()
                2 -> ProfileFragment.newInstance()
                else -> throw InvalidParameterException("Could not recognise the page: ${pages[position]}")
            }

    override fun getCount(): Int = pages.size

}