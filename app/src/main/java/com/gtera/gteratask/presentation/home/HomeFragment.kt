package com.gtera.gteratask.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.HomeFragmentBinding
import com.gtera.gteratask.viewBinding

class HomeFragment : Fragment(R.layout.home_fragment) {

    private lateinit var homeViewModel: HomeViewModel
    private val binding by viewBinding (HomeFragmentBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        homeViewModel.stateLiveData.observe(viewLifecycleOwner){
            if(it!=null){
                binding.greetingTextView.text=it.greeting
                binding.shoppingListRecyclerView.adapter = ShoppingListAdapter(it.shoppingList)
            }
        }
    }
}