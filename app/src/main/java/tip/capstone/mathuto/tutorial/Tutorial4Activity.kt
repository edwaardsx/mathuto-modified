package tip.capstone.mathuto.tutorial

import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.Tutorial1Binding
import tip.capstone.mathuto.databinding.Tutorial2Binding
import tip.capstone.mathuto.databinding.Tutorial3Binding
import tip.capstone.mathuto.databinding.Tutorial4Binding

class Tutorial4Activity : AppCompatActivity() {

    private lateinit var binding: Tutorial4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Tutorial4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#000000")

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tutorial4)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}