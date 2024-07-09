package com.example.tourism_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourism_app.data.model.Destination
import com.example.tourism_app.databinding.ItemPlacesBinding

class DestinationAdapter(private val destinationList : List<Destination>) : RecyclerView.Adapter<DestinationAdapter.DestinationViewHolder>() {

    class DestinationViewHolder(val binding: ItemPlacesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(destinations: Destination) {
            binding.tvDestinationName.text = destinations.name
            binding.tvDestinationLocation.text = destinations.location
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
    }

    override fun getItemCount(): Int = destinationList.size

}