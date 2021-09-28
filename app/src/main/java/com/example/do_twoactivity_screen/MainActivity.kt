package com.example.do_twoactivity_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private  lateinit var name:EditText
    private lateinit var location :EditText
    private lateinit var mobile:EditText
    private lateinit var show_info:TextView
    private lateinit var toa:Button
    private lateinit var tv:Button
    private lateinit var go:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         name=findViewById<EditText>(R.id.editText1)
         location =findViewById<EditText>(R.id.editText2)
         mobile=findViewById<EditText>(R.id.editText3)

         show_info=findViewById<TextView>(R.id.textView)//display all info in text view (name,location,mobile)
        
         toa = findViewById<Button>(R.id.button)// display all info in Toast  (name,location,mobile)
         tv = findViewById<Button>(R.id.button2)//display all info in text view (name,location,mobile)
         go = findViewById<Button>(R.id.button3)//display all info in new Screen (name,location,mobile)


        toa.setOnClickListener(){
           // val info=listOf(name.text,location.text,mobile.text)
            val sendName=name.text.toString()
            val sendLocation=location.text.toString()
            val sendMobile=mobile.text.toString()
                Toast.makeText(applicationContext,"$sendName  $sendLocation  $sendMobile",Toast.LENGTH_SHORT).show()


            }

        tv.setOnClickListener {
           // val info=listOf(name.text,location.text,mobile.text)
            val sendName=name.text.toString()
            val sendLocation=location.text.toString()
            val sendMobile=mobile.text.toString()
            show_info.setText("$sendName  $sendLocation  $sendMobile")


        }
        go.setOnClickListener {
            val sendName=name.text.toString()
            val sendLocation=location.text.toString()
            val sendMobile=mobile.text.toString()

            val intent = Intent(this, print_info::class.java)

            intent.putExtra("sendName",sendName)
            intent.putExtra("sendLocation",sendLocation)
            intent.putExtra("sendMobile",sendMobile)

            startActivity(intent)
        }


    }
}

