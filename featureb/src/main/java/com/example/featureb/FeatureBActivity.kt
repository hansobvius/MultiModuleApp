package com.example.featureb

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.featureb.databinding.ActivityFeaturebBinding

class FeatureBActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFeaturebBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_featureb)
        setSupportActionBar(binding.featurebTollbar)
    }

    override fun onResume(){
        super.onResume()
        initlistener()
    }

    private fun initlistener(){
        binding.featurebButton.setOnClickListener{}
    }
}