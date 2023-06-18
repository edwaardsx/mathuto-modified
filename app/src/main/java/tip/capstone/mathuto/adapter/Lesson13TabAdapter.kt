@file:Suppress("DEPRECATION")

package tip.capstone.mathuto.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import tip.capstone.mathuto.fragments.lesson13.OverviewFragment
import tip.capstone.mathuto.fragments.lesson13.SimulationFragment
import tip.capstone.mathuto.fragments.lesson13.WhatsNewFragment

@Suppress("DEPRECATION")
internal class Lesson13TabAdapter(fragmentManager: FragmentManager,
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
                SimulationFragment()
            }
            else -> getItem(position)

        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}