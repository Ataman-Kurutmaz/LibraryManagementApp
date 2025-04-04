package com.example.librarymanagementapp.presentation.home

import androidx.recyclerview.widget.DiffUtil
import com.example.librarymanagementapp.data.datasource.local.entity.Book
import com.example.librarymanagementapp.databinding.ItemHomeBinding
import com.example.librarymanagementapp.presentation.common.BaseAdapter


class HomeAdapter(
    private val onItemClick: (Book) -> Unit
) : BaseAdapter<Book, ItemHomeBinding>(object : DiffUtil.ItemCallback<Book>() {
        override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean = oldItem == newItem
        override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean = oldItem.title == newItem.title
    },
    ItemHomeBinding::inflate) {

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        getItem(position).apply {

        }

        holder.itemView.setOnClickListener {
            onItemClick(getItem(position))
        }
    }
}