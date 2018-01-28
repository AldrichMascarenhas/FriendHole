package com.nerdcutlet.friendhole.ui.onboarding.activity

import android.os.Bundle
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.onboarding.viewmodel.OnboardingViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class OnboardingActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewmodel: OnboardingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }
}
