package com.nerdcutlet.friendhole.ui.profilesetup.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.profilesetup.common.ProfileSetupViewPagerAdapter
import com.nerdcutlet.friendhole.ui.profilesetup.viewmodel.ProfileSetupViewModel
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_profile_setup.*
import javax.inject.Inject

class ProfileSetupActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewmodel : ProfileSetupViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setup)

        setupUI()

    }

    fun setupUI(){
        viewpager_activity_profile_setup.adapter = ProfileSetupViewPagerAdapter(supportFragmentManager)
        viewpager_activity_profile_setup.offscreenPageLimit = 2
    }
}
