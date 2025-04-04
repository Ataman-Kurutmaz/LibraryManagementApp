package com.example.librarymanagementapp.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.librarymanagementapp.data.datasource.local.dao.HomeDAO
import com.example.librarymanagementapp.data.datasource.local.entity.Book
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeDAO: HomeDAO
) : ViewModel() {

    private var _book : LiveData<List<Book>>? = null
    public val book : LiveData<List<Book>> get() = homeDAO.getAllBooks().flowOn(Dispatchers.IO).asLiveData()
}