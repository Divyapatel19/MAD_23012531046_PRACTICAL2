package com.example.mad_23012531046_practical2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private val tag = "ActivityLifeCycle"
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        mainLayout = findViewById(R.id.main)
        logAndShow("onCreate")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun logAndShow (message: String) {
        Log.d(tag, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        Snackbar.make(mainLayout, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        logAndShow("onStart")
    }

    override fun onResume() {
        super.onResume()
        logAndShow("onResume")
    }

    override fun onPause() {
        super.onPause()
        logAndShow("onPause")
    }

    override fun onStop() {
        super.onStop()
        logAndShow("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        logAndShow("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        logAndShow("onDestroy")
    }
}
