package com.example.featurec

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.featurec.databinding.ActivityFeaturecBinding

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
        binding.featurecTollbar.setOnClickListener{
            Toast.makeText(
                this,
                "Clicked feature c",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}