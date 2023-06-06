package tip.capstone.mathuto.quiz.result

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.capstone.mathuto.questions.Question1.CORRECT_ANS
import com.capstone.mathuto.questions.Question1.SELECTED_ANSWERS
import com.capstone.mathuto.questions.Question1.TOTAL_QUESTIONS
import com.capstone.mathuto.questions.Question1.UNANSWERED_QUESTIONS
import com.capstone.mathuto.questions.Question1.WRONG_ANS
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import tip.capstone.mathuto.MainActivity
import tip.capstone.mathuto.MainActivity.Companion.QUIZ1_PASSED
import tip.capstone.mathuto.MainActivity.Companion.WATCHED_TUTORIAL1
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.QuizResult1Binding
import tip.capstone.mathuto.lessons.Lesson1Activity
import tip.capstone.mathuto.quiz.summary.Summary1

class Result1Activity : AppCompatActivity() {

    private lateinit var binding: QuizResult1Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuizResult1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(CORRECT_ANS, 0)
        val wrongAnswer = intent.getIntExtra(WRONG_ANS, 0)
        val unansweredQuestion = intent.getIntExtra(UNANSWERED_QUESTIONS, 0)

        val entries = mutableListOf<PieEntry>()
        if (correctAnswer != 0) {
            entries.add(PieEntry(correctAnswer.toFloat(), "Correct"))
        }
        if (wrongAnswer != 0) {
            entries.add(PieEntry(wrongAnswer.toFloat(), "Wrong"))
        }
        if (unansweredQuestion != 0) {
            entries.add(PieEntry(unansweredQuestion.toFloat(), "Unanswered"))
        }

        val dataSet = PieDataSet(entries, "")
        val colors = mutableListOf<Int>()
        colors.add(Color.parseColor("#43A047"))
        colors.add(Color.parseColor("#E53935"))
        colors.add(Color.parseColor("#FFB300"))
        dataSet.colors = colors

        val data = PieData(dataSet)
        data.setValueTextSize(12f)
        data.setValueTextColor(Color.WHITE)
        data.setValueFormatter(object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
                return value.toInt().toString()
            }
        })

        binding.pieChart.data = data
        binding.pieChart.description.isEnabled = false
        binding.pieChart.setEntryLabelTextSize(12f)
        binding.pieChart.setEntryLabelColor(Color.WHITE)
        binding.pieChart.legend.isEnabled = false
        binding.pieChart.legend.textSize = 12f
        binding.pieChart.legend.textColor = Color.WHITE
        binding.pieChart.setDrawCenterText(true)
        binding.pieChart.centerText = "Result"
        binding.pieChart.legend.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
        binding.pieChart.legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        binding.pieChart.animateY(1000)
        binding.pieChart.invalidate()

        binding.tvScoreCorrect.text = "$correctAnswer"
        binding.tvScoreCorrect.setTextColor(Color.WHITE)

        binding.tvScoreWrong.text = "$wrongAnswer"
        binding.tvScoreWrong.setTextColor(Color.WHITE)

        binding.tvUnansweredQuestion.text = "$unansweredQuestion"
        binding.tvUnansweredQuestion.setTextColor(Color.WHITE)

        binding.totalNumberOfQuestions.text = "Total number of questions: $totalQuestions"
        binding.totalNumberOfQuestions.setTextColor(Color.WHITE)

        binding.btnBack.setOnClickListener{
            val intent = Intent(applicationContext,  Lesson1Activity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
        binding.btnMainMenu.setOnClickListener {
            if(QUIZ1_PASSED && WATCHED_TUTORIAL1)
                unLockNextLesson2()
            else
                startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }

        binding.btnSummary.setOnClickListener{
            val bundle = intent.extras
            val myIntArray = bundle!!.getIntegerArrayList(SELECTED_ANSWERS)

            val intent = Intent(applicationContext,  Summary1::class.java)
            intent.putIntegerArrayListExtra(SELECTED_ANSWERS, myIntArray)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            applicationContext.startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }

    private fun unLockNextLesson2() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.unlock_2)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()

        val btnUnlockClose = dialog.findViewById<ImageButton>(R.id.btn_unlock_close)
        btnUnlockClose.setOnClickListener {
            dialog.dismiss()
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
        val btnClose = dialog.findViewById<Button>(R.id.btn_ok)
        btnClose.setOnClickListener {
            dialog.dismiss()
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }
}