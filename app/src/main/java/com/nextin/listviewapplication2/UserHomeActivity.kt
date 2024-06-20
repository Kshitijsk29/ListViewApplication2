package com.nextin.listviewapplication2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nextin.listviewapplication2.databinding.ActivityUserHomeBinding
class UserHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding : ActivityUserHomeBinding by lazy {
            ActivityUserHomeBinding.inflate(layoutInflater)
        }
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       val name = intent.getStringExtra("name")
        val location = intent.getStringExtra("address")
        val contact = intent.getStringExtra("contact")
        val image = intent.getIntExtra("image", R.drawable.siraj)

        binding.tvName.text = name
        binding.tvLocation.text = location
        binding.tvContact.text = contact
        binding.profileImage.setImageResource(image)

        binding.btnGoBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}