package com.example.tourism_app.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourism_app.R
import com.example.tourism_app.base.BaseActivity
import com.example.tourism_app.databinding.ActivityDetailBinding

class DetailActivity : BaseActivity<ActivityDetailBinding>() {
    override fun getVewBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun setUI() {

    }

    override fun setProcess() {

    }

}