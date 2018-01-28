package com.nerdcutlet.friendhole.di;

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import com.google.firebase.firestore.FirebaseFirestore

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideFirebaseFirestore()  = FirebaseFirestore.getInstance()

    @Singleton
    @Provides
    fun provideFirebaseAuth()  = FirebaseAuth.getInstance()

}
