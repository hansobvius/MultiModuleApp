package com.example.multimoduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.featureb.FeatureBActivity
import com.example.multimoduleapp.databinding.ActivityMainBinding

private const val packageName = "com.example.featurec"
private const val featureCClassName = "$packageName.FeatureCActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var value: String = ""

    private val clickListener by lazy{
        View.OnClickListener{
            when(it.id){
                binding.appButton.id -> launchActivity(featureCClassName)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        setSupportActionBar(binding.mainToolbar)
    }

    override fun onResume(){
        super.onResume()
//        getIntentValue()
//        initListener()
        initBModule()
    }

    private fun getIntentValue(){
        val intent = Intent.EXTRA_INTENT
        if(intent != null) value = intent
    }

    private fun launchActivity(className: String){
        Intent().setClassName(packageName, className).also{
            startActivity(it)
        }
    }

    private fun initListener(){
        setClickListener(binding.appButton.id, clickListener)
    }

    private fun setClickListener(id: Int, listener: View.OnClickListener){
        findViewById<View>(id).setOnClickListener(listener)
    }

    private fun initBModule(){
        startActivity(Intent(this, FeatureBActivity::class.java))
    }
}
