package com.kiran.datastoreruntimepermission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.coroutines.delay

class SharedpreferencesActivity : AppCompatActivity() {

    private lateinit var btnPermission: Button
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnGetValue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sharedpreferences)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnPermission = findViewById(R.id.btnLogin)
        btnGetValue = findViewById(R.id.btnGetValue)

        btnPermission.setOnClickListener {

        }

        btnGetValue.setOnClickListener {

        }
    }
}



