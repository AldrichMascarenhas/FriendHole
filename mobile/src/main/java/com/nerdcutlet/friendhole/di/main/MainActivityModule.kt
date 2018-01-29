package com.nerdcutlet.friendhole.di.main

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nerdcutlet.friendhole.ui.main.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule{

    @Provides
    fun provideViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = MainViewModel(firebaseAuth, firebaseFirestore)
}