package com.example.bappi.coderswag.ActivityController

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.bappi.coderswag.Adapter.ProductAdapter
import com.example.bappi.coderswag.R
import com.example.bappi.coderswag.Services.DataServices
import com.example.bappi.coderswag.Utilites.EXTRA_CATEGORY
import com.example.bappi.coderswag.models.Product
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    private lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

       var categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(
                this,
                DataServices.getProduct(categoryType)
        )


//        var spamCount = 2
//
//        val orientation = resources.configuration.orientation
//
//        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            spamCount = 3
//        }

        val layoutManager = GridLayoutManager(this, 2)

        productListView.layoutManager = layoutManager as RecyclerView.LayoutManager?
        productListView.adapter = adapter
    }
}
