package com.danielecampogiani.state.main.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.danielecampogiani.state.R

class PlayerAdapter :
    ListAdapter<ViewPlayer, PlayerAdapter.ViewHolder>(DiffCallBack) {

    object DiffCallBack : DiffUtil.ItemCallback<ViewPlayer>() {
        override fun areItemsTheSame(oldItem: ViewPlayer, newItem: ViewPlayer): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: ViewPlayer,
            newItem: ViewPlayer
        ): Boolean = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_player, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val text: TextView = itemView.findViewById(R.id.text)

        fun bind(item: ViewPlayer) {
            image.load(item.imageUrl)
            text.text = item.text
        }
    }


}