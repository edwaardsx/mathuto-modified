package tip.capstone.mathuto.tutorial

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.Tutorial1Binding

class Tutorial1Activity : AppCompatActivity() {

    private lateinit var binding: Tutorial1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Tutorial1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#000000")

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tutorial1)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}