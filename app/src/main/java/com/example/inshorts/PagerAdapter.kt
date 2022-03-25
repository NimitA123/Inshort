package com.example.inshorts

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    var  tabCount:Int = 0
    override fun getCount(): Int {
        return 6
    }

    override fun getItem(position: Int): Fragment {
      when(position){
              0 -> return HomeFragment()
          1 -> return SportsFragment()
          2 -> return HealthFragment()
          3 -> return ScienceFragment()
          4 -> return EntertainmentFragment()
          5 -> return TechnologyFragment()
          else ->
          return TechnologyFragment()


      }

    }
    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "HOME"
            }
            1 -> {
                return "SPORTS"
            }
            2 -> {
                return "HEALTH"
            }
            3 -> {
                return "SCIENCE"
            }
            4 -> {
                return "ENTERTAINMENT"
            }
            5 -> {
                return "TECHNOLOGY"
            }
        }
        return super.getPageTitle(position)
    }

}