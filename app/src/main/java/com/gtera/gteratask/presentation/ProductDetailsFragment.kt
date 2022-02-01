package com.gtera.gteratask.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.ProductDetailsFragmentBinding
import com.gtera.gteratask.databinding.ProductItemBinding
import com.gtera.gteratask.viewBinding


class ProductDetailsFragment : Fragment(R.layout.product_details_fragment) {

    private val navigationArgs by navArgs<ProductDetailsFragmentArgs>()
    private val binding by viewBinding (ProductDetailsFragmentBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fromDeepLinkTextView.text = navigationArgs.details

    }

}