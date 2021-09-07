package com.example.retrofitrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitrecyclerview.repository.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel=ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.response.observe(this, Observer {
            response -> Log.d("Response", response.id.toString())
            Log.d("Response", response.gender)
            Log.d("Response", response.name)
            Log.d("Response", response.species)
            Log.d("Response", response.image)

        })
    }
}