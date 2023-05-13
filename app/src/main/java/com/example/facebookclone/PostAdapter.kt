package com.example.facebookclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class PostAdapter(private val list: List<PostData>) :
    RecyclerView.Adapter<PostAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout,parent,false)
        return viewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val ownerName:TextView = itemView.findViewById(R.id.owener_name)
        val postCaption:TextView = itemView.findViewById(R.id.post_caption)
        val postTime:TextView = itemView.findViewById(R.id.post_time)
        val ownerImg:ImageView = itemView.findViewById(R.id.owner_img)
        val postImg:ImageView = itemView.findViewById(R.id.post_img)
        val reactCount:TextView = itemView.findViewById(R.id.react_count)
        val commentCout:TextView = itemView.findViewById(R.id.comment_count)
        val shareCount:TextView = itemView.findViewById(R.id.share_count)

        fun bind(item:PostData){

        }
    }
}
