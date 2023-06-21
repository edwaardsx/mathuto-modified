package tip.capstone.mathuto.menu

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.databinding.MenuTableOfContentsBinding

class TableOfContentsActivity : AppCompatActivity() {

    private lateinit var binding: MenuTableOfContentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MenuTableOfContentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#F1F6F9")

        binding.btnBack.setOnClickListener{
            finish()
            overridePendingTransition(0, 0)
        }
    }
}