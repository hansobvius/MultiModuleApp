package com.example.featureb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.featureb.databinding.ActivityFeaturebBinding

private const val packageName = "com.example.featurec"
private const val featureCClassName = "$packageName.FeatureCActivity"

class FeatureBActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFeaturebBinding

    private val clickListener by lazy{
        View.OnClickListener{
            when(it.id){
                binding.featurebButton.id -> launchActivity(featureCClassName)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_featureb)
        setSupportActionBar(binding.featurebTollbar)
    }

    override fun onResume(){
        super.onResume()
        initListener()
    }

    private fun launchActivity(className: String){
        Intent().setClassName(packageName, className).also{
            startActivity(it)
        }
    }

    private fun initListener(){
        setClickListener(binding.featurebButton.id, clickListener)
    }

    private fun setClickListener(id: Int, listener: View.OnClickListener){
        findViewById<View>(id).setOnClickListener(listener)
    }
}