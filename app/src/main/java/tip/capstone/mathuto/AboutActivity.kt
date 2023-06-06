package tip.capstone.mathuto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tip.capstone.mathuto.databinding.ActivityMainAboutBinding
import tip.capstone.mathuto.databinding.ActivityMainBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
    }
}