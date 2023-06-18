package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.TrueOrFalse

object Question14 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<TrueOrFalse>{

        val questionList = ArrayList<TrueOrFalse>()

        val que1 = TrueOrFalse(
            1,
            "When dividing decimals, the number of decimal places in the quotient is always equal to the difference in the decimal places of the dividend and divisor.",
            "True",
            "False",
            1,
            "When dividing decimals, the number of decimal places in the quotient is generally equal to the difference in the decimal places of the dividend and divisor. This occurs because the division process involves shifting the decimal point in the dividend to align with the divisor and then performing the division as if working with whole numbers. The resulting quotient will have the same number of decimal places as the difference between the decimal places of the dividend and divisor. However, there may be cases where rounding or other factors affect the exact number of decimal places in the quotient."
        )
        questionList.add(que1)

        val que2 = TrueOrFalse(
            1,
            "Dividing a decimal by a whole number always results in a smaller quotient than the original decimal.",
            "True",
            "False",
            2,
            "Dividing a decimal by a whole number does not always result in a smaller quotient than the original decimal. The quotient can be greater than, equal to, or smaller than the original decimal, depending on the specific values being divided. The quotient will be influenced by the magnitude of the decimal and the value of the whole number divisor. It's important to perform the division operation to determine the precise quotient."
        )
        questionList.add(que2)

        val que3 = TrueOrFalse(
            1,
            "When dividing decimals, you shift the decimal point to the left in both the dividend and divisor to convert them to whole numbers before performing the division.",
            "True",
            "False",
            1,
            "When dividing decimals, you shift the decimal point to the left in both the dividend and divisor to convert them to whole numbers before performing the division. By shifting the decimal point to the left, you effectively multiply both the dividend and divisor by a power of 10, maintaining their relative values. This conversion to whole numbers simplifies the division process, making it easier to calculate the quotient."
        )
        questionList.add(que3)

        val que4 = TrueOrFalse(
            1,
            "The quotient of two decimal numbers is always a decimal number.",
            "True",
            "False",
            1,
            "The quotient of two decimal numbers is always a decimal number. When you divide one decimal number by another, the result will have a decimal representation. The number of decimal places in the quotient will depend on the specific values being divided and may involve rounding or terminating/repeating decimals. But regardless, the quotient will always be a decimal number."
        )
        questionList.add(que4)

        val que5 = TrueOrFalse(
            1,
            "When dividing decimals, you can count the total number of decimal places in the dividend and divisor and place the decimal point in the quotient accordingly.",
            "True",
            "False",
            1,
            "When dividing decimals, you can count the total number of decimal places in the dividend and divisor and place the decimal point in the quotient accordingly. The number of decimal places in the quotient will be equal to the difference in the decimal places between the dividend and divisor. By aligning the decimal points in the dividend and divisor and shifting the decimal point in the quotient, you can accurately represent the division of the decimals. This method ensures the correct placement of the decimal point in the quotient."
        )
        questionList.add(que5)

        val que6 = TrueOrFalse(
            1,
            "When dividing decimals, the quotient will have more decimal places than either the dividend or divisor.",
            "True",
            "False",
            2,
            "When dividing decimals, it is not necessarily true that the quotient will have more decimal places than either the dividend or divisor. The number of decimal places in the quotient depends on the specific values being divided and the result of the division. It is possible for the quotient to have fewer decimal places, the same number of decimal places, or more decimal places compared to the dividend or divisor. The exact number of decimal places in the quotient is determined by the division calculation and may involve rounding or terminating/repeating decimals."
        )
        questionList.add(que6)

        val que7 = TrueOrFalse(
            1,

            "The quotient of a decimal divided by 1 is always equal to the original decimal.",
            "True",
            "False",
            1,
            "The quotient of a decimal divided by 1 is always equal to the original decimal. When you divide a decimal number by 1, you are essentially dividing the number by itself. Any number divided by itself is always equal to 1. Therefore, the quotient of a decimal divided by 1 will be the same as the original decimal."
        )
        questionList.add(que7)

        val que8 = TrueOrFalse(
            1,
            "When dividing decimals, you can ignore the decimal points and treat the numbers as whole numbers.",
            "True",
            "False",
            2,
            "When dividing decimals, you cannot ignore the decimal points and treat the numbers as whole numbers. The decimal points play a crucial role in determining the placement of the decimal point in the quotient. Ignoring the decimal points would lead to incorrect results. To divide decimals correctly, you need to consider the decimal points and align them properly in the division process."
        )
        questionList.add(que8)

        val que9 = TrueOrFalse(
            1,
            "When dividing decimals, the quotient will always be greater than the dividend.",
            "True",
            "False",
            2,
            "When dividing decimals, the quotient can be greater than, equal to, or smaller than the dividend, depending on the specific values being divided. The quotient is influenced by the magnitude of the dividend and the divisor. For example, if the divisor is greater than the dividend, the quotient will be less than 1. On the other hand, if the divisor is smaller than the dividend, the quotient will be greater than 1. It is important to perform the division operation to determine the actual relationship between the dividend and the quotient."
        )
        questionList.add(que9)

        val que10 = TrueOrFalse(
            1,
            "When dividing mixed decimals, it is important to convert them to improper fractions before performing the division.",
            "True",
            "False",
            2,
            "When dividing mixed decimals, it is not necessary to convert them to improper fractions before performing the division. You can directly divide the mixed decimals as they are.\n\n" +
                    "However, if you prefer working with fractions, you can convert the mixed decimals to mixed numbers or improper fractions before performing the division. This conversion can provide a different representation of the numbers but is not mandatory for the division process itself. You can choose to divide the mixed decimals directly or convert them to fractions based on your preference and the requirements of the problem."
        )
        questionList.add(que10)

        return questionList
    }
}