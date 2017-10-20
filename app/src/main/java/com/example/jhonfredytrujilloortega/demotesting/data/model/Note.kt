package com.example.jhonfredytrujilloortega.demotesting.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo



/**
 * Created by jhonfredytrujilloortega on 10/19/17.
 */
@Entity
class Note(
        @PrimaryKey(autoGenerate = true) var id: Int,
        @ColumnInfo(name = "nombre") var nombre: String,
        @ColumnInfo(name = "descripcion") var description: String
)
