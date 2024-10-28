package com.example.appityproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appityproyect.databinding.ActivityPagPrincipalBinding
import com.example.appityproyect.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {
        private lateinit var binding: ActivityRegistroBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityRegistroBinding.inflate(layoutInflater)
            setContentView(binding.root)
    }
}