package com.utad.examenjunio_pmdm_ignaciobonilla.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import com.utad.examenjunio_pmdm_ignaciobonilla.databinding.ItemInfoBinding
import com.utad.examenjunio_pmdm_ignaciobonilla.model.DatosReceta
import com.utad.examenjunio_pmdm_ignaciobonilla.model.Model

class ItemViewHolder(view: View): ViewHolder(view) {
    private val binding = ItemInfoBinding.bind(view)

    fun bind(model: DatosReceta, onClickListener: (DatosReceta) -> Unit) {
      binding.tvName.text = model.name
        Picasso.get().load(model.image)
            .into(binding.ivImage)
        itemView.setOnClickListener{
            onClickListener(model)
        }
    }
}