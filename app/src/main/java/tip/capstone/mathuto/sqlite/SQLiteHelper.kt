package tip.capstone.mathuto.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.capstone.mathuto.sqlite.Highscores

class SQLiteHelper(context: Context) : SQLiteOpenHelper(context, "userScores.db", null, 1) {

    companion object;

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE HIGHSCORES(id Integer PRIMARY KEY, lesson TEXT, score TEXT)")
        db.execSQL("CREATE TABLE QUESTIONS(id TEXT, question TEXT, optionA TEXT, optionB TEXT, optionC TEXT, optionD TEXT, correctAnswer TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS HIGHSCORES")
        db.execSQL("DROP TABLE IF EXISTS QUESTIONS")
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

    fun insertQuestion(qestion: Question) :Boolean {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("id", qestion.id)
            put("question", qestion.question)
            put("optionA", qestion.optionA)
            put("optionB", qestion.optionB)
            put("optionC", qestion.optionC)
            put("optionD", qestion.optionD)
            put("correctAnswer", qestion.correctAnswer)
        }
        db.insert("QUESTIONS", null, values)
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
    fun getAllQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val db = readableDatabase
        val selectQuery = "SELECT * FROM QUESTIONS"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                var question= cursor.getString(cursor.getColumnIndex("question"))
                var optionA= cursor.getString(cursor.getColumnIndex("optionA"))
                var optionB= cursor.getString(cursor.getColumnIndex("optionB"))
                var optionC= cursor.getString(cursor.getColumnIndex("optionC"))
                var optionD= cursor.getString(cursor.getColumnIndex("optionD"))
                val correctAnswer = cursor.getInt(cursor.getColumnIndex("correctAnswer"))

                val questionObject = Question(id, question, optionA, optionB, optionC, optionD, correctAnswer)
                questionList.add(questionObject)
            } while (cursor.moveToNext())
        }

        cursor.close()
        db.close()
        return questionList
    }
}
