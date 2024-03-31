package com.example.cankaya_final_project.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.Video
import com.example.cankaya_final_project.adapters.VideoAdapter
import com.example.cankaya_final_project.databinding.FragmentHomeBinding
import com.example.cankaya_final_project.databinding.FragmentQuestionsBinding
import com.example.cankaya_final_project.ui.quizUi.QuizFragment
import com.google.android.material.navigation.NavigationView


class HomeFragment : Fragment() {

    private lateinit var videoAdapter: VideoAdapter
    private lateinit var binding: FragmentHomeBinding
    private lateinit var videoList: List<Video> // Global video listesi tanımı


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Video listesini burada başlatıyoruz
        videoList = listOf(
            Video("Video Başlığı 1", "Video Açıklaması 1", R.drawable.baseline_smart_display_24),
            Video("Video Başlığı 2", "Video Açıklaması 2", R.drawable.baseline_smart_display_24),
            Video("Video Başlığı 3", "Video Açıklaması 3", R.drawable.baseline_smart_display_24),
            Video("Video Başlığı 4", "Video Açıklaması 4", R.drawable.baseline_smart_display_24),
            Video("Video Başlığı 5", "Video Açıklaması 5", R.drawable.baseline_smart_display_24),

        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Toolbar'ı tanımla ve ayarla
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar_home)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // ActionBarDrawerToggle ile DrawerLayout ve Toolbar'ı entegre et
        val drawerLayout = binding.drawerLayout
        val navigationView = binding.navView
        val toggle = ActionBarDrawerToggle(
            activity, drawerLayout, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // RecyclerView için LayoutManager ve Adapter'ı ayarla
        binding.recViewVideo.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        videoAdapter = VideoAdapter(videoList)
        binding.recViewVideo.adapter = videoAdapter


        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_profile -> {
                    // ProfileFragment'a yönlendir
                    findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                }
                R.id.nav_videos -> {
                    // HomeFragment'a yönlendir (veya gerekiyorsa başka bir işlem yap)
                    findNavController().navigate(R.id.action_homeFragment_self)
                }
                R.id.nav_quizzes -> {
                    // QuizFragment'a yönlendir
                    findNavController().navigate(R.id.action_homeFragment_to_quizFragment)
                }
                R.id.nav_logout -> {

                    AlertDialog.Builder(requireContext())
                        .setTitle("Çıkış Yap")
                        .setMessage("Çıkmak istediğinizden emin misiniz?")
                        .setPositiveButton("Evet") { dialog, which ->
                            // Kullanıcı evet dediğinde çıkış yapma işlemlerini gerçekleştir
                            val sharedPref = activity?.getSharedPreferences("MyApp", AppCompatActivity.MODE_PRIVATE) ?: return@setPositiveButton
                            with(sharedPref.edit()) {
                                putBoolean("isLoggedIn", false)
                                commit()
                            }
                            // Kullanıcıyı giriş ekranına yönlendir
                            findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
                            Toast.makeText(activity, "Logged Out", Toast.LENGTH_SHORT).show()
                        }
                        .setNegativeButton("Hayır", null) // Kullanıcı hayır dediğinde hiçbir şey yapma
                        .show()
                }
                else -> false
            }
            // Drawer'ı kapat
            drawerLayout.closeDrawers()
            true
        }
    }




}