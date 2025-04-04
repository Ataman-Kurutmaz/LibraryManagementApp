package com.example.librarymanagementapp.presentation.profile


import android.os.Bundle
import android.view.View
import com.example.librarymanagementapp.databinding.FragmentProfileBinding
import com.example.librarymanagementapp.presentation.common.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>(FragmentProfileBinding::inflate, ProfileViewModel::class.java) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}