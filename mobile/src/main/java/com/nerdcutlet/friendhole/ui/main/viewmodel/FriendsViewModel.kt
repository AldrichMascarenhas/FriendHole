package com.nerdcutlet.friendhole.ui.main.viewmodel

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class FriendsViewModel @Inject constructor(private val firebaseAuth: FirebaseAuth,
                                           private val firebaseFirestore: FirebaseFirestore){

}