package com.nerdcutlet.friendhole.di

import com.nerdcutlet.friendhole.di.main.FriendsFragmentModule
import com.nerdcutlet.friendhole.di.main.HomeFragmentModule
import com.nerdcutlet.friendhole.di.main.ProfileFragmentModule
import com.nerdcutlet.friendhole.di.profile.ProfileDetailsFragmentModule
import com.nerdcutlet.friendhole.di.profile.ProfileUsernameFragment
import com.nerdcutlet.friendhole.ui.main.fragment.FriendsFragment
import com.nerdcutlet.friendhole.ui.main.fragment.HomeFragment
import com.nerdcutlet.friendhole.ui.main.fragment.ProfileFragment
import com.nerdcutlet.friendhole.ui.profilesetup.fragment.ProfileDetailsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {

    //MainActivity Fragments
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun bindHomeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [FriendsFragmentModule::class])
    abstract fun binFriendsFragment(): FriendsFragment

    @ContributesAndroidInjector(modules = [ProfileFragmentModule::class])
    abstract fun bindProfileFragment(): ProfileFragment

    //ProfileSetupActivity Fragments

    @ContributesAndroidInjector(modules = [ProfileDetailsFragmentModule::class])
    abstract fun bindProfileDetailsFragment(): ProfileDetailsFragment

    @ContributesAndroidInjector(modules = [ProfileUsernameFragment::class])
    abstract fun bindProfileUsernameFragment(): ProfileUsernameFragment

}