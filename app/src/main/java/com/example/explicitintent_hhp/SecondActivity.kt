package com.example.explicitintent_hhp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    lateinit var textHeaderRef:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent=intent
        var bundle: String? =intent.getStringExtra("MainActivity1")
        textHeaderRef=findViewById(R.id.text_header)
        textHeaderRef.text=bundle
    }
}