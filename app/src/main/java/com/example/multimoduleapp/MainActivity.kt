package com.example.multimoduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.featureb.FeatureBActivity
import com.example.multimoduleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        initListener()
    }

    private fun initListener(){
        binding.appButton.setOnClickListener {
            startActivity(Intent(this, FeatureBActivity::class.java))
        }
    }
}
