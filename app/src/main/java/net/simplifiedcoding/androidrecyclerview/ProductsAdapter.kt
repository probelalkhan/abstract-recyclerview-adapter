package net.simplifiedcoding.androidrecyclerview

import net.simplifiedcoding.androidrecyclerview.databinding.ProductLayoutBinding

class ProductsAdapter : BaseRecyclerViewAdapter<Product, ProductLayoutBinding>() {

    override fun getLayout() = R.layout.product_layout

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ProductLayoutBinding>,
        position: Int
    ) {
        holder.binding.product = items[position]
        holder.binding.root.setOnClickListener {
            listener?.invoke(it, items[position], position)
        }
    }
}