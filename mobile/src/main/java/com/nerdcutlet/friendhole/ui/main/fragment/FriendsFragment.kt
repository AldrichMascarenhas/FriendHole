package com.nerdcutlet.friendhole.ui.main.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.main.viewmodel.FriendsViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class FriendsFragment : DaggerFragment() {

    @Inject lateinit var viewmodel : FriendsViewModel

    companion object {
        fun newInstance(): FriendsFragment {
            val fragment = FriendsFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_friends, container, false)
        return view
    }

}