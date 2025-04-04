package com.example.librarymanagementapp.presentation.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.librarymanagementapp.presentation.common.BaseAdapter.HomeViewHolder

abstract class BaseAdapter<T,VB : ViewBinding>(
    private val diffCallback: DiffUtil.ItemCallback<T>,
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB
) : ListAdapter<T,HomeViewHolder>(diffCallback){

    private var _viewBinding: VB? = null
    protected val viewBinding get() = _viewBinding!!

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        _viewBinding = inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(viewBinding)
    }

    class HomeViewHolder(private val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root)
}