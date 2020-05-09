package com.example.bindingadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingadapter.databinding.ItemUserLayoutBinding

class UserAdapter (val contex : Context , val list : List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolde>(){

    class ViewHolde (view: ItemUserLayoutBinding ): RecyclerView.ViewHolder(view.root) {
        val binding : ItemUserLayoutBinding = view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolde {
        val binding: ItemUserLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(contex),R.layout.item_user_layout,parent, false)
        return ViewHolde(binding)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolde, position: Int) {
        holder.binding.model= list[position]
    }

}