package com.example.poshnassignment.viewmodel

import androidx.lifecycle.ViewModel
import com.example.poshnassignment.repository.SearchRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: SearchRepository) :
    ViewModel() {

    private val TAG = "MainViewModel"



}