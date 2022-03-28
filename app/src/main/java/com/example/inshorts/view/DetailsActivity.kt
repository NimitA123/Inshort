package com.example.inshorts.view

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import com.bumptech.glide.Glide
import com.example.inshorts.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setSupportActionBar(toolbar)
        var intent = intent
        var url = intent.getStringExtra("Url")
        webView.webViewClient = WebViewClient()
        if (url != null) {
            webView.loadUrl(url)
        }
    }
}