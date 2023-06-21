package tip.capstone.mathuto.menu

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.databinding.MenuIntroductoryMessageBinding

class IntroductoryMessageActivity : AppCompatActivity() {

    private lateinit var binding: MenuIntroductoryMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MenuIntroductoryMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#F1F6F9")

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
    }
}