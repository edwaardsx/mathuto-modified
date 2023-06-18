package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.TrueOrFalse

object Question11 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<TrueOrFalse>{

        val questionList = ArrayList<TrueOrFalse>()

        val que1 = TrueOrFalse(
            1,
            "When multiplying decimals, the number of decimal places in the product is always equal to the sum of the decimal places in the factors.",
            "True",
            "False",
            1,
            "True. When multiplying decimals, the number of decimal places in the product is always equal to the sum of the decimal places in the factors."
        )
        questionList.add(que1)

        val que2 = TrueOrFalse(
            1,
            "Multiplying a decimal by a whole number always results in a smaller product than the original decimal.",
            "True",
            "False",
            2,
            "False. Multiplying a decimal by a whole number does not always result in a smaller product than the original decimal. The product can be larger or smaller depending on the specific values involved. If the whole number is greater than 1, the product will typically be larger than the original decimal. However, if the whole number is between 0 and 1, the product will be smaller. It ultimately depends on the magnitude of the whole number being multiplied."
        )
        questionList.add(que2)

        val que3 = TrueOrFalse(
            1,
            "When multiplying decimals, you ignore the decimal point until the final step of the calculation.",
            "True",
            "False",
            2,
            "False. When multiplying decimals, you don't ignore the decimal point until the final step of the calculation. Instead, you need to consider the decimal places throughout the entire multiplication process. The decimal point plays a crucial role in determining the placement of decimal places in the product."
        )
        questionList.add(que3)

        val que4 = TrueOrFalse(
            1,
            "The product of two decimal numbers is always a decimal number.",
            "True",
            "False",
            1,
            "True. The product of two decimal numbers is always a decimal number. When you multiply two decimal numbers, the resulting product will also have decimal places. The number of decimal places in the product will depend on the decimal places in the factors and the multiplication operation performed."
        )
        questionList.add(que4)

        val que5 = TrueOrFalse(
            1,
            "When multiplying decimals, you can count the total number of decimal places in the factors and place the decimal point in the product accordingly.",
            "True",
            "False",
            1,
            "True. When multiplying decimals, you can count the total number of decimal places in the factors and place the decimal point in the product accordingly. The total number of decimal places in the product will be equal to the sum of the decimal places in the factors. By counting the decimal places and positioning the decimal point correctly in the product, you can ensure that the result has the appropriate decimal precision."
        )
        questionList.add(que5)

        val que6 = TrueOrFalse(
            1,
            "It is the highest number that divides exactly into two or more numbers.",
            "True",
            "False",
            2,
            "False. When multiplying decimals, the product may have more, fewer, or the same number of decimal places as the decimal factors. It depends on the specific values being multiplied. Sometimes the product will have more decimal places, but it is not a universal rule. It is possible for the product to have fewer or the same number of decimal places as the factors. The key is to count the total number of decimal places in the product by considering the decimal places in the factors and the multiplication operation performed."
        )
        questionList.add(que6)

        val que7 = TrueOrFalse(
            1,
            "When adding and subtracting fractions, all answers must be express in the __________.",
            "True",
            "False",
            1,
            "True. The product of a decimal and 1 is always equal to the original decimal. When you multiply any number by 1, including a decimal, the result is always the same as the original number. This holds true regardless of the number of decimal places in the decimal being multiplied."
        )
        questionList.add(que7)

        val que8 = TrueOrFalse(
            1,
            "A pizza is a great example of fractions! Each piece represents a part of a whole. The pizza is divided into 8 pieces. If you have one piece, what fraction of pizza you are eating?.",
            "True",
            "False",
            2,
            "False. When multiplying decimals, you cannot ignore the decimal points and treat the numbers as whole numbers. The decimal point represents a specific position and value within the number, and it plays a crucial role in determining the placement of decimal places in the product. Ignoring the decimal points would lead to incorrect results. To properly multiply decimals, you need to consider the decimal places and perform the multiplication accordingly."
        )
        questionList.add(que8)

        val que9 = TrueOrFalse(
            1,
            "3/4 + 2/4 is what example of fraction?",
            "True",
            "False",
            2,
            "False. When multiplying decimals, the product will not always be greater than the original decimal factors. The product can be greater, smaller, or equal to the original decimal factors, depending on the values being multiplied. The magnitude of the product is determined by the specific values involved in the multiplication."
        )
        questionList.add(que9)

        val que10 = TrueOrFalse(
            1,
            "5/6 - 3/4 is what example of fraction.",
            "True",
            "False",
            1,
            "True. When multiplying decimals, it is important to align the decimal points in the factors and the product to ensure accuracy. By aligning the decimal points, you can accurately determine the placement of decimal places in the product. This ensures that the resulting product maintains the correct decimal precision."
        )
        questionList.add(que10)

        return questionList
    }
}