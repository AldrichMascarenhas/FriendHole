package com.nerdcutlet.friendhole.ui.profilesetup.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nerdcutlet.friendhole.R
import dagger.android.support.DaggerFragment


class ProfileUsernameFragment : DaggerFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_username, container, false)
    }

}
