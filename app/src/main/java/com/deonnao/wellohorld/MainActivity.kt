package com.deonnao.wellohorld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.helloBtn).setOnClickListener {
            Log.i("Wello Horld", "Button clicked!")
            Toast.makeText(this, getString(R.string.hello_back),Toast.LENGTH_SHORT).show()
        }

    }
}