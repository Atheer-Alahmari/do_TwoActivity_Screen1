package com.example.do_twoactivity_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class print_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_info)

        val sendName=intent.getStringExtra("sendName")
        val sendLocation=intent.getStringExtra("sendLocation")
        val sendMobile=intent.getStringExtra("sendMobile")

        var display_Name=findViewById<TextView>(R.id.textView2)
        display_Name.setText(sendName)

        var display_Location=findViewById<TextView>(R.id.textView3)
        display_Location.setText(sendLocation)

        var display_Mobile=findViewById<TextView>(R.id.textView4)
        display_Mobile.setText(sendMobile)


    }
}