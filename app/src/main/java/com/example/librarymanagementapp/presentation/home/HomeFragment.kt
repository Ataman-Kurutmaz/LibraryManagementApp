package com.example.librarymanagementapp.presentation.home

import android.os.Bundle
import android.view.View
import com.example.librarymanagementapp.databinding.FragmentHomeBinding
import com.example.librarymanagementapp.presentation.common.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(FragmentHomeBinding::inflate, HomeViewModel::class.java) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = HomeAdapter(
            onItemClick = {

            }
        )
        binding.bookListRv.adapter = adapter

        viewModel.book.observe(viewLifecycleOwner){

        }
    }
}