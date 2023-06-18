package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.TrueOrFalse


object Question4 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<TrueOrFalse>{

        val questionList = ArrayList<TrueOrFalse>()

        val que1 = TrueOrFalse(
            1,
            "When multiplying fractions, the product is always larger than either of the fractions being multiplied.",
            "True",
            "False",
            2,
            "False. When multiplying fractions, the product can be larger or smaller than either of the fractions being multiplied. The size of the product depends on the values of the fractions and their relationship to each other. For example, multiplying two proper fractions (fractions less than 1) may result in a smaller product, while multiplying a fraction by a fraction greater than 1 or a whole number may result in a larger product"
        )
        questionList.add(que1)

        val que2 = TrueOrFalse(
            1,
            "When multiplying a fraction by a whole number, the whole number can be written as a fraction with a denominator of 1.",
            "True",
            "False",
            1,
            "True. When multiplying a fraction by a whole number, the whole number can be written as a fraction with a denominator of 1. This is because any whole number can be expressed as a fraction by placing it over 1. When multiplying, you can then multiply the numerators together and the denominators together to find the product."
        )
        questionList.add(que2)

        val que3 = TrueOrFalse(
            1,
            "When multiplying fractions, if one fraction is proper and the other is improper, the product will always be an improper fraction.",
            "True",
            "False",
            2,
            "False. When multiplying fractions, if one fraction is proper (numerator is smaller than the denominator) and the other fraction is improper (numerator is equal to or larger than the denominator), the product can be either a proper fraction or an improper fraction. The size of the product depends on the specific values of the fractions being multiplied. It is possible for the product to be a proper fraction if the numerators and denominators align in such a way that the result is smaller than 1."
        )
        questionList.add(que3)

        val que4 = TrueOrFalse(
            1,
            "Multiplying any number by 1 results in the same number.",
            "True",
            "False",
            1,
            "True. Multiplying any number by 1 results in the same number. This is because the multiplicative identity property states that multiplying any number by 1 leaves the number unchanged."
        )
        questionList.add(que4)

        val que5 = TrueOrFalse(
            1,
            "When multiplying fractions, it is necessary to find a common denominator before performing the multiplication.",
            "True",
            "False",
            2,
            "False. When multiplying fractions, it is not necessary to find a common denominator before performing the multiplication. You can simply multiply the numerators together and multiply the denominators together to obtain the product. Finding a common denominator is only necessary when adding or subtracting fractions."
        )
        questionList.add(que5)

        val que6 = TrueOrFalse(
            1,
            "The product of two fractions with the same numerator will always be less than 1.",
            "True",
            "False",
            1,
            "When multiplying two fractions with the same numerator, the product will indeed be less than 1. Let's consider an example to understand why this is the case.\n\n" +
                    "Let's say we have two fractions: 2/5 and 2/7. Both fractions have the same numerator, which is 2.\n\n" +
                    "When we multiply these fractions: (2/5) * (2/7), the numerator becomes 2 * 2 = 4, and the denominator becomes 5 * 7 = 35.\n\n" +
                    "The resulting fraction is 4/35, which is less than 1 because the numerator is smaller than the denominator.\n\n" +
                    "This pattern holds true for any fractions with the same numerator. The product will always be less than 1 because the denominator becomes larger as you multiply the denominators together while the numerator remains the same.\n\n" +
                    "Therefore, the statement \"The product of two fractions with the same numerator will always be less than 1\" is True."
        )
        questionList.add(que6)

        val que7 = TrueOrFalse(
            1,
            "The product of any fraction and 0 is always 0.",
            "True",
            "False",
            1,
            "True. The product of any fraction and 0 is always 0. When you multiply any number, including fractions, by 0, the result is always 0. This property is known as the zero property of multiplication. Therefore, the statement is true."
        )
        questionList.add(que7)

        val que8 = TrueOrFalse(
            1,
            "When multiplying two fractions, if one fraction is a reciprocal of the other, the product will always be 1.",
            "True",
            "False",
            1,
            "True. When multiplying two fractions, if one fraction is the reciprocal of the other, the product will always be 1. The reciprocal of a fraction is obtained by interchanging the numerator and the denominator.\n\n" +
                    "Let's consider an example to illustrate this:\n\n" +
                    "Suppose we have two fractions: 3/4 and 4/3. The second fraction is the reciprocal of the first.\n\n" +
                    "When we multiply these fractions: (3/4) * (4/3), the numerator of the first fraction cancels out with the denominator of the second fraction, resulting in a numerator of 3 and a denominator of 3.\n\n" +
                    "Therefore, the product is 3/3, which simplifies to 1.\n\n" +
                    "This pattern holds true for any fractions where one is the reciprocal of the other. The product will always simplify to 1.\n\n" +
                    "Hence, the statement \"When multiplying two fractions, if one fraction is a reciprocal of the other, the product will always be 1\" is true."
        )
        questionList.add(que8)

        val que9 = TrueOrFalse(
            1,
            "When multiplying fractions, the order of multiplication does not matter.",
            "True",
            "False",
            1,
            "True. When multiplying fractions, the order of multiplication does not matter. The result of multiplying fractions is the same regardless of the order in which the multiplication is performed. This property is known as the commutative property of multiplication.\n\n" +
                    "For example, let's consider the fractions 2/3 and 4/5. If we multiply them in the order 2/3 * 4/5, we get (2 * 4) / (3 * 5) = 8/15.\n\n" +
                    "Now, if we reverse the order and multiply 4/5 * 2/3, we get (4 * 2) / (5 * 3) = 8/15.\n\n" +
                    "As you can see, the result is the same in both cases, 8/15. This holds true for any fractions, and therefore, the order of multiplication does not affect the product.\n\n" +
                    "Hence, the statement \"When multiplying fractions, the order of multiplication does not matter\" is true."
        )
        questionList.add(que9)

        val que10 = TrueOrFalse(
            1,
            "When multiplying mixed fractions, it is necessary to convert them to improper fractions before performing the multiplication.",
            "True",
            "False",
            2,
            "False. When multiplying mixed fractions, it is not necessary to convert them to improper fractions before performing the multiplication. You can directly multiply the whole numbers, multiply the numerators, and multiply the denominators separately to obtain the product.\n\n" +
                    "For example, let's consider the multiplication of the mixed fractions 2 1/3 and 3 1/4. You can calculate it as follows:\n\n" +
                    "2 1/3 * 3 1/4\n\n" +
                    "First, multiply the whole numbers: 2 * 3 = 6.\n\n" +
                    "Next, multiply the fractions: (1/3) * (1/4) = 1/12.\n\n" +
                    "Finally, add the products: 6 + 1/12.\n\n" +
                    "So, the result is 6 1/12.\n\n" +
                    "Therefore, you can perform the multiplication of mixed fractions without converting them to improper fractions. However, converting them to improper fractions can sometimes make the calculations easier, especially when dealing with more complex fractions or when simplification is required.\n\n" +
                    "Hence, the statement \"When multiplying mixed fractions, it is necessary to convert them to improper fractions before performing the multiplication\" is false."
        )
        questionList.add(que10)

        return questionList
    }
}