package com.example.algotut

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note : Notes)

    @Delete
    fun delete(note: Notes)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes() : LiveData<List<Notes>>
}