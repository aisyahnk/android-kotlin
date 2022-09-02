package com.example.helloworld

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.helloworld.database.Diary
import com.example.helloworld.database.DiaryDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class DetailViewModel (private val db: DiaryDao): ViewModel() {



    fun insertDiary(diary: Diary) {
        viewModelScope.launch(Dispatchers.IO) {
            db.insert(diary)
        }
    }
}

class DetailViewModelFactory(private val db: DiaryDao): ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(db) as T
        }
        throw IllegalArgumentException("ViewModel tidak ada")

    }
}