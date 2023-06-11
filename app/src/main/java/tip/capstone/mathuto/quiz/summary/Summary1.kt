package tip.capstone.mathuto.quiz.summary

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import tip.capstone.mathuto.MainActivity
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.QuizSummary1Binding
import tip.capstone.mathuto.questions.Question1
import tip.capstone.mathuto.quiz.result.Result1Activity
import tip.capstone.mathuto.sqlite.Question
import tip.capstone.mathuto.sqlite.SQLiteHelper

class Summary1 : AppCompatActivity() {

    private lateinit var binding: QuizSummary1Binding
    private lateinit var db: SQLiteHelper

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null

    private var isBackButtonVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = SQLiteHelper(this)
        binding = QuizSummary1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionList = db.getAllQuestions()
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
            if (mCurrentPosition < mQuestionList!!.size) {
                mCurrentPosition++
                setQuestion()
            } else {
                db.deleteQuestion()
                /*val intent = Intent(applicationContext, Result1Activity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                applicationContext.startActivity(intent)
                overridePendingTransition(0, 0)*/
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
        binding.tvOptionThree.let {
            options.add(2, it)
        }
        binding.tvOptionFour.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#FFFFFF"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.quiz_default_option_border_bg)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        defaultOptionView()

        val myIntArray = intent.getIntegerArrayListExtra(Question1.SELECTED_ANSWERS)
        println("ANSWER KEY ARRANGEMENT: " +myIntArray)

        if (mCurrentPosition <= mQuestionList!!.size) {
            val question: Question = mQuestionList!![mCurrentPosition - 1]
            binding.tvProgress.text = "Question $mCurrentPosition"
            binding.tvQuestion.text = question.question
            binding.tvOptionOne.text = question.optionA
            binding.tvOptionTwo.text = question.optionB
            binding.tvOptionThree.text = question.optionC
            binding.tvOptionFour.text = question.optionD

            if (myIntArray != null) {
                if(myIntArray[mCurrentPosition - 1] != question.correctAnswer){
                    answerView(myIntArray[mCurrentPosition - 1], R.drawable.quiz_wrong_option_border_bg)
                }
            }
            answerView(question.correctAnswer, R.drawable.quiz_correct_option_border_bg)
            println("mCurrentPosition $mCurrentPosition")
        }
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
            3 -> {
                binding.tvOptionThree.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
            4 -> {
                binding.tvOptionFour.background = ContextCompat.getDrawable(
                    this, drawableView)
            }
        }
    }
}