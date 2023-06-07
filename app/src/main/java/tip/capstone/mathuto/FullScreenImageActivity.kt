package tip.capstone.mathuto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class FullScreenImageActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_image)

        viewPager = findViewById(R.id.view_pager)

        val imageIndex = intent.getIntExtra("imageIndex", 0)
        val images = listOf(R.drawable.lesson_1_sample_1) // Add more images if needed

        val adapter = FullScreenImageAdapter(this, images)
        viewPager.adapter = adapter

        viewPager.setCurrentItem(imageIndex, false)
    }
}