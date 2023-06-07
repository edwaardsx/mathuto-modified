package tip.capstone.mathuto

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import tip.capstone.mathuto.databinding.ActivityMainBinding
import tip.capstone.mathuto.lessons.Lesson1Activity
import tip.capstone.mathuto.recycler.Data
import tip.capstone.mathuto.recycler.RecyclerViewAdapter

class MainActivity : AppCompatActivity(), RecyclerViewAdapter.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carouselView: CarouselView
    private lateinit var recyclerAdapter: RecyclerViewAdapter
    private lateinit var searchView: SearchView

    private var isSearching = false

    private val carouselImages = intArrayOf(
        R.drawable.carousel_1,
        R.drawable.carousel_2,
        R.drawable.carousel_3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = ""

        carouselView = findViewById(R.id.carouselView)
        carouselView.pageCount = carouselImages.size
        carouselView.setImageListener(imageListener)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val dataList = listOf(
            Data(R.drawable.recycler_img_1,
                "Addition and Subtraction of Fractions",
                "Lesson 1"),
            Data(R.drawable.recycler_img_2,
                "Problem Solving Involving Addition and Subtraction of Fractions",
                "Lesson 2"),
            Data(R.drawable.recycler_img_3,
                "Multiplication of Simple Fractions and Mixed Fractions",
                "Lesson 3"),
            Data(R.drawable.recycler_img_4,
                "Problem Solving on Multiplication of Fractions",
                "Lesson 4"),
            Data(R.drawable.recycler_img_5,
                "Dividing Simple Fractions and Mixed Fractions",
                "Lesson 5"),
            Data(R.drawable.recycler_img_1,
                "Solving Routine or Non-Routine Problems Involving Division Without or With Any of the Other Operations of Fractions and Mixed Fractions",
                "Lesson 6"),
            Data(R.drawable.recycler_img_2,
                "Addition and Subtraction of Fractions",
                "Lesson 7"),
            Data(R.drawable.recycler_img_3,
                "Solving Routine or Non-Routine Problems Involving Addition and Subtraction of Decimals and Mixed Decimals Using Appropriate Problem Solving Strategies and Tools",
                "Lesson 8"),
            Data(R.drawable.recycler_img_4,
                "Multiplication of Decimals and Mixed Decimals",
                "Lesson 9"),
            Data(R.drawable.recycler_img_5,
                "Multiplication of Decimals and Mixed Decimals Mentally by 0.1, 0.01, 10 and 100",
                "Lesson 10"),
            Data(R.drawable.recycler_img_1,
                "Problem-Solving on Multiplication of Decimals",
                "Lesson 11"),
            Data(R.drawable.recycler_img_2,
                "Multi-Step Problems Involving Multiplication and Addition or Subtraction of Decimals",
                "Lesson 12"),
            Data(R.drawable.recycler_img_3,
                "Dividing Whole Numbers by Decimals Up 2 Decimal Places",
                "Lesson 13"),
            Data(R.drawable.recycler_img_4,
                "Dividing Decimals/Mixed Decimals",
                "Lesson 14"),
            Data(R.drawable.recycler_img_5,
                "Dividing Decimals Up to 4 Decimal Places by 0.1, 0.01 and 0.001",
                "Lesson 15"),
            Data(R.drawable.recycler_img_1,
                "Dividing Decimals Up to 2 Decimal Places by 10, 100 and 1000 Mentally",
                "Lesson 16"),
            Data(R.drawable.recycler_img_2,
                "Differentiating Repeating from Terminating and Non-Terminating Decimal Quotient",
                "Lesson 17"),
            Data(R.drawable.recycler_img_3,
                "Solving Word Problems Involving Division of Decimals",
                "Lesson 18"),
            Data(R.drawable.recycler_img_4,
                "Solving Multi-Step Problems Involving Division of Decimals and Any of the Other Operations",
                "Lesson 19"),
        )
        val adapter = RecyclerViewAdapter(dataList, this)
        recyclerAdapter = adapter

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onItemClick(data: Data) {
        val intent = when (data.lesson) {
            "Lesson 1" -> Intent(this, Lesson1Activity::class.java)
            else -> null
        }
        intent?.let {
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }

    private val imageListener = ImageListener { position, imageView ->
        val imagePosition = position % carouselImages.size
        imageView.setImageResource(carouselImages[imagePosition])
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item_main, menu)

        val searchItem = menu?.findItem(R.id.search)
        val searchView = searchItem?.actionView as SearchView
        searchView.queryHint = "Search for lessons, modules & title"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return true
            }
            override fun onQueryTextChange(newText: String): Boolean {
                recyclerAdapter.filter(newText)
                isSearching = newText.isNotEmpty()
                updateCarouselVisibility()
                return true
            }
        })
        return true
    }

    @SuppressLint("SetTextI18n")
    private fun updateCarouselVisibility() {
        if (isSearching) {
            carouselView.visibility = View.GONE
            if (recyclerAdapter.itemCount == 0) {
                binding.tvLessons.text = "No results found"
            }
        } else {
            carouselView.visibility = View.VISIBLE
            binding.tvLessons.text = "Lessons"
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (isSearching) {
            if (searchView.query.isBlank()) {
                isSearching = false
                updateCarouselVisibility()
            }
            recyclerAdapter.filter("")
        } else {
            super.onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                val intent = Intent(applicationContext, AboutActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.list_of_quiz_score -> {
                val intent = Intent(applicationContext, MainScoresActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)
            }
            R.id.search -> {
                isSearching = true
                updateCarouselVisibility()
            }
            else -> super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        var WATCHED_TUTORIAL1: Boolean = false
        var WATCHED_TUTORIAL2: Boolean = false
        var WATCHED_TUTORIAL3: Boolean = false
        var WATCHED_TUTORIAL4: Boolean = false
        var WATCHED_TUTORIAL5: Boolean = false
        var WATCHED_TUTORIAL6: Boolean = false
        var WATCHED_TUTORIAL7: Boolean = false
        var WATCHED_TUTORIAL8: Boolean = false
        var WATCHED_TUTORIAL9: Boolean = false
        var WATCHED_TUTORIAL10: Boolean = false
        var WATCHED_TUTORIAL11: Boolean = false
        var WATCHED_TUTORIAL12: Boolean = false
        var WATCHED_TUTORIAL13: Boolean = false
        var WATCHED_TUTORIAL14: Boolean = false
        var WATCHED_TUTORIAL15: Boolean = false
        var WATCHED_TUTORIAL16: Boolean = false
        var WATCHED_TUTORIAL17: Boolean = false
        var WATCHED_TUTORIAL18: Boolean = false
        var WATCHED_TUTORIAL19: Boolean = false

        var QUIZ1_PASSED: Boolean = false
        var QUIZ2_PASSED: Boolean = false
        var QUIZ3_PASSED: Boolean = false
        var QUIZ4_PASSED: Boolean = false
        var QUIZ5_PASSED: Boolean = false
        var QUIZ6_PASSED: Boolean = false
        var QUIZ7_PASSED: Boolean = false
        var QUIZ8_PASSED: Boolean = false
        var QUIZ9_PASSED: Boolean = false
        var QUIZ10_PASSED: Boolean = false
        var QUIZ11_PASSED: Boolean = false
        var QUIZ12_PASSED: Boolean = false
        var QUIZ13_PASSED: Boolean = false
        var QUIZ14_PASSED: Boolean = false
        var QUIZ15_PASSED: Boolean = false
        var QUIZ16_PASSED: Boolean = false
        var QUIZ17_PASSED: Boolean = false
        var QUIZ18_PASSED: Boolean = false
        var QUIZ19_PASSED: Boolean = false

        const val COMPLETED: String = "Complete"
        const val LOCK: String = "Lock"
        const val ONGOING: String = "OnGoing"
    }
}