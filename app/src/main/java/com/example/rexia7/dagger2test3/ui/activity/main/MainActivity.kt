package com.example.rexia7.dagger2test3.ui.activity.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.rexia7.dagger2test3.R
import com.example.rexia7.dagger2test3.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this,  R.layout.activity_main)
    }
}
