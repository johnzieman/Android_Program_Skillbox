package com.example.mutablerecyclerview.nav_frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mutablerecyclerview.MainActivity
import com.example.mutablerecyclerview.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onStart() {
        super.onStart()
        third_previous_btn.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }
}