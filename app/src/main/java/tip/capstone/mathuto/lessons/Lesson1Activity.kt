package tip.capstone.mathuto.lessons

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import com.google.android.material.tabs.TabLayout
import tip.capstone.mathuto.R
import tip.capstone.mathuto.adapter.Lesson1TabAdapter
import tip.capstone.mathuto.databinding.Lesson1Binding
import tip.capstone.mathuto.menu.DevelopmentTeamActivity
import tip.capstone.mathuto.menu.IntroductoryMessageActivity
import tip.capstone.mathuto.menu.TableOfContentsActivity

class Lesson1Activity : AppCompatActivity() {

    private lateinit var binding: Lesson1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Lesson1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item_lessons, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_introductory_message -> {
                val intent = Intent(applicationContext, IntroductoryMessageActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.action_table_of_contents -> {
                val intent = Intent(applicationContext, TableOfContentsActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.action_development_team_of_the_module -> {
                val intent = Intent(applicationContext, DevelopmentTeamActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}