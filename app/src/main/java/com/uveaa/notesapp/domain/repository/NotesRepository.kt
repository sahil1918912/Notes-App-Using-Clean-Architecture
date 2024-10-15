package com.uveaa.notesapp.domain.repository

import com.uveaa.notesapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {

    suspend fun insert(note: Note)

    suspend fun update(note: Note)

    suspend fun delete(note: Note)

    fun getAllNotes() : Flow<List<Note>>
}