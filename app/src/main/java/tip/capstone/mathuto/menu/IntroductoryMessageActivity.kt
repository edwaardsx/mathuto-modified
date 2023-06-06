package tip.capstone.mathuto.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tip.capstone.mathuto.databinding.MenuIntroductoryMessageBinding

class IntroductoryMessageActivity : AppCompatActivity() {

    private lateinit var binding: MenuIntroductoryMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MenuIntroductoryMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
    }
}