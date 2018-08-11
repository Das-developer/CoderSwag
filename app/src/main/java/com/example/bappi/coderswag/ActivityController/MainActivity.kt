package com.example.bappi.coderswag.ActivityController

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.bappi.coderswag.Adapter.CategoryAdapter
import com.example.bappi.coderswag.Adapter.CategoryRecyclerAdapter
import com.example.bappi.coderswag.R
import com.example.bappi.coderswag.R.id.categoryListView
import com.example.bappi.coderswag.Services.DataServices
import com.example.bappi.coderswag.Utilites.EXTRA_CATEGORY
import com.example.bappi.coderswag.models.Categories
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this,DataServices.categories) { item ->

            val productIntent = Intent(this,ProductActivity::class.java)
            startActivity(productIntent)
            productIntent.putExtra(EXTRA_CATEGORY,item.title)
        }
        val layoutManager = LinearLayoutManager(this)


                //CategoryAdapter(this,DataServices.categories)
                //ArrayAdapter(this,android.R.layout.simple_list_item_1,DataServices.categories)
        categoryListView.adapter = adapter
        categoryListView.layoutManager = layoutManager
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            var category = DataServices.categories[position]
//            Toast.makeText(this,category.title,Toast.LENGTH_SHORT).show()
//        }
    }
}
