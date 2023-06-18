package tip.capstone.mathuto.tutorial

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.Tutorial1Binding
import tip.capstone.mathuto.databinding.Tutorial6Binding

class Tutorial6Activity : AppCompatActivity() {

    private lateinit var binding: Tutorial6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Tutorial6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tutorial6)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}