package com.nerdcutlet.friendhole.ui.profilesetup.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nerdcutlet.friendhole.R
import dagger.android.support.DaggerAppCompatActivity

class ProfileSetupActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setup)
    }
}
