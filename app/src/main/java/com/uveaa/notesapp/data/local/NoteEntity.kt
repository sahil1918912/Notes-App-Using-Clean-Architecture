package com.uveaa.notesapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val NOTES_TABLE = "notes"

@Entity(tableName = NOTES_TABLE)
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "title")val title: String,
    @ColumnInfo(name = "description") val description: String
) {
    constructor() : this(0,"","")
}