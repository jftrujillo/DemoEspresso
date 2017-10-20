package com.example.jhonfredytrujilloortega.demotesting.UI.addNote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import com.example.jhonfredytrujilloortega.demotesting.App

import com.example.jhonfredytrujilloortega.demotesting.R
import com.example.jhonfredytrujilloortega.demotesting.data.model.Note
import kotlinx.android.synthetic.main.activity_add_note.*
import org.jetbrains.anko.doAsync

class AddNoteActivity : AppCompatActivity() {

    lateinit var note : Note

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        addNote.setOnClickListener{
            note = Note(0,titulo.editText?.text.toString(),description.text.toString())
            doAsync {
                App.database?.noteDao()?.insertAll(note)
            }
            finish()
        }

    }
}
