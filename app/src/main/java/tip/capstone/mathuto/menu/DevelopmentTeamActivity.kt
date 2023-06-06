package tip.capstone.mathuto.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tip.capstone.mathuto.databinding.MenuDevelopmentTeamBinding

class DevelopmentTeamActivity : AppCompatActivity() {

    private lateinit var binding: MenuDevelopmentTeamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MenuDevelopmentTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }
    }
}