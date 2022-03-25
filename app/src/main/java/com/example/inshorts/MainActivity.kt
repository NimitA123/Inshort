package com.example.inshorts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this is basically for the set adapter in the viewpager
        var pagerAdapter = PagerAdapter(supportFragmentManager)
        fragmentContainer.adapter = pagerAdapter
        tabLayout.setupWithViewPager(fragmentContainer)



    }
}