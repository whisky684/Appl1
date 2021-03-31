package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btcal.setOnClickListener {



            if (twei.text.isEmpty()) {
                Toast.makeText(this, "กรุณากรอก น้ำหนัก", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            else if (thei.text.isEmpty()) {
                    Toast.makeText(this, "กรุณากรอก ส่วนสูง", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
            }
            else if (tage.text.isEmpty()) {
                Toast.makeText(this, "กรุณากรอก อายุ", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            var hei = 0.00
            var bmi = 0.00
            hei = thei.text.toString().toDouble()/100
            bmi = twei.text.toString().toDouble() / (hei*hei)

            val decimal = BigDecimal(bmi).setScale(2, RoundingMode.HALF_EVEN)
            res.text = "BMI : "+decimal.toString()





            val nex = Intent(this , Cal::class.java)
           intent.putExtra("BMI", decimal)
            startActivity(nex)
        }
    }
}