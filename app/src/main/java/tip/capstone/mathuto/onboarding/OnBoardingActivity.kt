package tip.capstone.mathuto.onboarding

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import tip.capstone.mathuto.MainActivity
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.OnBoardingLayoutBinding


class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: OnBoardingLayoutBinding
    private lateinit var sharedPref: SharedPreferences

    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlide(
                "Progress Monitoring",
                "Tracks and shows the progress of learners as they interact with learning materials and activities in the app. It offers valuable insights into their learning journey, keeping them motivated and informed about their achievements.",
                R.raw.onboarding_monitoring
            ),
            IntroSlide(
                "Lessons",
                "Focuses on specific topics or subjects presented in a structured manner to facilitate learning. It offers comprehensive content, such as text, images, tutorial videos, and quizzes, to ensure learners gain a well-rounded understanding of the topic.",
                R.raw.onboarding_lessons
            ),
            IntroSlide(
                "Read Aloud Speech",
                "This feature enables the application to read aloud the text content to learners using text-to-speech (TTS) technology. It converts written text into spoken words, allowing learners to listen to the content instead of reading it themselves.",
                R.raw.onboarding_read_aloud
            ),
            IntroSlide(
                "Simulation",
                "Refers to the use of interactive virtual environments or scenarios that replicate real-world situations. It enables learners to participate in realistic simulations, exercises, or activities that imitate authentic experiences, providing them with hands-on learning opportunities.",
                R.raw.onboarding_simulation
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OnBoardingLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPref = PreferenceManager.getDefaultSharedPreferences(this)

        if (sharedPref.getBoolean("onboarding_completed", false)) {
            startMainActivity()
        } else {
            val introSlides = listOf(
                IntroSlide(
                    "Progress Monitoring",
                    "A feature that tracks and displays the progress of learners as they engage with the learning materials and activities within the app. It provides users with valuable insights into their learning journey, helping them stay motivated and informed about their achievements.",
                        R.raw.onboarding_monitoring
                    ),
                IntroSlide(
                    "Lessons",
                    "It focus on specific topics or subjects that are organized and presented in a structured manner to facilitate learning. It provides learners with comprehensive content, including text, images, tutorial videos, and quizzes, to ensure a well-rounded understanding of the topic.",
                        R.raw.onboarding_lessons
                    ),
                IntroSlide(
                    "Read Aloud Speech",
                    "Read aloud speech that allows the application to audibly read the text content to the learners. It uses text-to-speech (TTS) technology to convert written text into spoken words, enabling learners to listen to the content rather than reading it themselves.",
                        R.raw.onboarding_read_aloud
                    ),
                IntroSlide(
                    "Simulation",
                    "Refers to the use of interactive, virtual environments or scenarios that replicate real-world situations or processes. It allows learners to engage in realistic simulations, exercises, or activities that mimic authentic experiences and provide hands-on learning opportunities.",
                        R.raw.onboarding_simulation
                    )
                )

            val introSliderAdapter = IntroSliderAdapter(introSlides)
            binding.introSliderViewPager.adapter = introSliderAdapter
            setupIndicators()
            setCurrentIndicator(0)

            binding.introSliderViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                @SuppressLint("SetTextI18n")
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    setCurrentIndicator(position)

                    if (position == introSliderAdapter.itemCount - 1) {
                        binding.buttonNext.text = "Let's Get Started"
                        binding.textSkipIntro.visibility = View.INVISIBLE
                        sharedPref.edit().putBoolean("onboarding_completed", true).apply()
                    } else {
                        binding.buttonNext.text = "Next"
                        binding.textSkipIntro.visibility = View.VISIBLE
                        sharedPref.edit().putBoolean("onboarding_completed", false).apply()
                    }
                }
            })

            binding.buttonNext.setOnClickListener {
                if (binding.introSliderViewPager.currentItem + 1 < introSliderAdapter.itemCount) {
                    binding.introSliderViewPager.currentItem += 1
                } else {
                    startMainActivity()
                }
            }

            binding.textSkipIntro.setOnClickListener {
                startMainActivity()
            }
        }
    }

    private fun startMainActivity() {
        Intent(applicationContext, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    private fun setupIndicators() {
        val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8, 0, 8, 0)

        for (i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )

                )
                this?.layoutParams = layoutParams
            }

            binding.indicatorContainer.addView(indicators[i])
        }
    }

    private fun setCurrentIndicator(index: Int) {
        val childCount = binding.indicatorContainer.childCount
        for (i in 0 until childCount) {
            val imageView = binding.indicatorContainer[i] as ImageView
            if (i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
            }
        }
    }
}