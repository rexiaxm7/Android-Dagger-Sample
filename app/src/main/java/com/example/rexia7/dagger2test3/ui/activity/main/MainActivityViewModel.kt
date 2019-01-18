package com.example.rexia7.dagger2test3.ui.activity.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val name = MutableLiveData<String>()
}