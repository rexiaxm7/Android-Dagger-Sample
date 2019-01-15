package com.example.rexia7.dagger2test3

import android.os.Bundle
import android.view.View
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject
import android.view.ViewGroup
import android.view.LayoutInflater



class MainFragment : DaggerFragment() {

    @Inject lateinit var repo : Repo

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = repo.getName()
    }


}
