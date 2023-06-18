@file:Suppress("DEPRECATION")

package tip.capstone.mathuto.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import tip.capstone.mathuto.fragments.lesson15.OverviewFragment
import tip.capstone.mathuto.fragments.lesson15.SimulationFragment
import tip.capstone.mathuto.fragments.lesson15.WhatsNewFragment
import tip.capstone.mathuto.fragments.lesson15.WhatIsItFragment

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
                WhatsNewFragment()
            }
            2 -> {
                WhatIsItFragment()
            }
            3 -> {
                SimulationFragment()
            }
            else -> getItem(position)

        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}