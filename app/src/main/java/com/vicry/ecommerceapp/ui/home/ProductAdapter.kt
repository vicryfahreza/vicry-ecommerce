package com.vicry.ecommerceapp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.vicry.ecommerceapp.R
import com.vicry.ecommerceapp.databinding.ProductItemBinding
import com.vicry.ecommerceapp.model.Product

class ProductAdapter(private val listProduct: ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ProductItemBinding.bind(view)

        fun bindItem(product: Product){
            with(binding) {
                Picasso.get().load(product.photoUrl).into(ivPhoto)
                tvTitle.text = product.title
                tvPrice.text = product.price.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        )
    }

    override fun getItemCount(): Int = listProduct.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(listProduct[position])
    }

}