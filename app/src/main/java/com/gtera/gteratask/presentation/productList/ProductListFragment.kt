package com.gtera.gteratask.presentation.productList

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.ProductListFragmentBinding
import com.gtera.gteratask.presentation.shared.adapter.ProductListAdapter
import com.gtera.gteratask.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductListFragment : Fragment(R.layout.product_list_fragment) {

    private lateinit var productListViewModel: ProductListViewModel
    private val binding by viewBinding(ProductListFragmentBinding::bind)



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        productListViewModel =
            ViewModelProvider(this).get(ProductListViewModel::class.java)
        productListViewModel.stateLiveData.observe(viewLifecycleOwner){
            if(it!=null){
                binding.productListRecyclerView.adapter = ProductListAdapter(it.data)
            }
        }
    }

}