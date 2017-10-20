package com.example.jhonfredytrujilloortega.demotesting.UI.listNotes.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jhonfredytrujilloortega.demotesting.R
import com.example.jhonfredytrujilloortega.demotesting.data.model.Note
import com.example.jhonfredytrujilloortega.demotesting.databinding.TemplateListNotesBinding
import com.example.jhonfredytrujilloortega.demotesting.util.inflate

/**
 * Created by jhonfredytrujilloortega on 10/19/17.
 */


class ListNotesAdapter : RecyclerView.Adapter<ListNotesAdapter.NotesHolder>(){
    var data : List<Note> = emptyList()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesHolder = NotesHolder(parent.inflate(R.layout.template_list_notes))



    override fun onBindViewHolder(holder: NotesHolder, position: Int) {
        holder.binding.note = data[position]
    }


    class NotesHolder(view : View): RecyclerView.ViewHolder(view){
        val binding : TemplateListNotesBinding = TemplateListNotesBinding.bind(view)
    }

}