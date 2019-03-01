package com.examen.examen.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.examen.examen.db.entity.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Query("DELETE FROM notes_table")
    fun deleteAllNotes()

    @Query("SELECT * FROM notes_table ")
    fun getAllNotes(): LiveData<List<Note>>

}