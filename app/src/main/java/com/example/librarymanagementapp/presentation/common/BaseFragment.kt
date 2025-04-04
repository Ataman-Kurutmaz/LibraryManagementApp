package com.example.librarymanagementapp.presentation.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB,
    private val viewModelClass: Class<VM>
) : Fragment() {

    private var _viewBinding: VB? = null
    protected val binding get() = _viewBinding!!

    private var _viewModel: VM? = null
    protected val viewModel get() = _viewModel!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = inflate(inflater, container, false)
        _viewModel = ViewModelProvider(this)[viewModelClass]
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _viewBinding = null
        _viewModel = null
    }
}