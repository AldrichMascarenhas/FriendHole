package com.nerdcutlet.friendhole.ui.main.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.main.common.MainViewPagerAdapter
import com.nerdcutlet.friendhole.ui.main.viewmodel.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewmodel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    fun setupUI(){
        navigation_activity_main.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        viewpager_activity_main.adapter = MainViewPagerAdapter(supportFragmentManager)
        viewpager_activity_main.offscreenPageLimit = 2
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                viewpager_activity_main.currentItem = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                viewpager_activity_main.currentItem = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                viewpager_activity_main.currentItem = 2
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
