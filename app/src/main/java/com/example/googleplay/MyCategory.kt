package com.example.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyCategory(val categoryList: List<String>) : RecyclerView.Adapter<MyCategory.MyViewHolder>() {
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textView = row.findViewById<TextView>(R.id.number)
        val horizontalRecyclerView = row.findViewById<RecyclerView>(R.id.horizontalRecyclerView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.category_view,
            parent, false)
        return MyViewHolder(layout)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = categoryList[position]

        val innerData = listOf("App 1", "App 2", "App 3", "App 4", "App 5")
        val innerAdapter = InnerAdapter(innerData)
        holder.horizontalRecyclerView.apply {
            layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = innerAdapter
        }
    }
    override fun getItemCount(): Int = categoryList.size
}