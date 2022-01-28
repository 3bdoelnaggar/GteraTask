package com.gtera.gteratask.presentation.smsVerification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.SmsVerificationFragmentBinding
import com.gtera.gteratask.presentation.main.MainViewModel
import com.gtera.gteratask.viewBinding

class SmsVerificationFragment : Fragment(R.layout.sms_verification_fragment) {

   private val binding by viewBinding (SmsVerificationFragmentBinding::bind)


    private lateinit var viewModel: SmsVerificationViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[SmsVerificationViewModel::class.java]

        binding.doneButton.setOnClickListener {
           ViewModelProvider(requireActivity())[MainViewModel::class.java].startHome()
        }

    }


}