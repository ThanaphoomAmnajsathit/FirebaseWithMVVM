package com.example.firebasewithmvvm.di

import com.example.firebasewithmvvm.data.repository.NoteRepository
import com.example.firebasewithmvvm.data.repository.NoteRepositoryImp
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository (database: FirebaseFirestore): NoteRepository{
        return NoteRepositoryImp(database)
    }
}