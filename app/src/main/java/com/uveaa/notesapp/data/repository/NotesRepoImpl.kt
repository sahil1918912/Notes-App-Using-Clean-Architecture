package com.uveaa.notesapp.data.repository

import com.uveaa.notesapp.data.local.NotesDao
import com.uveaa.notesapp.data.mappers.toNote
import com.uveaa.notesapp.data.mappers.toNoteEntity
import com.uveaa.notesapp.domain.model.Note
import com.uveaa.notesapp.domain.repository.NotesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NotesRepoImpl(private val notesDao: NotesDao) : NotesRepository {
    override suspend fun insert(note: Note) {
        notesDao.insert(note.toNoteEntity())
    }

    override suspend fun update(note: Note) {
        notesDao.update(note.toNoteEntity())
    }

    override suspend fun delete(note: Note) {
        notesDao.delete(note.toNoteEntity())
    }

    override fun getAllNotes(): Flow<List<Note>> = notesDao.getAllNotes().map{
        it.map { it.toNote() }
    }

}