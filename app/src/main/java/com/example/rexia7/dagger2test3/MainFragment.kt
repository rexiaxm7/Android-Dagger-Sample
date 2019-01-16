package com.example.rexia7.dagger2test3

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.rexia7.dagger2test3.databinding.FragmentMainBinding


class MainFragment : DaggerFragment() {

    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var repo: Repo

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return FragmentMainBinding.inflate(inflater, container, false)
            .also {
                it.setLifecycleOwner(this)
                viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
            }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = repo.getName()
    }


}
