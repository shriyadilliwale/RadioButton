package com.creageek.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap

import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup?.setOnCheckedChangeListener { group, checkedId ->
            var text = "You selected: "
            text += if (R.id.radio_first == checkedId) "First button" else "Second button"
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        }
    }
}