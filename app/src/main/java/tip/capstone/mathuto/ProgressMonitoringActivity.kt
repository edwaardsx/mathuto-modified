package tip.capstone.mathuto

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import tip.capstone.mathuto.adapter.ProgressMonitoringTabAdapter
import tip.capstone.mathuto.databinding.ActivityProgressMonitoringBinding

class ProgressMonitoringActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProgressMonitoringBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgressMonitoringBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#2b163f")
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Lock"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("In Progress"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Done"))

        val tabAdapter = ProgressMonitoringTabAdapter(supportFragmentManager, binding.tabLayout.tabCount)
        binding.viewPager.adapter = tabAdapter

        binding.viewPager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                binding.tabLayout
            )
        )
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viewPager.currentItem = tab!!.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}