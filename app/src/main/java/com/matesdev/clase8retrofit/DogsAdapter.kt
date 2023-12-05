package com.matesdev.clase8retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DogsAdapter(val images: List<String>): RecyclerView.Adapter<DogsAdapter.DogViewHolder>() {

    inner class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = view.findViewById(R.id.imageView)

        fun bind(image: String){
            Picasso.get().load(image).into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return DogViewHolder(layoutInflater.inflate(R.layout.itemlist,parent, false))
    }


    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    //A cada uno de los item list mandele un pokemon
    override fun getItemCount(): Int {
        return images.size
    }

}