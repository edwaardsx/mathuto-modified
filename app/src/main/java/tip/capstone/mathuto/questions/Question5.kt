package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.TrueOrFalse

object Question5 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<TrueOrFalse>{

        val questionList = ArrayList<TrueOrFalse>()

        val que1 = TrueOrFalse(
            1,
            "What is a part of a whole or a set.",
            "True",
            "False",
            1,
            "True. A part refers to a portion or fraction of a whole or a set. It represents a subset or component of the entire entity. When we divide a whole into smaller sections or consider a subset of a larger set, each of those smaller sections or subsets is referred to as a part. Understanding parts is fundamental in concepts like fractions, proportions, and subsets in mathematics and set theory."
        )
        questionList.add(que1)

        val que2 = TrueOrFalse(
            1,
            "Fractions with the same denominator",
            "True",
            "False",
            2,
            "Unlike Fractions: Fractions with different denominators. So, fractions with the same denominator are called like fractions. The answer is False."
        )
        questionList.add(que2)

        val que3 = TrueOrFalse(
            1,
            "Fractions with different denominators.",
            "True",
            "False",
            1,
            "Fractions with different denominators can be compared, added, or subtracted, but they cannot be directly added or subtracted without finding a common denominator first. So, the statement \"Fractions with different denominators\" is True."
        )
        questionList.add(que3)

        val que4 = TrueOrFalse(
            1,
            "Composed of a whole number and a fraction.",
            "True",
            "False",
            1,
            "True. A mixed fraction is composed of a whole number and a fraction. It combines an integer part and a fractional part. For example, 3 1/2 is a mixed fraction where 3 is the whole number part, and 1/2 is the fractional part. Mixed fractions are commonly used to represent quantities that include both whole numbers and fractional parts."
        )
        questionList.add(que4)

        val que5 = TrueOrFalse(
            1,
            "To add or subtract dissimilar fractions, This is the smallest number that can be divided by the denominators.",
            "True",
            "False",
            1,
            "True. When adding or subtracting dissimilar fractions, you need to find a common denominator. The common denominator is the smallest number that can be divided evenly by the denominators of the fractions being added or subtracted. Finding a common denominator allows you to combine the fractions by adjusting their denominators to be the same. Once the denominators are the same, you can add or subtract the numerators accordingly."
        )
        questionList.add(que5)

        val que6 = TrueOrFalse(
            1,
            "It is the highest number that divides exactly into two or more numbers.",
            "True",
            "False",
            2,
            "False. It is the smallest number that divides exactly into two or more numbers.\n\n" +
                    "The statement you provided is incorrect. The highest number that divides exactly into two or more numbers is called the greatest common divisor (GCD) or highest common factor (HCF). It represents the largest number that can evenly divide all the given numbers.\n\n" +
                    "On the other hand, the smallest number that divides exactly into two or more numbers is called the least common multiple (LCM). It is the lowest common multiple of the numbers.\n\n" +
                    "So, the correct statement would be: \"The LCM is the smallest number that divides exactly into two or more numbers.\""
        )
        questionList.add(que6)

        val que7 = TrueOrFalse(
            1,
            "When adding and subtracting fractions, all answers must be express in the __________.",
            "True",
            "False",
            1,
            "True. When adding and subtracting fractions, all answers must be expressed in the same denominator. In order to perform addition or subtraction with fractions, it is necessary to find a common denominator for the fractions being added or subtracted. This allows the fractions to have the same base and makes it possible to combine or compare their numerators. By expressing the fractions with a common denominator, the resulting sum or difference can be determined accurately and consistently."
        )
        questionList.add(que7)

        val que8 = TrueOrFalse(
            1,
            "A pizza is a great example of fractions! Each piece represents a part of a whole. The pizza is divided into 8 pieces. If you have one piece, what fraction of pizza you are eating?.",
            "True",
            "False",
            1,
            "True. A pizza is indeed a great example of fractions. Each piece of the pizza represents a part of the whole pizza. In this case, if the pizza is divided into 8 pieces and you have one piece, you are eating 1/8th (one-eighth) of the whole pizza. This means that you are consuming one out of the eight equal parts that make up the entire pizza. Fractions are commonly used to represent portions or divisions of a whole, and the example of a pizza illustrates this concept well."
        )
        questionList.add(que8)

        val que9 = TrueOrFalse(
            1,
            "3/4 + 2/4 is what example of fraction?",
            "True",
            "False",
            1,
            "True. When adding fractions with the same denominator, the sum of the numerators is placed over the common denominator. In this case, 3/4 + 2/4 equals 5/4. The resulting fraction, 5/4, is an example of an improper fraction because the numerator (5) is greater than the denominator (4)."
        )
        questionList.add(que9)

        val que10 = TrueOrFalse(
            1,
            "5/6 - 3/4 is what example of fraction.",
            "True",
            "False",
            1,
            "\n" +
                    "True. When subtracting fractions with the same denominator, the difference of the numerators is placed over the common denominator. In this case, 5/6 - 3/4 equals 1/12. The resulting fraction, 1/12, is an example of a proper fraction because the numerator (1) is smaller than the denominator (12)."
        )
        questionList.add(que10)

        return questionList
    }
}