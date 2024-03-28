package com.example.gitdemo

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class MyObserver : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("MyObserver", "activityStart")
    }git

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("MyObserver", "onResume")
    }
}