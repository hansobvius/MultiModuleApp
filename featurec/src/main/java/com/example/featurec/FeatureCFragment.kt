package com.example.featurec

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.featurec.databinding.FragmentFeaturecBinding
import com.google.android.material.snackbar.Snackbar

class FeatureCFragment: Fragment() {

    private lateinit var binding: FragmentFeaturecBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentFeaturecBinding.inflate(inflater)
        return binding.root
    }

    override fun onResume(){
        super.onResume()
        initListener()
    }

    private fun initListener(){
        binding.featurecButton.setOnClickListener {
            Snackbar.make(binding.root, "Module Feature C", Snackbar.LENGTH_LONG)
        }
    }
}