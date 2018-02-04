package com.nerdcutlet.friendhole.di.profile

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nerdcutlet.friendhole.ui.profilesetup.viewmodel.ProfileDetailsViewModel
import com.nerdcutlet.friendhole.ui.profilesetup.viewmodel.ProfileUsernameViewModel
import dagger.Module
import dagger.Provides

@Module
class ProfileDetailsFragmentModule {

    @Provides
    fun provideProfileDetailsViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = ProfileDetailsViewModel(firebaseAuth, firebaseFirestore)

}

@Module
class ProfileUsernameFragment {

    @Provides
    fun provideProfileUsernameViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = ProfileUsernameViewModel(firebaseAuth, firebaseFirestore)

}