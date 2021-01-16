package com.example.viewbindgroupie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbindgroupie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            if(binding.edtusername.text.isNotBlank() && binding.edtpassword.text.isNotBlank()){
                startActivity(Intent(this, HomeActivity::class.java))
                Toast.makeText(this, "welcome " + binding.edtusername.text, Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "cek input", Toast.LENGTH_SHORT).show()
            }
        }
    }
}