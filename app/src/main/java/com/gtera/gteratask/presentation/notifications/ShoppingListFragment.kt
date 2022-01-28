package com.gtera.gteratask.presentation.notifications

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.ShoppingListFragmentBinding
import com.gtera.gteratask.presentation.shared.adapter.ShoppingListAdapter
import com.gtera.gteratask.viewBinding

class ShoppingListFragment : Fragment(R.layout.shopping_list_fragment) {

    private lateinit var shoppingListViewModel: ShoppingListViewModel
private val binding by viewBinding (ShoppingListFragmentBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shoppingListViewModel =
            ViewModelProvider(this).get(ShoppingListViewModel::class.java)
        shoppingListViewModel.stateLiveData.observe(viewLifecycleOwner){
            if(it!=null){
               binding.shoppingListRecyclerView.adapter = ShoppingListAdapter(it)
            }
        }

    }

}