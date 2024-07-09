package com.example.tourism_app.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourism_app.data.model.Destination
import com.example.tourism_app.databinding.ItemPlacesBinding
import com.example.tourism_app.presentation.DetailActivity

class DestinationAdapter() : RecyclerView.Adapter<DestinationAdapter.DestinationViewHolder>() {

    private val destinationList: ArrayList<Destination> = ArrayList()

    fun setData(destinationList: List<Destination>) {
        this.destinationList.addAll(destinationList)
    }
    class DestinationViewHolder(val binding: ItemPlacesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(destinations: Destination) {
            binding.tvDestinationName.text = destinations.name
            binding.tvDestinationLocation.text = destinations.location
            binding.tvDestinationRating.text = destinations.rating.toString()
            binding.imgDestinationPhoto.setImageResource(destinations.image!!)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationViewHolder {
        val binding = ItemPlacesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DestinationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val destinations = destinationList[position]
        holder.bind(destinations)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DESTINATION, destinationList[holder.adapterPosition])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = destinationList.size

}