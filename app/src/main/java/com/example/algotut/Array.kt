package com.example.algotut

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_array.*

class Array : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)
        arrayintro.text = "An array holds a fixed number of similar elements that are stored under one name. These elements are stored in contagious memory locations. " +
                "It is one of the simplest data structures. " +
                "Most modern programming languages have arrays built-in by default."
    }


}