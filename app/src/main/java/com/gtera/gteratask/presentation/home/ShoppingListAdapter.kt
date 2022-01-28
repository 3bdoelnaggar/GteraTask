package com.gtera.gteratask.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gtera.gteratask.databinding.ShoppingItemBinding

class ShoppingListAdapter(private val shoppingList: List<UiShoppingItem>) :
    RecyclerView.Adapter<ShoppingItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingItemViewHolder {
       return ShoppingItemViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ShoppingItemViewHolder, position: Int) {
       holder.bind(shoppingList[position])
    }

    override fun getItemCount(): Int {
        return shoppingList.size
    }

}



class ShoppingItemViewHolder(private val binding:  ShoppingItemBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(item: UiShoppingItem) {
        binding.nameTextView.text =item.name
    }

    companion object{
        fun create(parent: ViewGroup): ShoppingItemViewHolder {
            val binding  = ShoppingItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return ShoppingItemViewHolder(binding)
        }
    }
}
