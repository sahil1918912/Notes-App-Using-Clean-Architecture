package com.uveaa.notesapp.data.mappers

import com.uveaa.notesapp.data.local.NoteEntity
import com.uveaa.notesapp.domain.model.Note

fun Note.toNoteEntity():NoteEntity{
    return NoteEntity(id,title,description)
}

fun NoteEntity.toNote():Note{
    return Note(id,title,description)
}
