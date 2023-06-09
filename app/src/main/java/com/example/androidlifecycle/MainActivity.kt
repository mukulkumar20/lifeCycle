package com.example.androidlifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val Tag = "MainActivity"
    /*Hey boy*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.i(Tag,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(Tag,"onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i(Tag,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(Tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(Tag,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(Tag,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(Tag,"onDestroy")
    }
}