package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question15 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "57.213 ÷ 0.1 = ?",
            "5.7213",
            "572.13",
            "5 721.3",
            "57 213",
            2,
            "Set up the division:\n\n" +
                    "57.213  ÷   0.1\n\n" +
                    "Multiply both the dividend (57.213) and divisor (0.1) by 10 to remove the decimal point:\n" +
                    "572.1 ÷ 1\n\n" +
                    "Perform the division:\n" +
                    "Start with the leftmost digit in the dividend (5). Divide it by the divisor (1). The quotient is .\n" +
                    "Bring down the next digit from the dividend (7). The new partial dividend is 57.\n" +
                    "Divide 57 by 1. The quotient is 57.\n" +
                    "Bring down the next digit from the dividend (2). The new partial dividend is 572.\n" +
                    "Divide 572 by 1. The quotient is 572.\n" +
                    "There are no more digits in the dividend.\n\n" +
                    "The final quotient is 572.13.\n\n" +
                    "So, 57.213 ÷ 0.1 = 572.13."
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "6.4903 ÷ 0.001 = ?",
            "64.903",
            "649.03",
            "6 490.3",
            "64 903",
            3,
            "6.4903 ÷ 0.001\n\n" +
                    "To simplify the division, you can multiply both the dividend (6.4903) and the divisor (0.001) by 1000 to remove the decimal point:\n\n" +
                    "6490.3 ÷ 1\n\n" +
                    "Now, perform the division:\n" +
                    "6490.3\n\n" +
                    "Therefore, the quotient of 6.4903 divided by 0.001 is 6490.3\n\n" +
                    "So, 6.4903 ÷ 0.001 = 6490.3"
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "23.841 ÷ 0.01 = ?",
            "238.41",
            "2.3841",
            "23 841",
            "2,384.1",
            4,
            "23.841 ÷  0.01\n\n" +
                    "To simplify the division, you can multiply both the dividend (23.841) and the divisor (0.01) by 100 to remove the decimal point:\n\n" +
                    "2384.1 ÷  1\n\n" +
                    "Now, perform the division:\n" +
                    "2384.1\n\n" +
                    "Therefore, the quotient of 23.841 divided by 0.01 is 2384.1\n\n" +
                    "So, 23.841 ÷ 0.01 = 2,384.1"
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "7.442 ÷ 0.1, ?",
            "74.42",
            "744.2",
            "7 442",
            "74 420",
            1,
            "7.442 ÷  0.1\n\n" +
                    "To simplify the division, you can multiply both the dividend (7.442) and the divisor (0.1) by 10 to remove the decimal point:\n" +
                    "74.42 ÷  1\n\n" +
                    "Now, perform the division:\n" +
                    "74.42\n\n" +
                    "Therefore, the quotient of 7.442 divided by 0.1 is 74.42.\n" +
                    "So, 7.442 ÷ 0.1 = 74.42."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "12.6361 ÷ 0.01 = ?",
            "126.361",
            "1263.61",
            "12 636.1",
            "126.361",
            2,
            "12.6361 ÷  0.01\n\n" +
                    "To simplify the division, you can multiply both the dividend (12.6361) and the divisor (0.01) by 100 to remove the decimal point:\n\n" +
                    "1263.61 ÷  1\n\n" +
                    "Now, perform the division:\n" +
                    "1263.61\n\n" +
                    "Therefore, the quotient of 12.6361 divided by 0.01 is 1263.61\n" +
                    "So, 12.6361 ÷ 0.01 = 1263.61"
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "70.8923 ÷ 0.001 = ?",
            "708.923",
            "70,892.3",
            "7.089.23 ",
            "708,923",
            2,
            "70.8923 ÷ 0.001\n\n" +
                    "To simplify the division, you can multiply both the dividend (70.8923) and the divisor (0.001) by 1000 to remove the decimal point:\n\n" +
                    "70892.3 ÷ 1\n\n" +
                    "Now, perform the division:\n" +
                    "70892.3\n\n" +
                    "Therefore, the quotient of 70.8923 divided by 0.001 is 70892.3\n\n" +
                    "So, 70.8923 ÷ 0.001 = 70,892.3"
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "65.43 ÷ 0.1 = ?",
            "65.43",
            "6 543",
            "654.3",
            "6.543",
            3,
            "65.43 ÷  0.1\n\n" +
                    "To simplify the division, you can multiply both the dividend (65.43) and the divisor (0.1) by 10 to remove the decimal point:\n\n" +
                    "654.3 ÷  1\n\n" +
                    "Now, perform the division:\n" +
                    "654.3\n\n" +
                    "Therefore, the quotient of 65.43 divided by 0.1 is 654.3\n\n" +
                    "So, 65.43 ÷ 0.1 = 654.3"
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "8.4923 ÷ 0.001 = ?",
            "8.492.3",
            "84.923",
            "849.23",
            "84.923",
            1,
            "8.4923 ÷  0.001\n\n" +
                    "To simplify the division, you can multiply both the dividend (8.4923) and the divisor (0.001) by 1000 to remove the decimal point:\n\n" +
                    "8492.3 ÷  1\n\n" +
                    "Now, perform the division:\n\n" +
                    "8492.3\n\n" +
                    "Therefore, the quotient of 8.4923 divided by 0.001 is 8492.3\n\n" +
                    "So, 8.4923 ÷ 0.001 = 8492.3"
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "3 774.8 ÷ 0.1 = ?",
            "37.748",
            "377.48",
            "3.7748",
            "37 748",
            1,
            "3,774.8 ÷ 0.1\n\n" +
                    "To simplify the division, you can multiply both the dividend (3,774.8) and the divisor (0.1) by 10 to remove the decimal point:\n\n" +
                    "37,748 ÷ 1\n\n" +
                    "Now, perform the division:\n" +
                    "37,748\n\n" +
                    "Therefore, the quotient of 3,774.8 divided by 0.1 is 37,748\n\n" +
                    "So, 3,774.8 ÷ 0.1 = 37,748"
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "84.591 ÷ 0.01 = ?",
            "8.4591",
            "84.591",
            "845.91",
            "8.459.1",
            4,
            "84.591 ÷  0.01\n\n" +
                    "To simplify the division, you can multiply both the dividend (84.591) and the divisor (0.01) by 100 to remove the decimal point:\n\n" +
                    "8,459.1 ÷ 1\n\n" +
                    "Now, perform the division:\n" +
                    "8,459.1\n\n" +
                    "Therefore, the quotient of 84.591 divided by 0.01 is 8,459.1\n\n" +
                    "So, 84.591 ÷ 0.01 = 8,459.1"
        )
        questionList.add(que10)

        val que11 = MultipleChoice(
            1,
            "What is 5.678 divided by 0.1?",
            "56.70222",
            "56.78",
            "7.089.23 ",
            "708,923",
            2,
            "To divide 5.678 by 0.1, we can perform the division operation.\n\n" +
                    "5.678 ÷ 0.1 = 56.78\n\n" +
                    "Therefore, 5.678 divided by 0.1 is equal to 56.78"
        )
        questionList.add(que11)

        val que12 = MultipleChoice(
            1,
            "What is 0.7532 divided by 0.01?",
            "65.43",
            "6 543",
            "75.32",
            "6.543",
            3,
            "To divide 0.7532 by 0.01, we can perform the division operation.\n\n" +
                    "0.7532 ÷ 0.01 = 75.32\n\n" +
                    "Therefore, 0.7532 divided by 0.01 is equal to 75.32"
        )
        questionList.add(que12)

        val que13 = MultipleChoice(
            1,
            "What is 8.4156 divided by 0.001?",
            "8415.6",
            "84.923",
            "849.23",
            "84.923",
            1,
            "To divide 8.4156 by 0.001, we can perform the division operation.\n\n" +
                    "8.4156 ÷ 0.001 = 8415.6\n\n" +
                    "Therefore, 8.4156 divided by 0.001 is equal to 8415.6"
        )
        questionList.add(que13)

        val que14 = MultipleChoice(
            1,
            "What is 0.4569 divided by 0.1?",
            "4.569",
            "377.48",
            "3.7748",
            "37 748",
            1,
            "To divide 0.4569 by 0.1, we can perform the division operation.\n\n" +
                    "0.4569 ÷ 0.1 = 4.569\n\n" +
                    "Therefore, 0.4569 divided by 0.1 is equal to 4.569"
        )
        questionList.add(que14)

        val que15 = MultipleChoice(
            1,
            "What is 3.14159 divided by 0.001?",
            "8.4591",
            "54.591",
            "45.91",
            "3141.59",
            4,
            "To divide 3.14159 by 0.001, we can perform the division operation.\n\n" +
                    "3.14159 ÷ 0.001 = 3141.59\n\n" +
                    "Therefore, 3.14159 divided by 0.001 is equal to 3141.59"
        )
        questionList.add(que15)

        return questionList
    }
}