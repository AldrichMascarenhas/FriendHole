package com.nerdcutlet.friendhole.extensions.activity

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

fun AppCompatActivity.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()


