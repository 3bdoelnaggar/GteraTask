package com.gtera.gteratask.presentation.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.gtera.gteratask.R
import com.gtera.gteratask.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        viewModel.stateLiveData.observe(this) {
            if (it != null) {
                when (it) {
                    MainState.Authentication -> {
                        navController.setGraph(R.navigation.auth_navigation)
                        binding.navView.isVisible = false
                    }
                    MainState.Home -> {
                        navController.setGraph(R.navigation.mobile_navigation)
                        binding.navView.isVisible = true
                        val navView: BottomNavigationView = binding.navView
                        val appBarConfiguration = AppBarConfiguration(
                            setOf(
                                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
                            )
                        )
                        setupActionBarWithNavController(navController, appBarConfiguration)
                        navView.setupWithNavController(navController)
                    }
                }
            }
        }


    }
}