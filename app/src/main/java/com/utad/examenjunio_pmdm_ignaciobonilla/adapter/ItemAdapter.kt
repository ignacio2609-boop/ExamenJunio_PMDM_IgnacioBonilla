package com.utad.examenjunio_pmdm_ignaciobonilla.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utad.examenjunio_pmdm_ignaciobonilla.model.Model

class ItemAdapter(private var itemList: MutableList<Model>, private val onClickListener: (Model) -> Unit):
    RecyclerView.Adapter<ItemViewHolder>() {
        fun updateData(newItems: List<Model>) {
            val size = itemList.size
            itemList.clear()
            notifyItemRangeRemoved(0, size)
            itemList.addAll(newItems)
            val newSize = itemList.size
            notifyItemRangeInserted(0, newSize)
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = itemList.size
}