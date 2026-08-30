package com.example.mad_practical_2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        showLifecycleMessage("onCreate")
    }

    override fun onStart() {
        super.onStart()
        showLifecycleMessage("onStart")
    }

    override fun onResume() {
        super.onResume()
        showLifecycleMessage("onResume")
    }

    override fun onPause() {
        super.onPause()
        showLifecycleMessage("onPause")
    }

    override fun onStop() {
        super.onStop()
        showLifecycleMessage("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        showLifecycleMessage("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        showLifecycleMessage("onDestroy")
    }

    private fun showLifecycleMessage(methodName: String) {
        val message = "$methodName function called."

        // 1. Log Message in Logcat
        Log.i("MainActivity", message)

        // 2. Toast Message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        // 3. Snackbar Message
        try {
            val rootView = findViewById<View>(android.R.id.content)
            if (rootView != null) {
                Snackbar.make(rootView, message, Snackbar.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Failed to show Snackbar in $methodName: ${e.message}")
        }
    }
}