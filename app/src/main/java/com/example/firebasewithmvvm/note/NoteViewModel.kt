package com.example.firebasewithmvvm.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firebasewithmvvm.data.model.Note
import com.example.firebasewithmvvm.data.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(val repository: NoteRepository): ViewModel() {

    private val _note = MutableLiveData<List<Note>>()
    val note: LiveData<List<Note>>
        get() = _note

    fun getNote(){
        _note.value = repository.getNote()
    }

}