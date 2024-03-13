package com.dineshprabha.bassmusic.Category.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dineshprabha.bassmusic.Category.model.CategoryModel
import com.dineshprabha.bassmusic.databinding.CategoryLayoutItemBinding

class CategoryAdapter(private val categoryList : List<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(private val binding: CategoryLayoutItemBinding) :
        RecyclerView.ViewHolder(binding.root){

            fun bindData(category : CategoryModel){

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = CategoryLayoutItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return CategoryViewHolder(binding)


    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bindData(categoryList[position])
    }
}