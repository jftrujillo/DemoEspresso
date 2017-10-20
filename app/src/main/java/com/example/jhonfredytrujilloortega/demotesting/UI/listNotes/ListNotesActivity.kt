package com.example.jhonfredytrujilloortega.demotesting.UI.listNotes

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.jhonfredytrujilloortega.demotesting.App

import com.example.jhonfredytrujilloortega.demotesting.R
import com.example.jhonfredytrujilloortega.demotesting.UI.addNote.AddNoteActivity
import com.example.jhonfredytrujilloortega.demotesting.UI.listNotes.adapters.ListNotesAdapter
import com.example.jhonfredytrujilloortega.demotesting.data.model.Note
import kotlinx.android.synthetic.main.activity_list_notes.*
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.startActivity

class ListNotesActivity : AppCompatActivity() {
    var data: List<Note>? = null
    lateinit var adapter: ListNotesAdapter
    lateinit var viewMode : ListNotesViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_notes)

        add.setOnClickListener{
            startActivity<AddNoteActivity>()
        }
        adapter = ListNotesAdapter()
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        viewMode = ViewModelProviders.of(this).get(ListNotesViewModel::class.java)
        viewMode.getAllItems()?.observe(this, Observer {
            adapter.data = it!!
        })
    }
}
