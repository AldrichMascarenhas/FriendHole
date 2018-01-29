package com.nerdcutlet.friendhole.di.onboarding

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nerdcutlet.friendhole.ui.onboarding.viewmodel.OnboardingViewModel
import dagger.Module
import dagger.Provides

@Module
class OnBoardingActivityModule{

    @Provides
    fun provideViewModel(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore) = OnboardingViewModel(firebaseAuth, firebaseFirestore)

}