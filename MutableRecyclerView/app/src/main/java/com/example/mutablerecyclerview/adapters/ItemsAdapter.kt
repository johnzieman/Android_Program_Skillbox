package com.example.mutablerecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mutablerecyclerview.R
import kotlinx.android.synthetic.main.item_view.view.*

class ItemsAdapter: RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
    var numbers = mutableListOf<Int>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val numb = numbers[position]
        holder.number.text = numb.toString()
    }

    override fun getItemCount() = numbers.size

    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val number = itemView.textView
        val button = itemView.button
    }
}