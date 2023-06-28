@file:Suppress("DEPRECATION")

package tip.capstone.mathuto.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import tip.capstone.mathuto.fragments.lesson15.*

@Suppress("DEPRECATION")
internal class Lesson15TabAdapter(fragmentManager: FragmentManager,
                                  private var totalTabs: Int):
    FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                OverviewFragment()
            }
            1 -> {
                WhatsInFragment()
            }
            2 -> {
                WhatsNewFragment()
            }
            3 -> {
                WhatIsItFragment()
            }
            4 -> {
                SimulationFragment()
            }
            else -> getItem(position)

        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}