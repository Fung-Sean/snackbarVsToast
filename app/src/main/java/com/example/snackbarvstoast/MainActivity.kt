package com.example.snackbarvstoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val snackBtn = findViewById<Button>(R.id.snackBtn)
        snackBtn.setOnClickListener{
            val rootView = findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(rootView, "Congrats, you have clicked my snackbar!", Snackbar.LENGTH_SHORT)
            snackbar.show()
        }
    }


}