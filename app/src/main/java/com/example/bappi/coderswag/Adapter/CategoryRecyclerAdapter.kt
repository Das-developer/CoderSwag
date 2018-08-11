package com.example.bappi.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.bappi.coderswag.R
import com.example.bappi.coderswag.models.Categories

class CategoryRecyclerAdapter(private val context: Context,
                              private val categories: List<Categories>,
                              val itemClicked: (Categories) -> Unit): RecyclerView.Adapter<CategoryRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.categories_list_row,parent,false)
        return ViewHolder(view,itemClicked)

    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(categories[position],context)
    }

   inner class ViewHolder(itemView : View, val itemClicked: (Categories) -> Unit) : RecyclerView.ViewHolder(itemView) {
        var categoriesImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        var categoriesName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindItem (category: Categories, context: Context) {

            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoriesImage.setImageResource(resourceId)
            categoriesName.text = category.title
            itemView.setOnClickListener { itemClicked(category) }
        }

    }
}