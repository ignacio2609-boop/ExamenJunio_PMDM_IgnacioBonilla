package com.utad.examenjunio_pmdm_ignaciobonilla.data.remote

import com.utad.examenjunio_pmdm_ignaciobonilla.model.DatosReceta
import com.utad.examenjunio_pmdm_ignaciobonilla.model.Model
import retrofit2.http.GET

interface ApiService {

    @GET("recipes")
    suspend fun getItems(): List<DatosReceta>

}