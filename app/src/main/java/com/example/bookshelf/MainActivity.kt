package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.bookshelf.databinding.ActivityMainBinding
import com.example.bookshelf.features.home.view.HomeFragment
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = Navigation.findNavController(this, R.id.fragmentNavHost)
        setupWithNavController(binding.bottomNavigation, navController)

        binding.bottomNavigation.menu.getItem(0).setOnMenuItemClickListener {
            findNavController(R.id.fragmentNavHost).navigate(R.id.homeFragment)
            binding.bottomNavigation.menu.getItem(0).isChecked = true
            true
        }
        binding.bottomNavigation.menu.getItem(1).setOnMenuItemClickListener {
            findNavController(R.id.fragmentNavHost).navigate(R.id.searchFragment)
            binding.bottomNavigation.menu.getItem(1).isChecked = true
            true
        }
        binding.bottomNavigation.menu.getItem(2).setOnMenuItemClickListener {
            findNavController(R.id.fragmentNavHost).navigate(R.id.profileFragment)
            binding.bottomNavigation.menu.getItem(2).isChecked = true
            true
        }
    }
}