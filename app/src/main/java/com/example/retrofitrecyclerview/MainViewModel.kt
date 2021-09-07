package com.example.retrofitrecyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitrecyclerview.model.Characters

import com.example.retrofitrecyclerview.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {

    val response: MutableLiveData<Characters> = MutableLiveData()



    fun getPost(){
        viewModelScope.launch{
            val rp: Characters = repository.getPost()
            println("**********************************************************")
            println(rp)
            response.value=rp

        }
    }
}