package com.example.firebasewithmvvm.note

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firebasewithmvvm.data.model.Note
import com.example.firebasewithmvvm.data.repository.NoteRepository
import com.example.firebasewithmvvm.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(val repository: NoteRepository): ViewModel() {

    private val _note = MutableLiveData<UiState<List<Note>>>()
    val note: LiveData<UiState<List<Note>>>
        get() = _note

    fun getNote(){
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            _note.value = UiState.Loading
        },1)
        //_note.value = UiState.Loading
        _note.value = repository.getNote()
    }

}