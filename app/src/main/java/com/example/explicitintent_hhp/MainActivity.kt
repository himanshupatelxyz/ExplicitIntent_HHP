package com.example.explicitintent_hhp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val LOG_TAG=MainActivity::class.simpleName
    val EXTRA_MESSAGE="com.example.explicitintent_hhp.MESSAGE"
     lateinit var mMessageEdittext:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEdittext=findViewById(R.id.editText_main)

    }
    fun launchSecondActivity(view: View) {
             Log.d(LOG_TAG,"Button clicked")
        //Create Explicit Intent
        intent= Intent(this,SecondActivity::class.java)
        var message=mMessageEdittext.text.toString()
        intent.putExtra("MainActivity1",message)
         startActivity(intent)
    }

}