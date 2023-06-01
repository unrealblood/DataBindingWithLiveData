package com.strength.databindingwithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.strength.databindingwithlivedata.databinding.ActivityMainBinding
import com.strength.databindingwithlivedata.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        mainViewModel = ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)

        binding.mViewModel = mainViewModel

        binding.lifecycleOwner = this@MainActivity

        binding.updateQuoteButtonMA.setOnClickListener { mainViewModel.updateQuote() }
    }
}