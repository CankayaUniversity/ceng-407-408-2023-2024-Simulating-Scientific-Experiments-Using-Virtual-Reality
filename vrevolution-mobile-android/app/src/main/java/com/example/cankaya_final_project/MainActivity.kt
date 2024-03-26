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

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var navController:NavController
    private lateinit var binding: ActivityMainBinding
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        val toggle = ActionBarDrawerToggle(this,binding.drawerLayout,binding.toolbar,R.string.nav_open,R.string.nav_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navDrawer.setNavigationItemSelectedListener(this)

        fragmentManager=supportFragmentManager
        openFragment(HomeFragment())

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_login->openFragment(LoginFragment())
            R.id.nav_register->openFragment(RegisterFragment())
            R.id.nav_profile->openFragment(ProfileFragment())
            R.id.nav_videos->openFragment(HomeFragment())
            R.id.nav_quizzes->openFragment(QuizFragment())
            R.id.nav_logout->Toast.makeText(this,"Logged Out",Toast.LENGTH_SHORT).show()
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    override fun onBackPressed() {
        super.onBackPressed()

        if(binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressedDispatcher.onBackPressed()
        }

    }


    private fun openFragment(fragment: Fragment){
        val fragTransaction :  FragmentTransaction=fragmentManager.beginTransaction()
        fragTransaction.replace(R.id.nav_host_fragment,fragment)
        fragTransaction.commit()

    }






}