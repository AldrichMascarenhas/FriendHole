package com.nerdcutlet.friendhole.ui.onboarding.activity

import android.app.Activity
import android.os.Bundle
import com.firebase.ui.auth.AuthUI
import com.nerdcutlet.friendhole.BuildConfig
import com.nerdcutlet.friendhole.R
import com.nerdcutlet.friendhole.ui.onboarding.viewmodel.OnboardingViewModel
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_onboarding.*
import java.util.*
import javax.inject.Inject
import com.firebase.ui.auth.ErrorCodes
import com.firebase.ui.auth.IdpResponse
import android.content.Intent
import com.nerdcutlet.friendhole.extensions.activity.toast
import com.nerdcutlet.friendhole.ui.main.activity.MainActivity


class OnboardingActivity : DaggerAppCompatActivity() {

    private val RC_SIGN_IN = 123

    @Inject lateinit var viewmodel: OnboardingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        setupUI()
    }

    fun setupUI(){
        button_activity_onboarding.setOnClickListener {
            when(viewmodel.checkAuthStatus()){
                true -> startActivityForResult(
                        AuthUI.getInstance()
                                .createSignInIntentBuilder()
                                .setAvailableProviders(Arrays.asList(
                                         AuthUI.IdpConfig.EmailBuilder().build(),
                                         AuthUI.IdpConfig.PhoneBuilder().build(),
                                         AuthUI.IdpConfig.GoogleBuilder().build()))
                                .setIsSmartLockEnabled(!BuildConfig.DEBUG , true )
                                .build(),
                        RC_SIGN_IN)
                false -> goToHome()
            }
        }
    }

    fun goToHome(){
        startActivity(Intent(this, MainActivity::class.java))

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val response = IdpResponse.fromResultIntent(data)

            // Successfully signed in
            if (resultCode == Activity.RESULT_OK) {
                /*
                TODO:
                1. Go to Profile builder Activity.
                 */
                startActivity(Intent(this, MainActivity::class.java))
                finish()
                return
            } else {
                // Sign in failed
                if (response == null) {
                    // User pressed back button
                    toast("sign_in_cancelled")
                    return
                }

                if (response.errorCode == ErrorCodes.NO_NETWORK) {
                    toast("no_internet_connection")
                    return
                }

                if (response.errorCode == ErrorCodes.UNKNOWN_ERROR) {
                    toast("unknown_error")
                    return
                }
            }

            toast("unknown_sign_in_response")
        }
    }
}
