package com.example.cankaya_final_project.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.Video
import com.example.cankaya_final_project.adapters.VideoAdapter
import com.example.cankaya_final_project.databinding.FragmentHomeBinding
import com.example.cankaya_final_project.databinding.FragmentQuestionsBinding


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
            Video("Video Başlığı 3", "Video Açıklaması 3", R.drawable.baseline_smart_display_24)

        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // LayoutManager'ı ve Adapter'ı ayarlıyoruz
        binding.recViewVideo.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        videoAdapter = VideoAdapter(videoList)
        binding.recViewVideo.adapter = videoAdapter
    }
}