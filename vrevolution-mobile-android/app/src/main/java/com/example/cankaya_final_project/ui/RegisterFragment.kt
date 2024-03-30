package com.example.cankaya_final_project.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cankaya_final_project.databinding.FragmentRegisterBinding
import com.example.cankaya_final_project.api.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.model.User
import com.example.cankaya_final_project.model.UserResponse
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
class RegisterFragment : Fragment() {


    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.registerButton.setOnClickListener{
            registerUser()
        }
        binding.loginTextView.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }


    private fun registerUser() {
        val username = binding.Regusername.text.toString().trim()
        val email = binding.RegEmail.text.toString().trim()
        val password = binding.RegPassword.text.toString().trim()

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(context, "All fields are required", Toast.LENGTH_LONG).show()
            return
        }

        CoroutineScope(Dispatchers.Main).launch {
            try {
                val response = RetrofitClient.userService.createUser(User(username, email, password))
                if (response.isSuccessful) {
                    Toast.makeText(context, response.body()?.message ?: "User created successfully", Toast.LENGTH_LONG).show()
                } else {
                    val errorBody = response.errorBody()?.string()
                    val gson = Gson()
                    val errorResponse = gson.fromJson(errorBody, UserResponse::class.java)
                    val errorMessages = errorResponse.validationErrors?.map { entry -> "${entry.key}: ${entry.value}" }?.joinToString("\n")
                    Toast.makeText(context, errorMessages ?: "Registration failed", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(context, "An error occurred: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }


}