package com.utad.examenjunio_pmdm_ignaciobonilla.repository

import com.utad.examenjunio_pmdm_ignaciobonilla.data.remote.RetrofitClient

class ItemRepository {
    private val apiService = RetrofitClient.apiService

    suspend fun obtenerItems() = apiService.getItems()
    fun obtenerItemById(id: Int) {}
}