package com.example.firebasewithmvvm.data.repository

import com.example.firebasewithmvvm.data.model.Note
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.components.SingletonComponent
import java.util.Date
import javax.inject.Inject

class NoteRepositoryImp(val database: FirebaseFirestore) : NoteRepository {

    override fun getNote(): List<Note> {

        return arrayListOf(
            Note("tt1",
                "Mackey",
                Date()
            ),
            Note(
                "tt2",
                "Mackey",
                Date()
            ),
            Note(
                "tt3",
                "Mackey",
                Date()
            ),
            Note(
                "tt4",
                "Mackey",
                Date()
            ),
        )
    }
}