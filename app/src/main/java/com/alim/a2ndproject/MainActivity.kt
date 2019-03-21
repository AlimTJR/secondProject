package com.alim.a2ndproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
        tabs_main.setupWithViewPager(viewpager_main)
        tabs_main.getTabAt(0)!!.setIcon(R.drawable.baseline_person_white_18dp)
        tabs_main.getTabAt(1)!!.setIcon(R.drawable.baseline_favorite_white_18dp)
        tabs_main.getTabAt(2)!!.setIcon(R.drawable.baseline_games_white_18dp)
        tabs_main.getTabAt(3)!!.setIcon(R.drawable.baseline_public_white_18dp)
    }
}
