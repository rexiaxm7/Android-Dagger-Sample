package com.example.rexia7.dagger2test3.ui.fragment.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainFragmentViewModel : ViewModel() {
    val name = MutableLiveData<String>()
}