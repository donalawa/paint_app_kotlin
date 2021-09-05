package com.example.androidpaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        We want to call the setSizeForBrush function here in our main and pass the brush size
        drawing_view.setSizeForBrush(20.toFloat())
    }
}