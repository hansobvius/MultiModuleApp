package com.example.multimoduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.featureb.FeatureBActivity
import com.example.multimoduleapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        setSupportActionBar(binding.mainToolbar)
    }

    override fun onResume(){
        super.onResume()
        initListener()
    }

    private fun initListener(){
        binding.appButton.setOnClickListener {
            startActivity(Intent(
                this, FeatureBActivity::class.java))
        }
    }
}
