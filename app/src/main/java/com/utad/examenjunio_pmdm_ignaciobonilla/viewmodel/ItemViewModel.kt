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

    // You can add more functions to fetch specific items or perform other operations
    // For example, if you want to fetch an item by ID:
     val itemById = liveData(Dispatchers.IO) {
        val data = repository.obtenerItemById(itemId)
        emit(data)
    }

}

