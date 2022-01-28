package com.gtera.gteratask.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.LoginFragmentBinding
import com.gtera.gteratask.viewBinding


class LoginFragment : Fragment(R.layout.login_fragment) {

   private val binding by viewBinding (LoginFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToSMSVerificationFragment()
            findNavController().navigate(action)
        }
    }

}