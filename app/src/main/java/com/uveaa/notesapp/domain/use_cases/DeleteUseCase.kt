package com.uveaa.notesapp.domain.use_cases

import com.uveaa.notesapp.domain.model.Note
import com.uveaa.notesapp.domain.repository.NotesRepository
import javax.inject.Inject

class DeleteUseCase @Inject constructor(private val notesRepository: NotesRepository) {
    suspend operator fun invoke(note: Note) = notesRepository.delete(note)
}