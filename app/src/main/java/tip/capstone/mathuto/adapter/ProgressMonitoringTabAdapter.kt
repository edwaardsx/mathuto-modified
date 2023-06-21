package tip.capstone.mathuto.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import tip.capstone.mathuto.fragments.progress_monitoring.DoneFragment
import tip.capstone.mathuto.fragments.progress_monitoring.InProgressFragment
import tip.capstone.mathuto.fragments.progress_monitoring.LockFragment

class ProgressMonitoringTabAdapter(fragmentManager: FragmentManager,
                                   private var totalTabs: Int):
    FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                LockFragment()
            }
            1 -> {
                InProgressFragment()
            }
            2 -> {
                DoneFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}