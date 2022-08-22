package com.example.algotut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dsalgo.setOnClickListener{
            val dsalgo = Intent(this, Indexds::class.java)
            startActivity(dsalgo)
        }

        notes.setOnClickListener {
            val notesInt = Intent(this, Tasks::class.java)
            startActivity(notesInt)
        }

        calender.setOnClickListener {
            val i = Intent(this, Calender::class.java )
            startActivity(i)
        }
    }
}