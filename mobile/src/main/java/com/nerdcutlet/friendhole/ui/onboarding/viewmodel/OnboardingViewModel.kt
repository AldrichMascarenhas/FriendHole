package com.nerdcutlet.friendhole.ui.onboarding.viewmodel

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class OnboardingViewModel @Inject constructor(private val firebaseAuth: FirebaseAuth,
                                              private val firebaseFirestore: FirebaseFirestore) {

}