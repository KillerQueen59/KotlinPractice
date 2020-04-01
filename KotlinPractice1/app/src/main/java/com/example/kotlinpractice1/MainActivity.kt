package com.example.kotlinpractice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnClick)
        button.setOnClickListener{Toast.makeText(this,"Hello World!",Toast.LENGTH_LONG).show()}

        val buttonSnack = findViewById<Button>(R.id.btnClickSnack)
        val rootLayout = findViewById<ConstraintLayout>(R.id.consLay)
        buttonSnack.setOnClickListener { Snackbar.make(rootLayout,"Hello World!",Snackbar.LENGTH_LONG).show()}

    }
}
