package com.nerdcutlet.friendhole.di

import com.nerdcutlet.friendhole.di.main.FriendsFragmentModule
import com.nerdcutlet.friendhole.di.main.HomeFragmentModule
import com.nerdcutlet.friendhole.di.main.ProfileFragmentModule
import com.nerdcutlet.friendhole.ui.main.fragment.FriendsFragment
import com.nerdcutlet.friendhole.ui.main.fragment.HomeFragment
import com.nerdcutlet.friendhole.ui.main.fragment.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder{

    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun bindHomeFragment() : HomeFragment

    @ContributesAndroidInjector(modules = [FriendsFragmentModule::class])
    abstract fun binFriendsFragment() : FriendsFragment

    @ContributesAndroidInjector(modules = [ProfileFragmentModule::class])
    abstract fun bindProfileFragment() : ProfileFragment

}