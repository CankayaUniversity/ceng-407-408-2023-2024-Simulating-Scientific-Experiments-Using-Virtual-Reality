package com.example.cankaya_final_project.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.databinding.FragmentHomeBinding
import com.example.cankaya_final_project.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var binding:FragmentProfileBinding


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPref = activity?.getSharedPreferences("MyApp", Context.MODE_PRIVATE)
        val username = sharedPref?.getString("username", "NoName") ?: "NoName"
        val email = sharedPref?.getString("email", "---") ?: "---"


        binding.tvUsername.text=username
        binding.profileEmail.text = email

        binding.homeButton.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
        }



    }

}