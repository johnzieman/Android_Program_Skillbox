package com.example.mutablerecyclerview

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData: LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun getData(){
        println("Data was sent")
    }
}