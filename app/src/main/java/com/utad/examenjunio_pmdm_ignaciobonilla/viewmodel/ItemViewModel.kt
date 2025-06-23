package com.utad.examenjunio_pmdm_ignaciobonilla.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.utad.examenjunio_pmdm_ignaciobonilla.repository.ItemRepository
import kotlinx.coroutines.Dispatchers

class ItemViewModel(): ViewModel() {
    private val repository = ItemRepository()

    val items = liveData(Dispatchers.IO) {
        val data = repository.obtenerItems()
        emit(data)
    }

//    val itemByDifficulty = liveData(Dispatchers.IO) {
//        val data = repository.obtenerItemsByDifficulty(diff)
//        emit(data)
//    }


}

