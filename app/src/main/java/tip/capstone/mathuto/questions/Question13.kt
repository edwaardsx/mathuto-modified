package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question13 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "What is the quotient of 30 and 0.5?",
            "60",
            "62",
            "64",
            "66",
            1,
            "When dividing decimals, you can follow these steps:\n\n" +
                    "Move the decimal point in the divisor (0.5) to the right until it becomes a whole number. In this case, you can move the decimal point one place to the right, making the divisor 5.\n\n" +
                    "Now divide 30 by 5:\n\n" +
                    "30 ÷ 5 = 6\n\n" +
                    "Therefore, the quotient of 30 and 0.5 is 60."
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "What is 0.48 ÷ 4?",
            "0.012",
            "0.12",
            "1.2",
            "12",
            2,
            "1. Align the decimal point in the dividend (0.48) and the divisor (4).\n\n" +
                    " 0.48\n" +
                    "÷ 4\n\n" +
                    "2. Since the divisor (4) does not have any decimal places, you can treat it as a whole number.\n\n" +
                    "3. Perform the division as you would with whole numbers:\n" +
                    "Divide 48 by 4:\n\n" +
                    " 12\n" +
                    " -----\n" +
                    "4 | 48\n" +
                    "  - 44\n" +
                    "  -----\n" +
                    "    4\n\n" +
                    "4. Place the decimal point in the quotient directly above the decimal point in the dividend.\n" +
                    "Therefore, the quotient of 0.48 divided by 4 is 0.12.\n\n" +
                    "So, 0.48 ÷ 4 = 0.12"
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "4 ÷ 0.02 = ?.",
            "100",
            "200",
            "300",
            "400",
            4,
            "Align the decimal point in the dividend (4) and the divisor (0.02).\n\n" +
                    " 4\n" +
                    "÷ 0.02\n\n" +
                    "Convert the divisor (0.02) to a whole number by moving the decimal point two places to the right, making it 2.\n\n" +
                    "Perform the division as you would with whole numbers:\n" +
                    "Divide 4 by 2:\n\n" +
                    " 2\n" +
                    "------\n" +
                    "2 | 4\n" +
                    "  - 4\n" +
                    "------\n" +
                    "   0\n\n" +
                    "Place the decimal point in the quotient directly above the decimal point in the dividend. Therefore, the quotient of 4 divided by 0.02 is 200.\n\n" +
                    "So, 4 ÷ 0.02 = 200."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "What is 0.45 divided by 5?",
            "9",
            "0.9",
            "0.09",
            "0.009",
            3,
            "Align the decimal point in the dividend (0.45) and the divisor (5).\n\n" +
                    " 0.45\n" +
                    "÷   5\n\n" +
                    "Perform the division as you would with whole numbers:\n" +
                    "Divide 45 by 5:\n\n" +
                    " 9\n" +
                    "  ------\n" +
                    "5 | 45\n" +
                    "  - 40\n" +
                    "  ------\n" +
                    "      5\n" +
                    "Place the decimal point in the quotient directly above the decimal point in the dividend.\n" +
                    "Therefore, the quotient of 0.45 divided by 5 is 0.09.\n\n" +
                    "So, 0.45 ÷ 5 = 0.09."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "How many 2 tenths are in 18?",
            "50",
            "70",
            "90",
            "99",
            3,
            "Dividing 18 by 0.2 can be done as follows:\n\n" +
                    " 18\n" +
                    "÷ 0.2\n\n" +
                    "To simplify the division, we can multiply both the dividend (18) and the divisor (0.2) by 10 to remove the decimal point:\n\n" +
                    " 180\n" +
                    "÷   2\n\n" +
                    "Now, perform the division:\n\n" +
                    " 90\n\n" +
                    "Therefore, there are 90 two-tenths in 18.\n\n" +
                    "So, 18 ÷ 0.2 = 90."
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "What is the quotient when we divide 0.264 by 6?",
            "0.44",
            "0.044",
            "0.004",
            "0.0004",
            2,
            "Align the decimal point in the dividend (0.264) and the divisor (6).\n\n" +
                    " 0.264\n" +
                    "÷ 6\n\n" +
                    "If needed, you can add trailing zeros to the dividend to ensure the same number of decimal places as the divisor. In this case, we don't need to add any zeros.\n" +
                    "Perform the division:\n" +
                    "6 | 0.264\u000B - 0.24\n" +
                    " ------ \n" +
                    "  24 \n" +
                    "24\n" +
                    "--------- \n" +
                    "0\n\n" +
                    "Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    "Therefore, the quotient of 0.264 divided by 6 is 0.044.\n\n" +
                    "So, 0.264 ÷ 6 = 0.044."
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "Which of the following is the quotient of 0.362 divided by 4?",
            "0.0905",
            "0.9050",
            "0.9051",
            "0.9005",
            1,
            "0.362\n" +
                    "÷   4\n" +
                    "________\n\n" +
                    "To simplify the division, you can multiply both the dividend (0.362) and the divisor (4) by 1000 to remove the decimal point:\n\n" +
                    " 362\n" +
                    "÷   4000\u000B________\n\n" +
                    "Now, perform the division:\n\n" +
                    " 0.0905\n\n" +
                    "Therefore, the quotient of 0.362 divided by 4 is 0.0905.\n\n" +
                    "So, the correct quotient is 0.0905."
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "962 ÷ 0.74 is equal to ?.",
            "1300",
            "130",
            "103",
            "13",
            1,
            "     962\n" +
                    "÷   0.74\n" +
                    "________\n\n" +
                    "To simplify the division, you can multiply both the dividend (962) and the divisor (0.74) by 100 to remove the decimal point:\n\n" +
                    "    96200\n" +
                    "÷   74\n" +
                    "________\n\n" +
                    "Now, perform the division:\n\n" +
                    " 1300\n\n" +
                    "Therefore, 962 divided by 0.74 is equal to 1300.\n\n" +
                    "So, 962 ÷ 0.74 = 1300."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "Divide 72 by 0.9 what is the quotient?",
            "8",
            "80",
            "800",
            "8000",
            2,
            "      72\n" +
                    "÷   0.9\n" +
                    "______\n\n" +
                    "To simplify the division, you can multiply both the dividend (72) and the divisor (0.9) by 10 to remove the decimal point:\n\n" +
                    "    720\n" +
                    "÷   9\n" +
                    "______\n\n" +
                    "Now, perform the division:\n\n" +
                    " 80\n\n" +
                    "Therefore, the quotient of 72 divided by 0.9 is 80.\n\n" +
                    "So, 72 ÷ 0.9 = 80."
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "362 ÷ 0.04 is equal to ?.",
            "9050",
            "905",
            "95",
            "90",
            1,
            "362 ÷ 0.04\n\n" +
                    "To simplify the division, you can multiply both the dividend (362) and the divisor (0.04) by 100 to remove the decimal point:\n\n" +
                    " 36200 ÷ 4\n\n" +
                    "Now, perform the division:\n\n" +
                    "9050\n\n" +
                    "Therefore, the quotient of 362 divided by 0.04 is 9050\n\n" +
                    "So, 362 ÷ 0.04 = 9050"
        )
        questionList.add(que10)

        val que11 = MultipleChoice(
            1,
            "What is 48 divided by 2.5?",
            "19.2",
            "19.5",
            "20.2",
            "20.5",
            1,
            "To divide 48 by 2.5, we simply perform the division operation.\n\n" +
                    "48 ÷ 2.5 = 19.2\n\n" +
                    "Therefore, the result of 48 divided by 2.5 is 19.2."
        )
        questionList.add(que11)

        val que12 = MultipleChoice(
            1,
            "What is 23 divided by 2.4?",
            "19.2",
            "19.5",
            "0.9051",
            "9.58",
            4,
            "To divide 23 by 2.4, we can perform the division operation.\n\n" +
                    "23 ÷ 2.4 ≈ 9.58333333333\n\n" +
                    "Rounded to two decimal places, the result is approximately 9.58"
        )
        questionList.add(que12)

        val que13 = MultipleChoice(
            1,
            "What is 65 divided by 0.5?",
            "120",
            "130",
            "140",
            "150",
            2,
            "To divide 65 by 0.5, we can perform the division operation.\n\n" +
                    "65 ÷ 0.5 = 130\n\n" +
                    "Therefore, 65 divided by 0.5 is equal to 130."
        )
        questionList.add(que13)

        val que14 = MultipleChoice(
            1,
            "What is 80 divided by 1.25?",
            "64",
            "68",
            "72",
            "76",
            1,
            "To divide 80 by 1.25, we can perform the division operation.\n\n" +
                    "80 ÷ 1.25 = 64\n\n" +
                    "Therefore, 80 divided by 1.25 is equal to 64."
        )
        questionList.add(que14)

        val que15 = MultipleChoice(
            1,
            "What is 110 divided by 1.75?",
            "57",
            "62.5",
            "63",
            "67",
            2,
            "To divide 110 by 1.75, we can perform the division operation.\n\n" +
                    "110 ÷ 1.75 ≈ 62.857142857\n\n" +
                    "Rounded to two decimal places, the result is approximately 62.86.\n\n" +
                    "Therefore, 110 divided by 1.75 is approximately 62.86."
        )
        questionList.add(que15)

        return questionList
    }
}