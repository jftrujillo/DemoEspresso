package com.example.jhonfredytrujilloortega.demotesting

import android.app.Application
import android.arch.persistence.room.Room
import com.example.jhonfredytrujilloortega.demotesting.data.model.AppDatabase

/**
 * Created by jhonfredytrujilloortega on 10/19/17.
 */
class App: Application() {
    companion object {
        var database: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        App.database = Room.databaseBuilder(this,AppDatabase::class.java,"demo_database").build()
    }
}