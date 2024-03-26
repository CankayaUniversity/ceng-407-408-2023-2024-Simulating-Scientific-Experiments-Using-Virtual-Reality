package com.example.cankaya_final_project.adapters

import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.Video

class VideoAdapter(private val videoList:List<Video>): RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val videoTitle: TextView = itemView.findViewById(R.id.videoTitle)
        val videoDescription: TextView = itemView.findViewById(R.id.videoDescription)
        val videoPlay: ImageView = itemView.findViewById(R.id.videoPLayButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder:VideoViewHolder, position: Int) {
        val video = videoList[position]
        holder.videoTitle.text = video.title
        holder.videoDescription.text = video.description
        holder.videoPlay.setImageResource(R.drawable.baseline_smart_display_24)

    }

    override fun getItemCount(): Int {
     return videoList.size
    }

}