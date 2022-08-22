package com.example.algotut

import android.provider.ContactsContract
import androidx.lifecycle.LiveData

class NoteRepository(private val noteDAO:  NoteDAO) {
    val allNotes : LiveData<List<Notes>> = noteDAO.getAllNotes()


    suspend fun insert(note : Notes){
        noteDAO.insert(note)
    }

    suspend fun delete(note : Notes){
        noteDAO.delete(note)
    }
}