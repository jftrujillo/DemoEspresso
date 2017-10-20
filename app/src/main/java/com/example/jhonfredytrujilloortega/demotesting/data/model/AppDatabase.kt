package com.example.jhonfredytrujilloortega.demotesting.data.model

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database



/**
 * Created by jhonfredytrujilloortega on 10/19/17.
 */
@Database(entities = arrayOf(Note::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}