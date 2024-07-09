package com.example.tourism_app.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tourism_app.R
import com.example.tourism_app.adapter.DestinationAdapter
import com.example.tourism_app.base.BaseActivity
import com.example.tourism_app.data.model.Destination
import com.example.tourism_app.data.source.DestinationDataSource
import com.example.tourism_app.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    private lateinit var destinationAdapter: DestinationAdapter
    private var destinations: ArrayList<Destination> = arrayListOf()

    override fun getVewBinding(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun setUI() {
        setDestinationsData()
        destinations.addAll(DestinationDataSource.destinations)
        destinationAdapter.setData(destinations)
    }

    override fun setProcess() {}

    private fun setDestinationsData() {
        destinationAdapter = DestinationAdapter()
        binding.rvDestinations.layoutManager = LinearLayoutManager(this)
        binding.rvDestinations.adapter = destinationAdapter
    }

}