package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question16 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "32.781 ÷ 10 = ?",
            "3278.1 ",
            "327.81 ",
            "32 781",
            "0.32781",
            4,
            "Step 1: Place the dividend (32.781) and the divisor (10) in the division format:\n\n" +
                    " 3.2781\n" +
                    "÷    10\n" +
                    "_______\n\n" +
                    "Step 2: Since we are dividing a decimal number, we need to align the decimal point. Move the decimal point in the dividend one place to the left:\n\n" +
                    " 3.2781\n" +
                    "÷   10\n" +
                    "______\n\n" +
                    "Step 3: Perform the division as you would with whole numbers. Divide the first digit of the dividend by the divisor:\n\n" +
                    " 3.2781\n" +
                    "÷   10\n" +
                    "-------\n" +
                    "  0.3\n\n" +
                    "Step 4: Multiply the quotient (0.3) by the divisor (10) and subtract it from the dividend (3.2781):\n\n" +
                    " 3.2781\n" +
                    "÷   10\n" +
                    "-------\n" +
                    "   3.0   \t← Subtract 3.0 * 10 = 30\n" +
                    "- 30\n" +
                    "-------\n\n" +
                    "Step 5: Bring down the next digit from the dividend (7) and place it next to the result from the previous step:\n\n" +
                    "3.2781\n" +
                    "÷   10\n" +
                    "-------\n" +
                    "3.07   \t← Bring down 7\n" +
                    "- 30\n" +
                    "-------\n\n" +
                    "Therefore, the solution to 32.781 ÷ 10 is 0.32781"
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "979.34 ÷ 100 = ?",
            "0.097934",
            "97.934",
            "0.97934",
            "9 793.4",
            1,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n" +
                    " 979.34\n" +
                    "÷  100\n" +
                    "------\n\n" +
                    "Step 2: Move the decimal point two places to the left in the dividend.\n" +
                    "9.7934\n" +
                    "÷  100\n" +
                    "------\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    " 9.7934\n" +
                    "÷  100\n" +
                    "------\n" +
                    "    0.097934\n\n" +
                    "Therefore, the solution to 979.34 ÷ 100 is 0.097934"
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "4 212.54 ÷1000 = ?",
            "4 2.1254",
            "4 21.254",
            "0.00421254",
            "0.421254",
            3,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend\n\n" +
                    "4,212.54\n" +
                    "÷   1,000\n" +
                    "----------\n\n" +
                    "Step 2: Move the decimal point three places to the left in the dividend.\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    "4.21254\n" +
                    "÷   1,000\n" +
                    "----------\n" +
                    "     0.00421254\n\n" +
                    "Therefore, the solution to 4,212.54 ÷ 1,000 is 0.00421254"
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "157.06 ÷ 100 = ?",
            "15.706",
            "1.5706",
            "1570.6",
            "0.15706",
            4,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    "157.06\n" +
                    "÷   100\n" +
                    "-------\n\n" +
                    "Step 2: Move the decimal point two places to the left in the dividend.\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    "1.5706\n" +
                    "÷   100\n" +
                    "-------\n" +
                    "   0.015706\n\n" +
                    "Therefore, the solution to 157.06 ÷ 100 is 0.015706"
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "821.8 ÷ 10 = ?",
            "0.8218",
            "8.218 ",
            "82.18",
            "8.218",
            3,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend\n\n" +
                    "821.8\n" +
                    "÷   10\n" +
                    "-------\n\n" +
                    "Step 2: Move the decimal point one place to the left in the dividend\n\n" +
                    "Step 3: Perform the division\n\n" +
                    "82.18\n" +
                    "÷   10\n" +
                    "-------\n" +
                    "    8.218\n\n" +
                    "Therefore, the solution to 821.8 ÷ 10 is 8.218"
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "What is the result of dividing 8.4 by 10?",
            "0.084",
            "0.84",
            "8.4",
            "84",
            2,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    " 8.4\n" +
                    "÷   10\n" +
                    "------\n\n" +
                    "Step 2: Move the decimal point one place to the left in the dividend.\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    "0.84\n" +
                    "÷   10\n" +
                    "------\n" +
                    "    0.084\n\n" +
                    "Therefore, the result of dividing 8.4 by 10 is 0.084."
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "If you divide 3.56 by 100, what is the quotient?",
            "0.0356",
            "0.356",
            "3.56",
            "35.6",
            1,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    "3.56\n" +
                    "÷   100\n" +
                    "-------\n\n" +
                    "Step 2: Move the decimal point two places to the left in the dividend.\n\n" +
                    "0.0356\n" +
                    "÷   100\n" +
                    "-------\n\n" +
                    "Step 3: Perform the division\n\n" +
                    "0.0356\n" +
                    "÷   100\n" +
                    "-------\n" +
                    "     0.000356\n\n" +
                    "Therefore, the quotient of 3.56 divided by 100 is 0.0356"
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "Calculate the value of 42.789 divided by 1000.",
            "0.042789",
            "0.42789",
            "4.2789",
            "42.789",
            1,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    "42.789\n" +
                    "÷   1000\n" +
                    "--------\n\n" +
                    "Step 2: Move the decimal point three places to the left in the dividend.\n\n" +
                    "0.042789\n" +
                    "÷   1000\n" +
                    "--------\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    " 0.042789\n" +
                    "÷   1000\n" +
                    "--------\n" +
                    "    0.000042789\n\n" +
                    "Therefore, the value of 42.789 divided by 1000 is 0.042789."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "When dividing 0.93 by 1000, what is the result?",
            "0.000093",
            "0.00093",
            "0.0093",
            "0.093",
            2,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    " 0.93\n" +
                    "÷   1000\n" +
                    "-------\n\n" +
                    "Step 2: Move the decimal point three places to the left in the dividend.\n\n" +
                    " 0.00093\n" +
                    "÷   1000\n" +
                    "-------\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    "0.00093\n" +
                    "÷   1000\n" +
                    "-------\n" +
                    "     0.00000093\n\n" +
                    "Therefore, the result of dividing 0.93 by 1000 is 0.00093"
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "What is the quotient of dividing 9.75 by 10?",
            "0.975",
            "0.0975",
            "0.9750",
            "9.75",
            1,
            "Step 1: Place the decimal point in the quotient directly above the decimal point in the dividend.\n\n" +
                    "9.75\n" +
                    "÷   10\n" +
                    "------\n\n" +
                    "Step 2: Move the decimal point one place to the left in the dividend.\n\n" +
                    "0.975\n" +
                    "÷   10\n" +
                    "------\n\n" +
                    "Step 3: Perform the division.\n\n" +
                    " 0.975\n" +
                    "÷   10\n" +
                    "------\n" +
                    "     0.0975\n\n" +
                    "Therefore, the quotient of dividing 9.75 by 10 is 0.975"
        )
        questionList.add(que10)

        val que11 = MultipleChoice(
            1,
            "What is 3.45 divided by 10?",
            "0.084",
            "0.345",
            "8.4",
            "84",
            2,
            "To divide 3.45 by 10, we can perform the division operation.\n\n" +
                    "3.45 ÷ 10 = 0.345\n\n" +
                    "Therefore, 3.45 divided by 10 is equal to 0.345"
        )
        questionList.add(que11)

        val que12 = MultipleChoice(
            1,
            "What is 12.67 divided by 100?",
            "0.1267",
            "0.356",
            "3.56",
            "35.6",
            1,
            "To divide 12.67 by 100, we can perform the division operation.\n" +
                    "\n" +
                    "12.67 ÷ 100 = 0.1267\n" +
                    "\n" +
                    "Therefore, 12.67 divided by 100 is equal to 0.1267"
        )
        questionList.add(que12)

        val que13 = MultipleChoice(
            1,
            "What is 6.38 divided by 1000?",
            "0.00638",
            "0.42789",
            "4.2789",
            "42.789",
            1,
            "To divide 6.38 by 1000, we can perform the division operation.\n" +
                    "\n" +
                    "6.38 ÷ 1000 = 0.00638\n" +
                    "\n" +
                    "Therefore, 6.38 divided by 1000 is equal to 0.00638"
        )
        questionList.add(que13)

        val que14 = MultipleChoice(
            1,
            "What is 9.81 divided by 10?",
            "0.000093",
            "0.981",
            "0.0093",
            "0.093",
            2,
            "\n" +
                    "To divide 9.81 by 10, we can perform the division operation.\n\n" +
                    "9.81 ÷ 10 = 0.981\n\n" +
                    "Therefore, 9.81 divided by 10 is equal to 0.981"
        )
        questionList.add(que14)

        val que15 = MultipleChoice(
            1,
            "What is 0.745 divided by 1000?",
            "0.000745",
            "0.0975",
            "0.9750",
            "9.75",
            1,
            "To divide 0.745 by 1000, we can perform the division operation.\n\n" +
                    "0.745 ÷ 1000 = 0.000745\n\n" +
                    "Therefore, 0.745 divided by 1000 is equal to 0.000745"
        )
        questionList.add(que15)

        return questionList
    }
}