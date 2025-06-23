package com.utad.examenjunio_pmdm_ignaciobonilla.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import com.utad.examenjunio_pmdm_ignaciobonilla.databinding.ItemInfoBinding
import com.utad.examenjunio_pmdm_ignaciobonilla.model.Model

class ItemViewHolder(view: View): ViewHolder(view) {
    private val binding = ItemInfoBinding.bind(view)

    fun bind(model: Model, onClickListener: (Model)-> Unit) {
        binding.tvName.text = model.title
//        Picasso.get().load(model.image)
//            .into(binding.ivProducto)
//        itemView.setOnClickListener{
//            onClickListener(model)
//        }
    }
}