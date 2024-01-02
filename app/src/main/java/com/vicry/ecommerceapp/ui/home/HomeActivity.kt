package com.vicry.ecommerceapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.vicry.ecommerceapp.databinding.ActivityMainBinding
import com.vicry.ecommerceapp.model.Product

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRv()
    }

    private fun initRv() {
        val products = arrayListOf<Product>()

        for(i in 0..100) {
            products.add(Product("Rendang Padang", "https://res.cloudinary.com/ddmaxq4xx/image/upload/v1703840577/restaurant/martabak_goring_zr6nn5.jpg", 20000))
        }

        binding.rvItem.apply {
            layoutManager = GridLayoutManager(this@HomeActivity, 2)
            adapter = ProductAdapter(products)
        }
    }

}