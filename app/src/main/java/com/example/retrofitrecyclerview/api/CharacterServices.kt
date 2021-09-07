package com.example.retrofitrecyclerview.api

import com.example.retrofitrecyclerview.model.Characters
import okhttp3.Call
import retrofit2.http.GET

interface CharacterServices {
    @GET("api/character")
    suspend fun getPost():Characters


}