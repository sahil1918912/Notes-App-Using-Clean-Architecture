package com.uveaa.notesapp.domain.use_cases

import com.uveaa.notesapp.domain.model.Note
import com.uveaa.notesapp.domain.repository.NotesRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val notesRepository: NotesRepository) {
    operator fun invoke() = notesRepository.getAllNotes()
}