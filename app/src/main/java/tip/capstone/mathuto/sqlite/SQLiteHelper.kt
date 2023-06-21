package tip.capstone.mathuto.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import tip.capstone.mathuto.tips.Tips

class SQLiteHelper(context: Context) : SQLiteOpenHelper(context, "userScores.db", null, 1) {

    companion object;

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE HIGHSCORES(id Integer PRIMARY KEY, lesson TEXT, score TEXT)")
        db.execSQL("CREATE TABLE QUESTIONS(id TEXT, question TEXT, optionA TEXT, optionB TEXT, optionC TEXT, optionD TEXT, correctAnswer TEXT, explanation TEXT)")
        db.execSQL("CREATE TABLE QUESTIONSTF(id TEXT, question TEXT, optionA TEXT, optionB TEXT, correctAnswer TEXT, explanation TEXT)")
        db.execSQL("CREATE TABLE TIPS(id TEXT, title TEXT, tips TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS HIGHSCORES")
        db.execSQL("DROP TABLE IF EXISTS QUESTIONS")
        db.execSQL("DROP TABLE IF EXISTS QUESTIONSTF")
        db.execSQL("DROP TABLE IF EXISTS TIPS")
        onCreate(db)
    }

    // Method to insert a new highscores
    fun insertHighScores(lesson: String, score: String) :Boolean {

        val db = writableDatabase
        val values = ContentValues().apply {
            put("lesson", lesson)
            put("score", score)
        }
        db.insert("HIGHSCORES", null, values)
        db.close()
        return true
    }

    fun deleteQuestion() :Boolean {
        val db = writableDatabase
        db.execSQL("DELETE FROM QUESTIONS")
        db.close()
        return true
    }

    fun deleteQuestion2() :Boolean {
        val db = writableDatabase
        db.execSQL("DELETE FROM QUESTIONSTF")
        db.close()
        return true
    }

    fun insertQuestion(multipleChoice: MultipleChoice) :Boolean {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("id", multipleChoice.id)
            put("question", multipleChoice.question)
            put("optionA", multipleChoice.optionA)
            put("optionB", multipleChoice.optionB)
            put("optionC", multipleChoice.optionC)
            put("optionD", multipleChoice.optionD)
            put("correctAnswer", multipleChoice.correctAnswer)
            put("explanation", multipleChoice.explanation)
        }
        db.insert("QUESTIONS", null, values)
        db.close()
        return true
    }

    fun insertQuestion2(trueOrFalse: TrueOrFalse) :Boolean {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("id", trueOrFalse.id)
            put("question", trueOrFalse.question)
            put("optionA", trueOrFalse.optionA)
            put("optionB", trueOrFalse.optionB)
            put("correctAnswer", trueOrFalse.correctAnswer)
            put("explanation", trueOrFalse.explanation)
        }
        db.insert("QUESTIONSTF", null, values)
        db.close()
        return true
    }

    fun insertTips(tips: Tips) :Boolean {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("id", tips.id)
            put("title", tips.title)
            put("tips", tips.tips)
        }
        db.insert("TIPS", null, values)
        db.close()
        return true
    }

    fun updateHighScores(lesson: String, score: String): Boolean {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("lesson", lesson)
        contentValues.put("score", score)
        val cursor = db.rawQuery("SELECT * FROM HIGHSCORES WHERE lesson = ?", arrayOf(lesson))

        return if (cursor.count > 0) {
            val result = db.update("HIGHSCORES", contentValues, "lesson=?", arrayOf(lesson))
            result != -1
        } else {
            false
        }
    }

    // Method to retrieve all highscores
    @SuppressLint("Range")
    fun getAllHighScores(): List<Highscores> {
        val highScoreList = mutableListOf<Highscores>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM HIGHSCORES"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val lesson = cursor.getString(cursor.getColumnIndex("lesson"))
                val score = cursor.getString(cursor.getColumnIndex("score"))

                val highScoreObject = Highscores(id, lesson, score)
                highScoreList.add(highScoreObject)
            } while (cursor.moveToNext())
        }

        cursor.close()
        db.close()
        return highScoreList
    }


    @SuppressLint("Range")
    fun getAllQuestions(): ArrayList<MultipleChoice> {
        val multipleChoiceList = ArrayList<MultipleChoice>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM QUESTIONS"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val question = cursor.getString(cursor.getColumnIndex("question"))
                val optionA = cursor.getString(cursor.getColumnIndex("optionA"))
                val optionB = cursor.getString(cursor.getColumnIndex("optionB"))
                val optionC = cursor.getString(cursor.getColumnIndex("optionC"))
                val optionD = cursor.getString(cursor.getColumnIndex("optionD"))
                val correctAnswer = cursor.getInt(cursor.getColumnIndex("correctAnswer"))
                val explanation = cursor.getString(cursor.getColumnIndex("explanation"))

                val multipleChoiceObject = MultipleChoice(id, question, optionA, optionB, optionC, optionD, correctAnswer, explanation)
                multipleChoiceList.add(multipleChoiceObject)
            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return multipleChoiceList
    }

    @SuppressLint("Range")
    fun getAllQuestions2(): ArrayList<TrueOrFalse> {
        val trueOrFalseList = ArrayList<TrueOrFalse>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM QUESTIONSTF"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val question = cursor.getString(cursor.getColumnIndex("question"))
                val optionA = cursor.getString(cursor.getColumnIndex("optionA"))
                val optionB = cursor.getString(cursor.getColumnIndex("optionB"))
                val correctAnswer = cursor.getInt(cursor.getColumnIndex("correctAnswer"))
                val explanation = cursor.getString(cursor.getColumnIndex("explanation"))

                val trueOrFalseObject = TrueOrFalse(id, question, optionA, optionB, correctAnswer, explanation)
                trueOrFalseList.add(trueOrFalseObject)
            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return trueOrFalseList
    }

    @SuppressLint("Range")
    fun getAllTips(): ArrayList<Tips> {
        val tipsList = ArrayList<Tips>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM TIPS"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val title = cursor.getString(cursor.getColumnIndex("title"))
                val tips = cursor.getString(cursor.getColumnIndex("tips"))

                val tipsObject = Tips(id, title, tips)
                tipsList.add(tipsObject)
            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return tipsList
    }
}
