package com.example.athkar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.athkar.adapter.ItemAdapter
import com.example.athkar.data.Datasource
import com.example.athkar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val athkarList = Datasource().loadAthkar()

        binding.rvAthkar.adapter = ItemAdapter(this, athkarList)
        binding.rvAthkar.setHasFixedSize(true)

    }
}