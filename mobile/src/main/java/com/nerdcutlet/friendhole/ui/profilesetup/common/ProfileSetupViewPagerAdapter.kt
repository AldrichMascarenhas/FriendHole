package com.nerdcutlet.friendhole.ui.profilesetup.common

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.nerdcutlet.friendhole.ui.main.fragment.FriendsFragment
import com.nerdcutlet.friendhole.ui.main.fragment.HomeFragment
import com.nerdcutlet.friendhole.ui.main.fragment.ProfileFragment
import com.nerdcutlet.friendhole.ui.profilesetup.fragment.ProfileDetailsFragment
import com.nerdcutlet.friendhole.ui.profilesetup.fragment.ProfileUsernameFragment
import java.security.InvalidParameterException

class ProfileSetupViewPagerAdapter(
        supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private val pages = listOf(0, 1)

    override fun getItem(position: Int): Fragment =
            when (pages[position]) {
                0 -> ProfileDetailsFragment.newInstance()
                1 -> ProfileUsernameFragment.newInstance()
                else -> throw InvalidParameterException("Could not recognise the page: ${pages[position]}")
            }

    override fun getCount(): Int = pages.size

}