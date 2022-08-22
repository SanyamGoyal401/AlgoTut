package com.example.algotut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_index_ds.*

class Indexds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index_ds)
        arraybtn.setOnClickListener {
            val arrayp = Intent(this, Array::class.java)
            startActivity(arrayp)
        }
        linkedlistbtn.setOnClickListener {
            val listp = Intent(this, LinkedList::class.java)
            startActivity(listp)
        }

        stackbtn.setOnClickListener {
            val arrayp = Intent(this, Stack::class.java)
            startActivity(arrayp)
        }

        queuebtn.setOnClickListener {
            val arrayp = Intent(this, Queue::class.java)
            startActivity(arrayp)
        }

        hashingbtn.setOnClickListener {
            val arrayp = Intent(this, Hashing::class.java)
            startActivity(arrayp)
        }
        heapbtn.setOnClickListener {
            val arrayp = Intent(this, Heap::class.java)
            startActivity(arrayp)
        }
        binarytreebtn.setOnClickListener {
            val arrayp = Intent(this, Trees::class.java)
            startActivity(arrayp)
        }
        graphbtn.setOnClickListener {
            val arrayp = Intent(this, Graph::class.java)
            startActivity(arrayp)
        }
    }
    
}