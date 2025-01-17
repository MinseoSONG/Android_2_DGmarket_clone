package com.example.carrotmarket

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDAO {
    @Insert
    fun addProduct(product: Product)

    @Update
    fun updadteProduct(product: Product)

    @Delete
    fun deleteProduct(product: Product)

    @Query("SELECT * FROM ProductTable")
    fun getProducts() : List<Product>
//
//    @Query("SELECT * FROM ProductTable WHERE id=id")
//    fun getProductById(id:Int):Product
}