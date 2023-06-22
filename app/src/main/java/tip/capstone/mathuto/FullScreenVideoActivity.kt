package tip.capstone.mathuto

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class FullScreenVideoActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simulation_video)

        window.statusBarColor = Color.parseColor("#000000")

        videoView = findViewById(R.id.videoView)

        val videoUriString = intent.getStringExtra("videoUri")
        val videoUri = Uri.parse(videoUriString)
        videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()
    }
}