package com.example.tourism_app.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private var _binding: VB? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getVewBinding()
        setContentView(binding.root)

        setUI()
        setProcess()
    }

    abstract fun getVewBinding() : VB

    abstract fun setUI()

    abstract fun setProcess()
}