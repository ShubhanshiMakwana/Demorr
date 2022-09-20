package com.example.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import viewmodellivedata.TestViewModel

class MainLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_layout)
        // view model instance
        val viewModel: TestViewModel = ViewModelProvider(this)[TestViewModel::class.java]

        // setting text view
        val textView:TextView= findViewById(R.id.textView)
        textView.text = viewModel.number.toString()

        //handling button click event
        val button:Button= findViewById(R.id.button)
        button.setOnClickListener {
            viewModel.addOne()
            textView.text = viewModel.number.toString()
    }



       }
    }
