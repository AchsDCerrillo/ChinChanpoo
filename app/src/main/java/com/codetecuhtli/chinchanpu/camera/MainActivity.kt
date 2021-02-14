package com.codetecuhtli.chinchanpu.camera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codetecuhtli.chinchanpu.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
            .replace(R.id.container, CameraFragment.newInstance())
            .commit()
    }
}