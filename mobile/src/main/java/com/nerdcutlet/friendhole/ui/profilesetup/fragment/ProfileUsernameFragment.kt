package com.nerdcutlet.friendhole.ui.profilesetup.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.profilesetup.viewmodel.ProfileUsernameViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class ProfileUsernameFragment : DaggerFragment() {

    @Inject lateinit var viewmodel: ProfileUsernameViewModel

    companion object {
        fun newInstance(): ProfileUsernameFragment {
            val fragment = ProfileUsernameFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_username, container, false)
    }

}
