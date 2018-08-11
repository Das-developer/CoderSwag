package com.example.bappi.coderswag.Services

import com.example.bappi.coderswag.models.Categories
import com.example.bappi.coderswag.models.Product

object DataServices {

    var categories = listOf(
            Categories("SHIRT","shirtimage"),
            Categories("HOODIE","hoodieimage"),
            Categories("HAT","hatimage"),
            Categories("DIGITAL","digitalgoodsimage"),
            Categories("SHIRT","shirtimage"),
            Categories("HOODIE","hoodieimage"),
            Categories("HAT","hatimage"),
            Categories("DIGITAL","digitalgoodsimage"),
            Categories("SHIRT","shirtimage"),
            Categories("HOODIE","hoodieimage"),
            Categories("HAT","hatimage"),
            Categories("DIGITAL","digitalgoodsimage")

    )

    var shirts = listOf(
            Product("Shirt1","$20","shirt1"),
            Product("Shirt2","$21","shirt2"),
            Product("Shirt3","$22","shirt3"),
            Product("Shirt4","$23","shirt4"),
            Product("Shirt5","$24","shirt5")
    )

    var hats = listOf(
            Product("hat1","$21","hat1"),
            Product("hat2","$22","hat2"),
            Product("hat3","$23","hat3"),
            Product("hat4","$24","hat4")
    )

    var hoodies = listOf(
            Product("hoodie1","$20","hoodie1"),
            Product("hoodie2","$21","hoodie2"),
            Product("hoodie3","$22","hoodie3"),
            Product("hoodie4","$23","hoodie4")
            )

    var digitals = listOf<Product>()

    fun getProduct(category: String): List<Product>{

        when (category) {
            "SHIRT" -> return shirts
            "HAT" -> return hats
            "HOODIE" -> return hoodies
            else -> return digitals
        }
    }

}