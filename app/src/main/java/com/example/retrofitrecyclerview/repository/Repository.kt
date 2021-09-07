package com.example.retrofitrecyclerview.repository

import com.example.retrofitrecyclerview.api.RetrofitInstance
import com.example.retrofitrecyclerview.model.Characters

class Repository {
    suspend fun getPost(): Characters{
        println("111111111111111111111111111111111111")
        println(RetrofitInstance.toString())
            return RetrofitInstance.api.getPost()
    }
}