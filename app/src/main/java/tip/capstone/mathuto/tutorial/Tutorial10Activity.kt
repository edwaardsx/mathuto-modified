package tip.capstone.mathuto.tutorial

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.Tutorial10Binding
import tip.capstone.mathuto.databinding.Tutorial1Binding

class Tutorial10Activity : AppCompatActivity() {

    private lateinit var binding: Tutorial10Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Tutorial10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tutorial10)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}