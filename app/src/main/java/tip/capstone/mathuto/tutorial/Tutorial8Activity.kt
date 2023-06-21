package tip.capstone.mathuto.tutorial

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.Tutorial8Binding

class Tutorial8Activity : AppCompatActivity() {

    private lateinit var binding: Tutorial8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Tutorial8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#000000")

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tutorial8)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}