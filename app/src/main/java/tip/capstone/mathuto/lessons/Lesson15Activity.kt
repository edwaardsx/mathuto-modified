package tip.capstone.mathuto.lessons

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import tip.capstone.mathuto.R
import tip.capstone.mathuto.adapter.Lesson15TabAdapter
import tip.capstone.mathuto.databinding.Lesson15Binding
import tip.capstone.mathuto.menu.DevelopmentTeamActivity
import tip.capstone.mathuto.menu.IntroductoryMessageActivity
import tip.capstone.mathuto.menu.TableOfContentsActivity
import tip.capstone.mathuto.sqlite.SQLiteHelper

class Lesson15Activity : AppCompatActivity() {

    private lateinit var binding: Lesson15Binding
    private lateinit var db: SQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Lesson15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#304FFE")
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        db = SQLiteHelper(this)
        db.deleteQuestion()

        showObjectives()

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Overview"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("What's In"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("What's New"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("What is It"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Simulation"))

        val tabAdapter = Lesson15TabAdapter(supportFragmentManager, binding.tabLayout.tabCount)
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
        dialog.setContentView(R.layout.objectives_15)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnClose = dialog.findViewById<ImageButton>(R.id.btn_objectives_close)
        btnClose.setOnClickListener {
            dialog.dismiss()
        }
        val btnGetStarted = dialog.findViewById<Button>(R.id.btn_lets_get_started)
        btnGetStarted.setOnClickListener {
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