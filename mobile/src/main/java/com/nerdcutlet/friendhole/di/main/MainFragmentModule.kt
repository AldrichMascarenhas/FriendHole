package com.nerdcutlet.friendhole.di.main

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nerdcutlet.friendhole.ui.main.viewmodel.FriendsViewModel
import com.nerdcutlet.friendhole.ui.main.viewmodel.HomeViewModel
import com.nerdcutlet.friendhole.ui.main.viewmodel.MainViewModel
import com.nerdcutlet.friendhole.ui.main.viewmodel.ProfileViewModel
import dagger.Module
import dagger.Provides

@Module
class HomeFragmentModule{

    @Provides
    fun provideViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = HomeViewModel(firebaseAuth, firebaseFirestore)

}

@Module
class FriendsFragmentModule{

    @Provides
    fun provideViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = FriendsViewModel(firebaseAuth, firebaseFirestore)

}

@Module
class ProfileFragmentModule{

    @Provides
    fun provideViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = ProfileViewModel(firebaseAuth, firebaseFirestore)

}