package tip.capstone.mathuto.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tip.capstone.mathuto.databinding.MenuTableOfContentsBinding

class TableOfContentsActivity : AppCompatActivity() {

    private lateinit var binding: MenuTableOfContentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MenuTableOfContentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            finish()
            overridePendingTransition(0, 0)
        }
    }
}