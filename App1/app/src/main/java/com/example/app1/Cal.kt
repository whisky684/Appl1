package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cal.*

class Cal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        var intent = getIntent()

        val bmi = intent.getStringExtra("BMI")
        tbmi.text = bmi
    }
}