package com.danielecampogiani.state.main.view

import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.danielecampogiani.state.R

class NationalityAdapter(
    private val listener: (ViewNationality) -> Unit
) :
    ListAdapter<ViewNationality, NationalityAdapter.ViewHolder>(DiffCallBack) {

    object DiffCallBack : DiffUtil.ItemCallback<ViewNationality>() {
        override fun areItemsTheSame(oldItem: ViewNationality, newItem: ViewNationality): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: ViewNationality,
            newItem: ViewNationality
        ): Boolean = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_nationality, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val text: TextView = itemView.findViewById(R.id.text)

        fun bind(item: ViewNationality, listener: (ViewNationality) -> Unit) {
            image.load(item.imageUrl)

            val spanText = SpannableString(item.text)
            if (item.selected) {
                spanText.setSpan(
                    UnderlineSpan(),
                    0,
                    spanText.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
            text.text = spanText

            itemView.setOnClickListener { listener(item) }
        }
    }

}