package com.example.mutablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mutablerecyclerview.adapters.ItemsAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

//    lateinit var mainVIewModel: MainVIewModel

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mainVIewModel = ViewModelProvider(this).get(MainVIewModel::class.java)
        navController = Navigation.findNavController(this, R.id.nav_host)
    }


    override fun onStart() {
        super.onStart()
//        mainVIewModel.liveData.observe(this, {
//            textView2.text = it
//        })
    }
//    override fun onStart() {
//        super.onStart()
//        println(object: Any(){}.javaClass.enclosingMethod?.name)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        println(object: Any(){}.javaClass.enclosingMethod?.name)
//    }
//
//    override fun onPause() {
//        super.onPause()
//        println(object: Any(){}.javaClass.enclosingMethod?.name)
//    }
//
//    override fun onStop() {
//        super.onStop()
//        println(object: Any(){}.javaClass.enclosingMethod?.name)
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        println(object: Any(){}.javaClass.enclosingMethod?.name)
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        println(object: Any(){}.javaClass.enclosingMethod?.name)
//    }
}