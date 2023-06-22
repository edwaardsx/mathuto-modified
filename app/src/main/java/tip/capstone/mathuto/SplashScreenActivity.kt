package tip.capstone.mathuto

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.databinding.ActivitySplashScreenBinding
import tip.capstone.mathuto.onboarding.OnBoardingActivity

@Suppress("DEPRECATION")
@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivitySplashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#303030")

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
            /*val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.splash_animation)
            animation.duration = 500
            animation.interpolator = AccelerateDecelerateInterpolator()
            binding.splashLogo.startAnimation(animation)*/
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }, 4000)
    }
}