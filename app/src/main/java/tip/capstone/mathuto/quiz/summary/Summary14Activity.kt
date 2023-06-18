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
import tip.capstone.mathuto.databinding.QuizSummary14Binding
import tip.capstone.mathuto.databinding.QuizSummary1Binding
import tip.capstone.mathuto.questions.Question1
import tip.capstone.mathuto.sqlite.MultipleChoice
import tip.capstone.mathuto.sqlite.SQLiteHelper

class Summary14Activity : AppCompatActivity() {

    private lateinit var binding: QuizSummary14Binding
    private lateinit var db: SQLiteHelper

    private var mCurrentPosition: Int = 1
    private var mMultipleChoiceList: ArrayList<MultipleChoice>? = null
    private var isBackButtonVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuizSummary14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#303030")
        db = SQLiteHelper(this)
        mMultipleChoiceList = db.getAllQuestions()
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
            if (mCurrentPosition < mMultipleChoiceList!!.size) {
                mCurrentPosition++
                setQuestion()
            } else {
                db.deleteQuestion()
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
            option.typeface = ResourcesCompat.getFont(this, R.font.geologica_regular)
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

        if (mCurrentPosition <= mMultipleChoiceList!!.size) {
            val multipleChoice: MultipleChoice = mMultipleChoiceList!![mCurrentPosition - 1]
            binding.tvProgress.text = "Question $mCurrentPosition/10"
            binding.tvQuestion.text = multipleChoice.question
            binding.tvQuestion.typeface = ResourcesCompat.getFont(this, R.font.geologica_regular)
            binding.tvOptionOne.text = multipleChoice.optionA
            binding.tvOptionTwo.text = multipleChoice.optionB
            binding.tvOptionThree.text = multipleChoice.optionC
            binding.tvOptionFour.text = multipleChoice.optionD

            if (myIntArray != null) {
                if(myIntArray[mCurrentPosition - 1] != multipleChoice.correctAnswer){
                    binding.seeWhy.visibility = View.VISIBLE
                    binding.seeWhy.setOnClickListener{
                        showExplanationDialog(multipleChoice)
                    }
                    answerView(myIntArray[mCurrentPosition - 1], R.drawable.quiz_summary_wrong_option_border_bg)
                } else {
                    binding.seeWhy.visibility = View.GONE
                }
            }
            answerView(multipleChoice.correctAnswer, R.drawable.quiz_summary_correct_option_border_bg)

            println("mCurrentPosition $mCurrentPosition")
        }
    }

    private fun showExplanationDialog(multipleChoice: MultipleChoice) {
        val dialogBuilder = AlertDialog.Builder(this)
        val titleFont = ResourcesCompat.getFont(this, R.font.geologica_bold)
        val messageFont = ResourcesCompat.getFont(this, R.font.geologica_regular)

        dialogBuilder.setTitle("Explanation")
        dialogBuilder.setMessage(multipleChoice.explanation)

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