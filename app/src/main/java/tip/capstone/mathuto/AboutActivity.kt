package tip.capstone.mathuto

import android.graphics.Color
import android.os.Bundle
import android.view.WindowInsetsController
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.databinding.ActivityMainAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#F1F6F9")
        window.decorView.windowInsetsController?.setSystemBarsAppearance(
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
        )

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
    }
}