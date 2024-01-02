package com.vicry.ecommerceapp.model

import com.google.gson.annotations.SerializedName

data class Product (
    @SerializedName("name")
    val title: String,

    @SerializedName("photo_url")
    val photoUrl: String,

    val price: Int,

//    val isOnSale: Boolean
)