package tip.capstone.mathuto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tip.capstone.mathuto.sqlite.SQLiteHelper
import tip.capstone.mathuto.databinding.ActivityMainScoresBinding

class MainScoresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainScoresBinding
    lateinit var db: SQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = SQLiteHelper(this)

        binding = ActivityMainScoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val scores = db.getAllHighScores()
        if(scores.isEmpty()){
            binding.scoreNoContent.visibility = View.VISIBLE
            binding.cardViewLesoonOne.visibility  = View.GONE
            binding.cardViewLessonTwo.visibility  = View.GONE
            binding.cardViewLessonThree.visibility  = View.GONE
            binding.cardViewLessonFour.visibility  = View.GONE
            binding.cardViewLessonFive.visibility  = View.GONE
            binding.cardViewLessonSix.visibility  = View.GONE
            binding.cardViewLessonSeven.visibility  = View.GONE
            binding.cardViewLessonEight.visibility  = View.GONE
            binding.cardViewLessonNine.visibility  = View.GONE
            binding.cardViewLessonTen.visibility  = View.GONE
            binding.cardViewLessonEleven.visibility  = View.GONE
            binding.cardViewLessonTwelve.visibility  = View.GONE
            binding.cardViewLessonThirteen.visibility  = View.GONE
            binding.cardViewLessonFourteen.visibility  = View.GONE
            binding.cardViewLessonFifteen.visibility  = View.GONE
            binding.cardViewLessonSixteen.visibility  = View.GONE
            binding.cardViewLessonSeventeen.visibility  = View.GONE
            binding.cardViewLessonEighteen.visibility  = View.GONE
            binding.cardViewLessonNineteen.visibility  = View.GONE
        }else{
            binding.scoreNoContent.visibility = View.INVISIBLE


            binding.lessonOneHighScore.text = scores[0].score
            binding.cardViewLesoonOne.visibility  = View.VISIBLE

            if (scores.size > 1) {
                binding.lessonTwoHighScore.text = scores[1].score
                binding.cardViewLessonTwo.visibility = View.VISIBLE
            }
            if (scores.size > 2) {
                binding.lessonThreeHighScore.text = scores[2].score
                binding.cardViewLessonThree.visibility = View.VISIBLE
            }
            if (scores.size > 3) {
                binding.lessonFourHighScore.text = scores[3].score
                binding.cardViewLessonFour.visibility = View.VISIBLE
            }
            if (scores.size > 4) {
                binding.lessonFiveHighScore.text = scores[4].score
                binding.cardViewLessonFive.visibility = View.VISIBLE
            }
            if (scores.size > 5) {
                binding.lessonSixHighScore.text = scores[5].score
                binding.cardViewLessonSix.visibility = View.VISIBLE
            }
            if (scores.size > 6) {
                binding.lessonSevenHighScore.text = scores[6].score
                binding.cardViewLessonSeven.visibility = View.VISIBLE
            }
            if (scores.size > 7) {
                binding.lessonEightHighScore.text = scores[7].score
                binding.cardViewLessonEight.visibility = View.VISIBLE
            }
            if (scores.size > 8) {
                binding.lessonNineHighScore.text = scores[8].score
                binding.cardViewLessonNine.visibility = View.VISIBLE
            }
            if (scores.size > 9) {
                binding.lessonTenHighScore.text = scores[9].score
                binding.cardViewLessonTen.visibility = View.VISIBLE
            }
            if (scores.size > 10) {
                binding.lessonElevenHighScore.text = scores[10].score
                binding.cardViewLessonEleven.visibility = View.VISIBLE
            }
            if (scores.size > 11) {
                binding.lessonTwelveHighScore.text = scores[11].score
                binding.cardViewLessonTwelve.visibility = View.VISIBLE
            }
            if (scores.size > 12) {
                binding.lessonThirteenHighScore.text = scores[12].score
                binding.cardViewLessonThirteen.visibility = View.VISIBLE
            }
            if (scores.size > 13) {
                binding.lessonFourteenHighScore.text = scores[13].score
                binding.cardViewLessonFourteen.visibility = View.VISIBLE
            }
            if (scores.size > 14) {
                binding.lessonFifteenHighScore.text = scores[14].score
                binding.cardViewLessonFifteen.visibility = View.VISIBLE
            }
            if (scores.size > 15) {
                binding.lessonSixteenHighScore.text = scores[15].score
                binding.cardViewLessonSixteen.visibility = View.VISIBLE
            }
            if (scores.size > 16) {
                binding.lessonSeventeenHighScore.text = scores[16].score
                binding.cardViewLessonSeventeen.visibility = View.VISIBLE
            }
            if (scores.size > 17) {
                binding.lessonEighteenHighScore.text = scores[17].score
                binding.cardViewLessonEighteen.visibility = View.VISIBLE
            }
            if (scores.size > 18) {
                binding.lessonNineteenHighScore.text = scores[18].score
                binding.cardViewLessonNineteen.visibility = View.VISIBLE
            }
        }
        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}