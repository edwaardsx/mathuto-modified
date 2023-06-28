package tip.capstone.mathuto.quiz.summary

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.QuizSummary4Binding
import tip.capstone.mathuto.questions.Question4
import tip.capstone.mathuto.questions.Question4.TOTAL_QUESTIONS
import tip.capstone.mathuto.sqlite.SQLiteHelper
import tip.capstone.mathuto.sqlite.TrueOrFalse

class Summary4Activity : AppCompatActivity() {

    private lateinit var binding: QuizSummary4Binding
    private lateinit var db: SQLiteHelper

    private var mCurrentPosition: Int = 1
    private var mTrueOrFalse: ArrayList<TrueOrFalse>? = null
    private var isBackButtonVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuizSummary4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#303030")
        db = SQLiteHelper(this)
        mTrueOrFalse = db.getAllQuestions2()
        setQuestion()

        binding.btnBack.setOnClickListener{
            finish()
            overridePendingTransition(0, 0)
        }
        binding.btnNext.setOnClickListener{
            if (!isBackButtonVisible) {
                binding.btnBackPreviousQuestion.visibility = View.VISIBLE
                isBackButtonVisible = true
            }
            if (mCurrentPosition < mTrueOrFalse!!.size) {
                mCurrentPosition++
                setQuestion()
            } else {
                db.deleteQuestion2()
            }
        }
        binding.btnBackPreviousQuestion.setOnClickListener{
            if (mCurrentPosition > 1) {
                mCurrentPosition--
                setQuestion()
            }
        }
        if (mCurrentPosition == 1) {
            binding.btnBackPreviousQuestion.visibility = View.INVISIBLE
        } else {
            binding.btnBackPreviousQuestion.visibility = View.VISIBLE
        }
    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()
        binding.tvOptionOne.let {
            options.add(0, it)
        }
        binding.tvOptionTwo.let {
            options.add(1, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#FFFFFF"))
            option.typeface = ResourcesCompat.getFont(this, R.font.geologica_regular)
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.quiz_default_option_border_bg)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        defaultOptionView()

        val myIntArray = intent.getIntegerArrayListExtra(Question4.SELECTED_ANSWERS)
        println("ANSWER KEY ARRANGEMENT: " +myIntArray)
        val totalQuestions = intent.getIntExtra(TOTAL_QUESTIONS, 0)

        if (mCurrentPosition <= mTrueOrFalse!!.size) {
            val trueOrFalse: TrueOrFalse = mTrueOrFalse!![mCurrentPosition - 1]
            binding.tvProgress.text = "Question $mCurrentPosition/$totalQuestions"
            binding.tvQuestion.text = trueOrFalse.question
            binding.tvQuestion.typeface = ResourcesCompat.getFont(this, R.font.geologica_regular)
            binding.tvOptionOne.text = trueOrFalse.optionA
            binding.tvOptionTwo.text = trueOrFalse.optionB

            if (myIntArray != null) {
                if(myIntArray[mCurrentPosition - 1] != trueOrFalse.correctAnswer){
                    binding.seeWhy.visibility = View.VISIBLE
                    binding.seeWhy.setOnClickListener{
                        showExplanationDialog(trueOrFalse)
                    }
                    answerView(myIntArray[mCurrentPosition - 1], R.drawable.quiz_summary_wrong_option_border_bg)
                } else {
                    binding.seeWhy.visibility = View.GONE
                }
            }
            answerView(trueOrFalse.correctAnswer, R.drawable.quiz_summary_correct_option_border_bg)

            println("mCurrentPosition $mCurrentPosition")
        }
    }

    private fun showExplanationDialog(trueOrFalse: TrueOrFalse) {
        val dialogBuilder = AlertDialog.Builder(this)
        val titleFont = ResourcesCompat.getFont(this, R.font.geologica_bold)
        val messageFont = ResourcesCompat.getFont(this, R.font.geologica_regular)

        dialogBuilder.setTitle("Explanation")
        dialogBuilder.setMessage(trueOrFalse.explanation)

        dialogBuilder.setPositiveButton("GOT IT") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = dialogBuilder.create()

        dialog.apply {
            val titleView = dialog.findViewById<TextView>(android.R.id.title)
            val messageView = dialog.findViewById<TextView>(android.R.id.message)

            titleView?.typeface = titleFont
            messageView?.typeface = messageFont

            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val cornerRadius = 16 * resources.displayMetrics.density
            val cornerDrawable = GradientDrawable()
            cornerDrawable.setColor(Color.WHITE)
            cornerDrawable.cornerRadius = cornerRadius
            window?.setBackgroundDrawable(cornerDrawable)
        }
        dialog.show()
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                binding.tvOptionOne.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            2 -> {
                binding.tvOptionTwo.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
        }
    }
}