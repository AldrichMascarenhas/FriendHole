package com.nerdcutlet.friendhole.ui.profilesetup.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.main.fragment.HomeFragment
import com.nerdcutlet.friendhole.ui.main.viewmodel.HomeViewModel
import com.nerdcutlet.friendhole.ui.profilesetup.viewmodel.ProfileDetailsViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class ProfileDetailsFragment : DaggerFragment() {

    @Inject lateinit var viewmodel : ProfileDetailsViewModel
    companion object {
        fun newInstance(): ProfileDetailsFragment {
            val fragment = ProfileDetailsFragment()
            return fragment
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_details, container, false)
    }


}
