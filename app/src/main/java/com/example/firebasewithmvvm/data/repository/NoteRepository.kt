package com.example.firebasewithmvvm.data.repository

import com.example.firebasewithmvvm.data.model.Note
import com.example.firebasewithmvvm.util.UiState

interface NoteRepository {
    fun getNote(): UiState<List<Note>>

}