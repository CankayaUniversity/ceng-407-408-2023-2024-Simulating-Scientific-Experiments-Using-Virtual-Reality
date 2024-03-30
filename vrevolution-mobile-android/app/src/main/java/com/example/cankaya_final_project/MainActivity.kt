package com.example.cankaya_final_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import com.example.cankaya_final_project.databinding.ActivityMainBinding
import com.example.cankaya_final_project.ui.HomeFragment
import com.example.cankaya_final_project.ui.LoginFragment
import com.example.cankaya_final_project.ui.ProfileFragment
import com.example.cankaya_final_project.ui.RegisterFragment
import com.example.cankaya_final_project.ui.quizUi.QuizFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(){

    private lateinit var fragmentManager: FragmentManager
    private lateinit var navController:NavController
    private lateinit var binding: ActivityMainBinding
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }



}