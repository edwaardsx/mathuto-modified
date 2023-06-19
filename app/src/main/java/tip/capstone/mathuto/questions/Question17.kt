package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question17 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "Which of the following fractions when converted to decimal will have a repeating decimal quotient?",
            "1/2 ",
            "1/3 ",
            "3/7",
            "2/5",
            2,
            "Step 1: Divide the numerator (1) by the denominator (3):\n\n" +
                    "1 ÷ 3\n\n" +
                    "Step 2: Perform the division:\n" +
                    "0.333333...\n\n" +
                    "Step 3: Notice that the digit 3 repeats indefinitely. This indicates a repeating decimal.\n\n" +
                    "Therefore, the decimal representation of 1/3 is 0.3333... with the digit 3 repeating infinitely."
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "What is the remainder of a terminating decimal quotient?",
            "0",
            "1",
            "2",
            "3",
            1,
            "When a decimal quotient is terminating, it means that the division results in a finite number of digits after the decimal point. In this case, there is no remainder. The decimal representation of the quotient ends without any further digits or repeating patterns, indicating that the division is complete with no remainder remaining."
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "What do we call the digit that is repeated in a repeating decimal quotient?",
            "repetitor",
            "repetend",
            "repeating",
            "recurring",
            2,
            "In a repeating decimal quotient, the digit or group of digits that repeats infinitely is called the repetend. It is the pattern that recurs continuously in the decimal representation of the quotient."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "A repeating decimal quotient results when the division algorithms gives the same repeatedly.",
            "quotient",
            "dividend",
            "remainders",
            "divisor",
            3,
            "A repeating decimal quotient occurs when the division algorithm gives the same sequence of remainders repeatedly. The division process continues indefinitely with the same set of remainders, resulting in a repeating pattern in the decimal representation of the quotient."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "When you divide 5 by 17, it will give you a what decimal quotient?",
            "repeating",
            "terminating",
            "non-terminating",
            "repeating and non-terminating decimal quotient\n",
            3,
            "Here is the step-by-step solution for dividing 5 by 17:\n\n" +
                    "Step 1: Set up the division with 5 as the dividend and 17 as the divisor:"+
                    " 0.    (quotient)\n" +
                    "    ---------\n" +
                    "17 | 5.   (dividend)\n\n" +
                    "Step 2: Divide the first digit of the dividend (5) by the divisor (17). Since 5 is smaller than 17, we need to add a decimal point and a zero after the decimal point in the dividend:\n\n" +
                    "Step 3: Bring down the next digit of the dividend (0) and divide by the divisor:\n\n" +
                    "Step 4: Since we have a remainder (16), we can bring down another zero after the decimal point in the dividend and continue dividing:\n\n" +
                    "Step 5: Again, we have a remainder (160). We can bring down another zero and continue dividing:\n\n" +
                    " 0.294   (quotient)\n" +
                    "    ---------\n" +
                    "17 | 5.0000   (dividend)\n" +
                    "     -34        (partial quotient)\n" +
                    "    ------\n" +
                    "        160     (remainder)\n\n" +
                    "Step 6: We can see that the division process continues indefinitely without repeating any pattern. Therefore, the decimal quotient is non-terminating.\n" +
                    "Therefore, when you divide 5 by 17, it results in a non-terminating decimal quotient."
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "Which of the following decimals is a terminating decimal?",
            "0.125",
            "0.333...",
            "0.7151515...",
            "0.833...",
            1,
            "Step 1: Count the number of decimal places. In this case, there are three decimal places.\n\n" +
                    "Step 2: Since there are a finite number of decimal places (three in this case), the decimal is terminating.\n\n" +
                    "Therefore, 0.125 is a terminating decimal."
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "What type of decimal is 0.75?",
            "Terminating",
            "Non-terminating",
            "Repeating",
            "None of the above",
            1,
            "Step 1: Count the number of decimal places. In this case, there are two decimal places.\n\n" +
                    "Step 2: Since there are a finite number of decimal places (two in this case), the decimal is terminating.\n\n" +
                    "Therefore, 0.75 is a terminating decimal.\n\n" +
                    "Here are the steps summarized:\n\n" +
                    "Count the number of decimal places.\n" +
                    "If there is a finite number of decimal places, the decimal is terminating.\n" +
                    "In the case of 0.75, it has two decimal places, and therefore, it is a terminating decimal."
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "Which of the following decimals is a non-terminating decimal?",
            "0.25",
            "0.5",
            "0.75",
            "0.333...",
            4,
            "A non-terminating decimal is a decimal number that continues indefinitely without repeating or ending. In the case of 0.333..., the digit \"3\" repeats infinitely, indicating a non-terminating decimal.\n"
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "What type of decimal is 0.625?",
            "Terminating",
            "Non-terminating",
            "Repeating",
            "None of the above",
            1,
            "A terminating decimal is a decimal number that ends after a finite number of digits, without any repeating pattern. In the case of 0.625, it has three decimal places and does not repeat. Therefore, it is a terminating decimal.\n"
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "Which of the following decimals is a repeating decimal?",
            "0.2",
            "0.333...",
            "0.75",
            ".41",
            2,
            "A repeating decimal is a decimal number that has a repeating pattern of one or more digits. In the case of 0.333..., the digit \"3\" repeats indefinitely, indicating a repeating decimal.\n"
        )
        questionList.add(que10)

        val que11 = MultipleChoice(
            1,
            "Which type of decimal quotient is 0.125?",
            "Terminating decimal",
            "Non-terminating decimal",
            "Repeating decimal",
            "None of the above",
            1,
            "The decimal quotient 0.125 is a terminating decimal. A terminating decimal is a decimal number that has a finite number of digits after the decimal point and does not repeat indefinitely. In the case of 0.125, there are no digits that repeat, and the decimal terminates after the third decimal place."
        )
        questionList.add(que11)

        val que12 = MultipleChoice(
            1,
            "Which type of decimal quotient is 0.6666666...?",
            "Terminating decimal",
            "Non-terminating decimal",
            "Repeating decimal",
            "None of the above",
            3,
            "The decimal quotient 0.6666666... is a repeating decimal. A repeating decimal is a decimal number in which one or more digits repeat indefinitely after the decimal point. In the case of 0.6666666..., the digit 6 repeats infinitely."
        )
        questionList.add(que12)

        val que13 = MultipleChoice(
            1,
            "Which type of decimal quotient is 3.14159265358979323846264338327950288419716939937510...?",
            "Terminating decimal",
            "Non-terminating decimal",
            "Repeating decimal",
            "None of the above",
            2,
            "The decimal quotient 3.14159265358979323846264338327950288419716939937510... is a non-terminating decimal. A non-terminating decimal is a decimal number that continues indefinitely without repeating a pattern. The digits in the decimal representation of π (pi) continue indefinitely without repeating a specific pattern."
        )
        questionList.add(que13)

        val que14 = MultipleChoice(
            1,
            "Which type of decimal quotient is 0.381381381...?",
            "Terminating",
            "Non-terminating",
            "Repeating",
            "None of the above",
            3,
            "The decimal quotient 0.381381381... is a repeating decimal. A repeating decimal is a decimal number that has a repeating pattern of digits."
        )
        questionList.add(que14)

        val que15 = MultipleChoice(
            1,
            "Which type of decimal quotient is 4.5?",
            "Terminating",
            "Non-terminating",
            "Repeating",
            "None of the above",
            1,
            "The decimal quotient 4.5 is a terminating decimal. A terminating decimal is a decimal number that ends or terminates after a finite number of digits."
        )
        questionList.add(que15)

        return questionList
    }
}