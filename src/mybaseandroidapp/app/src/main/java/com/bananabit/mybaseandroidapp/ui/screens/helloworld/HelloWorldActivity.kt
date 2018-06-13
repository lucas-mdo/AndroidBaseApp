package com.bananabit.mybaseandroidapp.ui.screens.helloworld

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bananabit.mybaseandroidapp.R
import com.bananabit.mybaseandroidapp.databinding.ActivityHelloWorldBinding

class HelloWorldActivity : AppCompatActivity() {

    lateinit var binding: ActivityHelloWorldBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_hello_world)

        binding.textViewHelloWorld.text = "Hello from Activtiy"

    }
}
