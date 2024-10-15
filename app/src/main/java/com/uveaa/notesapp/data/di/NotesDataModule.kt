package com.uveaa.notesapp.data.di

import android.content.Context
import com.uveaa.notesapp.data.local.NotesDao
import com.uveaa.notesapp.data.local.NotesDatabase
import com.uveaa.notesapp.data.repository.NotesRepoImpl
import com.uveaa.notesapp.domain.repository.NotesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NotesDataModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : NotesDatabase {
        return NotesDatabase.getInstance(context)
    }

    @Provides
    fun provideNotesDao(notesDatabase: NotesDatabase) : NotesDao {
        return notesDatabase.getNotesDao()
    }

    @Provides
    fun provideRepository(notesDao: NotesDao): NotesRepository {
        return NotesRepoImpl(notesDao)
    }
}