package com.example.facebookclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(private val list: List<StoryData>) :
    RecyclerView.Adapter<StoryAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_list, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ownerImg: ImageView = itemView.findViewById(R.id.story_owner_img)
        val ownerName: TextView = itemView.findViewById(R.id.story_owner_name)
        val ownerStory: ImageView = itemView.findViewById(R.id.story)

        fun bind(item: StoryData) {
            ownerImg.setImageResource(item.ownerImg)
            ownerName.text = item.owenerName
            ownerStory.setImageResource(item.storyImg)
        }
    }
}
