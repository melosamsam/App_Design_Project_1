package com.example.appdesignrepro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonClick(view: View?){
        val changePage = Intent(this, Activity2::class.java)
        startActivity(changePage)
    }
    fun buttonClick2(view: View?){
        val changePage = Intent(this, Activity3::class.java)
        startActivity(changePage)
    }
    fun buttonClick3(view: View?){
        val changePage = Intent(this, Activity4::class.java)
        startActivity(changePage)
    }
    fun buttonClick4(view: View?){
        val changePage = Intent(this, Activity5::class.java)
        startActivity(changePage)
    }
}