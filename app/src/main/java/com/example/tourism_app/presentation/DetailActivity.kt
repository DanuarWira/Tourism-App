package com.example.tourism_app.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourism_app.R
import com.example.tourism_app.base.BaseActivity
import com.example.tourism_app.data.model.Destination
import com.example.tourism_app.databinding.ActivityDetailBinding
import java.text.DecimalFormat

class DetailActivity : BaseActivity<ActivityDetailBinding>() {



    override fun getVewBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun setUI() {
        setDestinationData()
    }

    override fun setProcess() {

    }

    private fun setDestinationData() {
        val destination = intent.getParcelableExtra<Destination>(EXTRA_DESTINATION)
        val formatter = DecimalFormat("#,###.##")
        if (destination != null) {
            val formattedPrice = formatter.format(destination.price)
            binding.tvDestination.text = destination.name
            binding.tvLocation.text = destination.location
            binding.tvDescription.text = destination.description
            binding.tvPrice.text = "Rp $formattedPrice/Person"
            binding.tvRating.text = destination.rating.toString()
            binding.ivImage.setImageResource(destination.image!!)
        }
    }

    companion object {
        const val EXTRA_DESTINATION = "extra_destination"
    }

}