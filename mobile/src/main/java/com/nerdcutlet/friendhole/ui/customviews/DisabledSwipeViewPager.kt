package com.nerdcutlet.friendhole.ui.customviews

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class DisabledSwipeViewPager(
        context: Context, attributeSet: AttributeSet
) : ViewPager(context, attributeSet) {

    override fun onTouchEvent(ev: MotionEvent?): Boolean = false
    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean = false

}