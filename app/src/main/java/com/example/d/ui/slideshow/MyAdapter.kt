package com.example.d.ui.slideshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.d.R

class MyAdapter(var iPhoneProducts: ArrayList<Products>, var context: SlideshowFragment)
    :RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        val iphoneImage = itemView.findViewById<ImageView>(R.id.iPhoneImage)!!


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = iPhoneProducts[position]
        holder.iphoneImage.setImageResource(currentItem.imageArray)


    }

    override fun getItemCount(): Int {
        return iPhoneProducts.size
    }
}


