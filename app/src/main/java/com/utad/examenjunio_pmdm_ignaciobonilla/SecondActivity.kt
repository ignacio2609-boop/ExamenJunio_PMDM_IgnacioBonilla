package com.utad.examenjunio_pmdm_ignaciobonilla

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.utad.examenjunio_pmdm_ignaciobonilla.databinding.ActivitySecondBinding
import com.utad.examenjunio_pmdm_ignaciobonilla.model.Model

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val item = intent.getParcelableExtra<Model>("item", Model::class.java)
//        binding.tvTitle.text = item?.title
//        setTitle(item?.title)
    }
}