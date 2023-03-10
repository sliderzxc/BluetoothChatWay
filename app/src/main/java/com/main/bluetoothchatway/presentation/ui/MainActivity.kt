package com.main.bluetoothchatway.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.main.bluetoothchatway.R
import com.main.bluetoothchatway.databinding.ActivityMainBinding
import com.main.core.base.BaseActivity

class MainActivity : BaseActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}