package com.capstone.mathuto.sqlite

data class Question(
    val id: Int,
    var question: String,
    var optionA: String,
    var optionB: String,
    var optionC: String,
    var optionD: String,
    val correctAnswer: Int
)
