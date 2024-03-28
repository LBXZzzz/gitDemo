package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    private lateinit var  infoText :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyObserver())
        viewModel = ViewModelProvider(this,MainViewModelFactory(2))
            .get(MainViewModel::class.java)
        val plusOneBtn = findViewById<Button>(R.id.plusOneBtn)
        val clear=findViewById<Button>(R.id.clear)
        infoText= findViewById<TextView>(R.id.infoText)
        plusOneBtn.setOnClickListener {
            viewModel.piusOne()
        }
        clear.setOnClickListener {
            viewModel.clear()
        }
        viewModel.counter.observe(this) { count ->
            infoText.text = count.toString()
        }
    }

    private fun refreshCounter() {

    }
}




