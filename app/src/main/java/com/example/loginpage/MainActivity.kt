package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEdit = findViewById<EditText>(R.id.username)
        val passwordEdit = findViewById<EditText>(R.id.password)
        val loginBtn = findViewById<Button>(R.id.btnLogin)

        val username = "nawalrizky"
        val password = "nawalpunya25"

        loginBtn.setOnClickListener {
            val inputUsername = usernameEdit.text.toString()
            val inputPassword = passwordEdit.text.toString()

            if (inputUsername == username && inputPassword == password) {
                showToast("Login Sukses")
            } else {
                showToast("Login Gagal")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}

