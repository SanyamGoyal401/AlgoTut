package com.example.algotut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_linked_list.*

class LinkedList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linked_list)
        linkedlistintro.text = "A linked list is a linear data structure where each element is a separate object, known as a node."+
                " Each node contains some data and points to the next node in the structure, forming a sequence."+
                " The nodes may be at different memory locations, unlike arrays where all the elements are stored continuously."
    }
}