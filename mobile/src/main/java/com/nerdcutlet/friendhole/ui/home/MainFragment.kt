package com.nerdcutlet.friendhole.ui.home


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nerdcutlet.friendhole.R
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    private var position = 0

    companion object {
        fun newInstance(position: Int): MainFragment {
            val fragment = MainFragment()
            fragment.position = position
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        view.testttt.text = "Postion : ${position}"
        return  view
    }

}