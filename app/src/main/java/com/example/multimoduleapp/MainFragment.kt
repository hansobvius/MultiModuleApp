package com.example.multimoduleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.multimoduleapp.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class MainFragment: Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onResume(){
        super.onResume()
        initListener()
    }

    private fun initListener(){
        binding.appButton.setOnClickListener {
            Snackbar.make(
                binding.root,
                "Module Application",
                Snackbar.LENGTH_LONG
            )
        }
    }
}