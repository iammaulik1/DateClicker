package com.example.dateclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val today =Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR) , today.get(Calendar.MONTH) , today.get(Calendar.DAY_OF_MONTH)

        ){ view , year , month , day ->
            val month = month + 1
            val msg = " You Selected : $day/$month/$year"
            Toast.makeText(this@MainActivity, msg ,Toast.LENGTH_SHORT).show()
        }
    }
}