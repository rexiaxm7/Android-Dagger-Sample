package com.example.rexia7.dagger2test3

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val name = MutableLiveData<String>()
}