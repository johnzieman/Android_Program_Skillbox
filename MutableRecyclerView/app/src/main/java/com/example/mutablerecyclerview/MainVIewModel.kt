package com.example.mutablerecyclerview

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainVIewModel(application: Application): AndroidViewModel(application) {
    val liveData = MutableLiveData<String>()

    init {
        startTimer()
    }


   fun startTimer() {
       object: CountDownTimer(10000, 1000){
           override fun onTick(millisUntilFinished: Long) {
               liveData.postValue((millisUntilFinished/1000).toString())
           }

           override fun onFinish() {
                Toast.makeText(getApplication(), "Finished",Toast.LENGTH_SHORT).show()
                startTimer()
           }
       }.start()
   }
}