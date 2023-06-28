package tip.capstone.mathuto.sqlite

data class TrueOrFalse(
    val id: Int,
    val question: String,
    val optionA: String,
    val optionB: String,
    val correctAnswer: Int,
    var explanation: String
    )