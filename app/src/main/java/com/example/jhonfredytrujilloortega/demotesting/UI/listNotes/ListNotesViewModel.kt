package com.example.jhonfredytrujilloortega.demotesting.UI.listNotes

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.example.jhonfredytrujilloortega.demotesting.App
import com.example.jhonfredytrujilloortega.demotesting.data.model.AppDatabase
import com.example.jhonfredytrujilloortega.demotesting.data.model.Note

/**
 * Created by jhonfredytrujilloortega on 10/20/17.
 */
class ListNotesViewModel(application: Application) : AndroidViewModel(application) {

    var notes : LiveData<List<Note>>? = App.database?.noteDao()?.getAll()

    fun getAllItems() : LiveData<List<Note>>? = notes
}