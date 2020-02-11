package com.example.featurec

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.featurec.databinding.ActivityFeaturecBinding
import com.example.multimoduleapp.MainActivity

class FeatureCActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFeaturecBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_featurec)
        setSupportActionBar(binding.featurecTollbar)
    }

    override fun onResume(){
        super.onResume()
        initListener()
    }

    private fun initListener(){
        binding.featurebButton.setOnClickListener{
            startActivity(Intent(
                this, MainActivity::class.java))
        }
    }
}