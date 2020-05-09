package com.example.bindingadapter

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("app:loadImage")
fun loadImage(view: ImageView, url : String){
    Picasso.get().load(url).into(view)
}