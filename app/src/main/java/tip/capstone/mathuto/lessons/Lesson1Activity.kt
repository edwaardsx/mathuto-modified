package tip.capstone.mathuto.lessons

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.widget.TooltipCompat
import com.google.android.material.tabs.TabLayout
import tip.capstone.mathuto.R
import tip.capstone.mathuto.adapter.Lesson1TabAdapter
import tip.capstone.mathuto.databinding.Lesson1Binding

class Lesson1Activity : AppCompatActivity() {

    private lateinit var binding: Lesson1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Lesson1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        showObjectives()

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Overview"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("What's In"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("What is It"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Simulation"))

        val tabAdapter = Lesson1TabAdapter(supportFragmentManager, binding.tabLayout.tabCount)
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

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }

        for (i in 0 until binding.tabLayout.tabCount) {
            val tab = binding.tabLayout.getTabAt(i)
            TooltipCompat.setTooltipText(tab?.view!!, null)
        }
    }

    private fun showObjectives() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.objectives_1)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnClose = dialog.findViewById<ImageButton>(R.id.btn_objectives_close)
        btnClose.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}