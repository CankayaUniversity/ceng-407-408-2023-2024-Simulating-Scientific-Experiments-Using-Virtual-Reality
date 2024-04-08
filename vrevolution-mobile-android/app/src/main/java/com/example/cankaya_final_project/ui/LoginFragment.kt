package com.example.cankaya_final_project.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.cankaya_final_project.MainActivity
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.databinding.FragmentLoginBinding
import com.example.cankaya_final_project.api.RetrofitClient
import com.example.cankaya_final_project.model.LoginUser
import com.example.cankaya_final_project.model.UserResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginFragment : Fragment() {


    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding= FragmentLoginBinding.inflate(inflater, container, false)


        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener{
            loginUser()

        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Kullanıcı bu fragment'tayken geri tuşuna basarsa, uygulamayı kapat
                requireActivity().finish()
            }
        })

        binding.registerTextView.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }



    }



    private fun loginUser() {
        val email = binding.logEmail.text.toString().trim()
        val password = binding.logPassword.text.toString().trim()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(context, "Email and Password required", Toast.LENGTH_SHORT).show()
        } else {
            CoroutineScope(Dispatchers.Main).launch {
                try {
                    val response = RetrofitClient.userService.loginUser(LoginUser(email, password))
                    if (response.isSuccessful) {
                        val sharedPref = activity?.getSharedPreferences("MyApp", AppCompatActivity.MODE_PRIVATE) ?: return@launch
                        with (sharedPref.edit()) {
                            putBoolean("isLoggedIn", true)
                            apply()
                        }
                        Toast.makeText(context, "Logged in Successfully", Toast.LENGTH_SHORT).show()
                        findNavController().navigate(R.id.action_loginFragment_to_homeFragment, null, NavOptions.Builder()
                            .setPopUpTo(R.id.loginFragment, true).build())

                    } else {
                        val errorMessage = response.errorBody()?.string() ?: "Unknown error"
                        Toast.makeText(context, "Login Failed: $errorMessage", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: Exception) {
                    Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }






}