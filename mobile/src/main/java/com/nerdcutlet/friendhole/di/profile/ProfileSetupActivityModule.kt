package com.nerdcutlet.friendhole.di.profile

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nerdcutlet.friendhole.ui.main.viewmodel.ProfileViewModel
import com.nerdcutlet.friendhole.ui.profilesetup.viewmodel.ProfileSetupViewModel
import dagger.Module
import dagger.Provides

@Module
class ProfileSetupActivityModule{

    @Provides
    fun provideProfileDetailsViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = ProfileSetupViewModel(firebaseAuth, firebaseFirestore)
}