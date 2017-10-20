package com.example.jhonfredytrujilloortega.demotesting.data.model

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query




/**
 * Created by jhonfredytrujilloortega on 10/19/17.
 */

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAll(): LiveData<List<Note>>

    @Insert
    fun insertAll(note: Note)
}