package com.example.tourism_app.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourism_app.R
import com.example.tourism_app.base.BaseActivity
import com.example.tourism_app.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    override fun getVewBinding(): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(layoutInflater)
    }

    override fun setUI() {
        TODO("Not yet implemented")
    }

    override fun setProcess() {
        TODO("Not yet implemented")
    }

}