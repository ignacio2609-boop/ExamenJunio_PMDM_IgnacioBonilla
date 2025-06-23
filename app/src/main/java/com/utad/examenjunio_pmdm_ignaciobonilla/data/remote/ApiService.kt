package com.utad.examenjunio_pmdm_ignaciobonilla.data.remote

import com.utad.examenjunio_pmdm_ignaciobonilla.model.Model
import retrofit2.http.GET

interface ApiService {

    // Define your API endpoints here
    // For example:
    // @GET("endpoint")
    // suspend fun getData(): Response<DataType>

    // Add more endpoints as needed
    @GET("/recipes")
    suspend fun getItems(): List<Model>
}