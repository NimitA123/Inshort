package com.example.inshorts.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.inshorts.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var intent = intent
        var image1 = intent.getStringExtra("image").toString()
        Glide.with(applicationContext).load(image1).into(Containimage)
        var contain1 = intent.getStringExtra("contain").toString()
        textContain.text = contain1
        textContain1.text = contain1
        textContain2.text =contain1
       linearLayout.setOnClickListener {
           Detailtoolbar.visibility = View.GONE
           button.visibility = View.GONE
        }
    }
}