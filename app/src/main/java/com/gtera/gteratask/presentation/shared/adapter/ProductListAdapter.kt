package com.gtera.gteratask.presentation.shared.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gtera.gteratask.databinding.ProductItemBinding
import com.gtera.gteratask.presentation.shared.model.UiProduct

class ProductListAdapter(private val shoppingList: List<UiProduct>,private val onItemClicked: () -> Unit) :
    RecyclerView.Adapter<ProductItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
       return ProductItemViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
       holder.bind(shoppingList[position],onItemClicked)
    }

    override fun getItemCount(): Int {
        return shoppingList.size
    }

}



class ProductItemViewHolder(private val binding:  ProductItemBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(item: UiProduct, onItemClicked: () -> Unit) {
        binding.nameTextView.text =item.name
        binding.root.setOnClickListener {
            onItemClicked.invoke()
        }
    }

    companion object{
        fun create(parent: ViewGroup): ProductItemViewHolder {
            val binding  = ProductItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return ProductItemViewHolder(binding)
        }
    }
}
