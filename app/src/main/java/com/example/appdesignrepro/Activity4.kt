package com.example.appdesignrepro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
    }
    fun buttonClick2(view: View?){
        val changePage = Intent(this, MainActivity::class.java)
        startActivity(changePage)
    }
}