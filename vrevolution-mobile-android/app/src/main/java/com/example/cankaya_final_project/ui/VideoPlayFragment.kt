package com.example.cankaya_final_project.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import androidx.fragment.app.Fragment
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.databinding.FragmentHomeBinding
import com.example.cankaya_final_project.databinding.FragmentVideoPlayBinding

class VideoPlayFragment : Fragment() {
    private lateinit var binding : FragmentVideoPlayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Video oynatma ekranını başlatmak için gerekli işlemleri yapın
        binding = FragmentVideoPlayBinding.inflate(inflater, container, false)

        val rootView = binding.root
        val videoUrl = arguments?.getString("videoUrl") ?: ""
        val backImage = arguments?.getInt("backImage") ?:""
        val webView = binding.videoView
        webView.loadData(videoUrl,"text/html","utf-8")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()

        rootView.setBackgroundResource(backImage as Int)


        return binding.root

    }
}
