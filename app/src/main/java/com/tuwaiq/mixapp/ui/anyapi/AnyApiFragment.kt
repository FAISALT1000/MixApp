package com.tuwaiq.mixapp.ui.anyapi

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuwaiq.mixapp.R

class AnyApiFragment : Fragment() {

    companion object {
        fun newInstance() = AnyApiFragment()
    }

    private lateinit var viewModel: AnyApiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.any_api_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AnyApiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}