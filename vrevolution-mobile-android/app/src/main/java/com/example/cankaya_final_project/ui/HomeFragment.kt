package com.example.cankaya_final_project.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.model.Video
import com.example.cankaya_final_project.adapters.VideoAdapter
import com.example.cankaya_final_project.databinding.FragmentHomeBinding


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
            Video("Uzay Ve Gezegenler", "Güneş sistemi ve gezegenlerin özellikleri", R.drawable.baseline_smart_display_24),
            Video("Sürtünme Kuvveti", "Sürtünme kuvveti ve etkileri", R.drawable.baseline_smart_display_24),
            Video("Elektrik Devreleri", "Video Açıklaması 3", R.drawable.baseline_smart_display_24),
            Video("Vücudumuzdaki Sistemler", "Vücudumuzdaki sistemler ve görevleri", R.drawable.baseline_smart_display_24),
            Video("Kimyasal Olaylar", "Kimyasal tepkimeler", R.drawable.baseline_smart_display_24),

        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Kullanıcı bu fragment'tayken geri tuşuna basarsa, uygulamayı kapat
                requireActivity().finish()
            }
        })


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
                            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
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