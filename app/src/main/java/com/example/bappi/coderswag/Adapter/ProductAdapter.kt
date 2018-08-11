package com.example.bappi.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.bappi.coderswag.R
import com.example.bappi.coderswag.models.Product

class ProductAdapter (private var context: Context,
                      private var Products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Products.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindProduct(Products[position],context)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var productImage = itemView.findViewById<ImageView>(R.id.productImageId)
        var productName = itemView.findViewById<TextView>(R.id.productNameId)
        var productPrice = itemView.findViewById<TextView>(R.id.productPriceTextId)

        fun bindProduct(product: Product, context: Context) {

            val resourceId = context.resources.getIdentifier(product.image,"drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
        }

    }
}