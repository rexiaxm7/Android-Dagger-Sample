package com.example.rexia7.dagger2test3.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rexia7.dagger2test3.databinding.FragmentMainBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class MainFragment : DaggerFragment() {

    @Inject
    lateinit var viewModel: MainFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return FragmentMainBinding.inflate(inflater, container, false)
            .also {
                it.setLifecycleOwner(this)
                it.viewModel = viewModel
            }.root
    }
}
