package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.TrueOrFalse

object Question6 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<TrueOrFalse>{

        val questionList = ArrayList<TrueOrFalse>()

        val que1 = TrueOrFalse(
            1,
            "Danna cuts the yellow ribbon 5 1/3 meter long into 8 pieces equal length each piece is equal to 2/3m.",
            "True",
            "False",
            1,
            "True. According to the information provided, if Danna cuts a yellow ribbon that is 5 1/3 meters long into 8 equal pieces, and each piece is equal to 2/3 meters, then the statement is true.\n\n" +
                    "To find the length of each piece, we need to divide the total length of the ribbon (5 1/3 meters) by the number of pieces (8). Using the mixed number 5 1/3, we convert it to an improper fraction: 5 1/3 = (5 * 3 + 1) / 3 = 16/3 meters.\n\n" +
                    "Dividing 16/3 meters by 8 gives us (16/3) / 8 = 16/3 * 1/8 = 16/24 = 2/3 meters.\n\n" +
                    "Therefore, each piece would be equal to 2/3 meters, as stated in the statement."
        )
        questionList.add(que1)

        val que2 = TrueOrFalse(
            1,
            "Mr. Antonio brought home 8 slices of cheese cake for his children. If each got 1 4/16 slice of the cake there's a 6 pieces of cheese cake.",
            "True",
            "False",
            1,
            "True.\n\n" +
                    "If Mr. Antonio brought home 8 slices of cheesecake and each child got 1 4/16 (or 1/4) slice of the cake, and the statement mentions that there are 6 pieces of cheesecake, then the statement is true.\n\n" +
                    "To determine the number of pieces of cheesecake, we can multiply the number of children by the portion size.\n\n" +
                    "6 pieces = 6 * (1 4/16) = 6 * (1/4) = 6 * 1/4 = 6/4 = 3/2.\n\n" +
                    "Therefore, according to the information provided, there are 6 pieces of cheesecake when each child receives a 1 4/16 slice (equivalent to 1/4 slice)."
        )
        questionList.add(que2)

        val que3 = TrueOrFalse(
            1,
            "Johnny combined 7/4 cups of pancake mix and 3/4 of a cup of water to make a pancake batter. If he uses 1/4 of a cup of batter to make each pancake, there's a pancakes can Johnny make 6.",
            "True",
            "False",
            1,
            "True. If Johnny combined 7/4 cups of pancake mix and 3/4 of a cup of water to make a pancake batter, and he uses 1/4 of a cup of batter to make each pancake, then the statement is true.\n\n" +
                    "To determine the number of pancakes Johnny can make, we divide the total amount of batter by the amount of batter used for each pancake.\n\n" +
                    "Total amount of batter = (7/4) + (3/4) = 10/4 cups.\n\n" +
                    "Number of pancakes = (10/4) / (1/4) = (10/4) * (4/1) = 10 pancakes.\n\n" +
                    "Therefore, according to the information provided, Johnny can make 10 pancakes."
        )
        questionList.add(que3)

        val que4 = TrueOrFalse(
            1,
            "Janette brought to school 4/5 of a cake which she and her 3 friends shared equally 5 cake each of them.\n",
            "True",
            "False",
            2,
            "False.\n\n" +
                    "If Janette brought 4/5 of a cake to school and she and her 3 friends shared the cake equally, we need to determine the portion each person receives.\n\n" +
                    "To find the amount of cake each person receives, we divide the total amount of cake (4/5) by the number of people (4).\n\n" +
                    "(4/5) / 4 = (4/5) * (1/4) = 4/20 = 1/5.\n\n" +
                    "Therefore, each person receives 1/5 of the cake. If there are 5 people in total, they would receive 5/5 of the cake, which is equal to the whole cake.\n\n" +
                    "Hence, the statement is false. The cake would be divided equally among the 4 people, and each person would receive 1/5 of the cake."
        )
        questionList.add(que4)

        val que5 = TrueOrFalse(
            1,
            "A ship is carrying 200 passengers. This is 2/3 of its full capacity and the capacity of the ship is 300.",
            "True",
            "False",
            1,
            "True.\n\n" +
                    "If the ship is carrying 200 passengers, which is 2/3 of its full capacity, we can determine the full capacity of the ship.\n\n" +
                    "Let x be the full capacity of the ship.\n\n" +
                    "According to the given information, we can write the equation:\n\n" +
                    "(2/3) * x = 200\n\n" +
                    "To solve for x, we can multiply both sides of the equation by the reciprocal of 2/3, which is 3/2:\n\n" +
                    "x = 200 * (3/2) = 300\n\n" +
                    "Therefore, the full capacity of the ship is 300, as stated in the statement"
        )
        questionList.add(que5)

        val que6 = TrueOrFalse(
            1,
            "When dividing fractions, you invert the divisor and multiply.",
            "True",
            "False",
            1,
            "True.\n\n" +
                    "When dividing fractions, you can simplify the process by multiplying the dividend (the first fraction) by the reciprocal of the divisor (the second fraction). This is also known as \"flipping\" the second fraction and multiplying.\n\n" +
                    "For example, if we have the division expression (a/b) ÷ (c/d), we can find the result by multiplying the dividend (a/b) by the reciprocal of the divisor (d/c):\n\n" +
                    "(a/b) ÷ (c/d) = (a/b) * (d/c) = (a * d) / (b * c)\n\n" +
                    "By inverting the divisor and multiplying, we simplify the division of fractions."
        )
        questionList.add(que6)

        val que7 = TrueOrFalse(
            1,
            "The dividend is the number being divided in a division problem.",
            "True",
            "False",
            1,
            "True, in a division problem, the dividend is indeed the number being divided. The divisor is the number or quantity by which the dividend is divided to obtain the quotient. Thank you for pointing out the mistake, and I apologize for any confusion caused by my previous response."
        )
        questionList.add(que7)

        val que8 = TrueOrFalse(
            1,
            "To divide a mixed fraction, you convert it to an improper fraction and then follow the same division process.",
            "True",
            "False",
            1,
            "True.\n\n" +
                    "To divide a mixed fraction, it is generally easier to convert it to an improper fraction before performing the division. Here are the steps:\n\n" +
                    "Convert the mixed fraction to an improper fraction by multiplying the whole number by the denominator and adding the numerator. The result becomes the new numerator, and the denominator remains the same.\n\n" +
                    "Once you have the improper fraction, you can proceed with the division process. This involves inverting the divisor (the fraction you are dividing by) and multiplying it by the dividend (the improper fraction).\n\n" +
                    "Simplify the resulting fraction, if possible, by reducing it to lowest terms.\n\n" +
                    "Converting the mixed fraction to an improper fraction helps simplify the division process and often provides a more concise answer."
        )
        questionList.add(que8)

        val que9 = TrueOrFalse(
            1,
            "In a division problem involving fractions, you can simplify the fractions before performing the division.",
            "True",
            "False",
            1,
            "True.\n\n" +
                    "In a division problem involving fractions, it is often beneficial to simplify the fractions before performing the division. Simplifying the fractions means reducing them to their simplest form by dividing both the numerator and denominator by their greatest common divisor.\n\n" +
                    "By simplifying the fractions, you can work with smaller numbers and obtain a more concise answer. It also helps to avoid dealing with large numbers and reduces the chance of making errors during the calculation.\n\n" +
                    "After simplifying the fractions, you can proceed with the division by multiplying the numerator of the first fraction by the reciprocal of the second fraction.\n\n" +
                    "Simplifying the fractions beforehand is not mandatory, but it is a helpful step to make the division process easier and obtain a simplified or fully reduced answer."
        )
        questionList.add(que9)

        val que10 = TrueOrFalse(
            1,
            "Division is the inverse operation of multiplication, and the same rules apply when dividing fractions.",
            "True",
            "False",
            1,
            "True.\n\n" +
                    "Division is indeed the inverse operation of multiplication, and the same rules that apply to multiplying fractions also apply to dividing fractions.\n\n" +
                    "To divide fractions, you can follow these steps:\n\n" +
                    "Keep the first fraction as it is (the dividend).\n\n" +
                    "Take the reciprocal (flip) the second fraction (the divisor).\n\n" +
                    "Multiply the first fraction (dividend) by the reciprocal of the second fraction (divisor).\n\n" +
                    "Simplify the resulting fraction, if possible, by reducing it to lowest terms.\n\n" +
                    "These steps mirror the process of multiplying fractions, but with the second fraction inverted as the reciprocal. By following these rules, you can correctly divide fractions and obtain the desired result.\n\n" +
                    "Remember to always simplify the resulting fraction to its simplest form, if applicable, to provide the most concise answer."
        )
        questionList.add(que10)

        return questionList
    }
}