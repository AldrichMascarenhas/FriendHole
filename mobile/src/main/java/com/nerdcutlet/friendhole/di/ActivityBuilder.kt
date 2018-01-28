package com.nerdcutlet.friendhole.di

import com.nerdcutlet.friendhole.di.main.MainActivityModule
import com.nerdcutlet.friendhole.di.onboarding.OnBoardingActivityModule
import com.nerdcutlet.friendhole.ui.main.activity.MainActivity
import com.nerdcutlet.friendhole.ui.onboarding.activity.OnboardingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder{

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity() : MainActivity

    @ContributesAndroidInjector(modules = [OnBoardingActivityModule::class])
    abstract fun  bindOnBoardingActivity() : OnboardingActivity
}