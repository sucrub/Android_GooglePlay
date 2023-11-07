package com.example.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InnerAdapter(val data: List<String>) : RecyclerView.Adapter<InnerAdapter.InnerViewHolder>() {
    class InnerViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textView = row.findViewById<TextView>(R.id.itemText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.inner_item_view, parent, false)
        return InnerViewHolder(layout)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.textView.text = data[position]
    }

    override fun getItemCount(): Int = data.size
}