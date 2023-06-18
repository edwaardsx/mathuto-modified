package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable


object Question3 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "Solve: 3/5 x 6 2/3 = ?",
            "3",
            "3 1/3",
            "4",
            "4 3/5",
            3,
            "To solve the multiplication problem (3/5) x (6 2/3), we can convert the mixed number to an improper fraction and then multiply the fractions.\n\n" +
                    "6 2/3 can be converted to an improper fraction as follows:\n\n" +
                    "6 2/3 = (6 * 3 + 2) / 3 = 20/3\n\n" +
                    "Now we can multiply the fractions:\n\n" +
                    "(3/5) x (20/3) = (3 * 20) / (5 * 3) = 60/15 = 4\n\n" +
                    "Therefore, the result of the multiplication is 4. The correct answer is option c. 4.a"
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "Give the product of 4 2/5 and 3/8.",
            "14/3",
            "11/3",
            "33/20",
            "3",
            3,
            "To find the product of 4 2/5 and 3/8, we can convert the mixed number to an improper fraction and then multiply the fractions.\n\n" +
                    "4 2/5 can be converted to an improper fraction as follows:\n\n" +
                    "4 2/5 = (4 * 5 + 2) / 5 = 22/5\n\n" +
                    "Now we can multiply the fractions:\n\n" +
                    "(22/5) * (3/8) = (22 * 3) / (5 * 8) = 66/40\n\n" +
                    "To simplify the fraction, we can divide both the numerator and denominator by their greatest common divisor, which is 2:\n\n" +
                    "66/40 ÷ 2/2 = 33/20\n\n" +
                    "The product of 4 2/5 and 3/8 is 33/20."
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "Multiply 4 2/5 and 3/8.",
            "1 1/3",
            "1 13/20",
            "1 18/ 20",
            "2 3/20",
            3,
            "To multiply 4 2/5 and 3/8, we need to convert the mixed number to an improper fraction and then multiply the fractions.\n\n" +
                    "4 2/5 can be converted to an improper fraction as follows:\n\n" +
                    "4 2/5 = (4 * 5 + 2) / 5 = 22/5\n\n" +
                    "Now we can multiply the fractions:\n\n" +
                    "(22/5) * (3/8) = (22 * 3) / (5 * 8) = 66/40\n\n" +
                    "To simplify the fraction, we can divide both the numerator and denominator by their greatest common divisor, which is 2:\n\n" +
                    "66/40 ÷ 2/2 = 33/20\n\n" +
                    "The result of multiplying 4 2/5 and 3/8 is 33/20, which is equivalent to 1 13/20.\n\n" +
                    "Therefore, the correct answer is option b. 1 13/20."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "What is the value of x in 1/3 x 5 = x?",
            "1 1/3",
            "1 2/3",
            "5/2",
            "5/4",
            2,
            "To find the value of x in the equation (1/3) * 5 = x, we can simplify the left side of the equation and solve for x.\n\n" +
                    "First, simplify (1/3) * 5:\n\n" +
                    "(1/3) * 5 = 5/3\n\n" +
                    "Now, the equation becomes:\n\n" +
                    "5/3 = x\n\n" +
                    "Therefore, the value of x is 5/3."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "What is the product of 9 3/10 and its reciprocal?",
            "0",
            "1",
            "2",
            "3",
            2,
            "To find the product of 9 3/10 and its reciprocal, we first need to convert 9 3/10 to an improper fraction and then find its reciprocal.\n\n" +
                    "9 3/10 can be converted to an improper fraction as follows:\n\n" +
                    "9 3/10   = (9 * 10 + 3) / 10 = 93/10\n\n" +
                    "The reciprocal of a fraction is obtained by interchanging the numerator and denominator. So, the reciprocal of 93/10 is 10/93.\n\n" +
                    "Now, we can multiply the fraction by its reciprocal:\n\n" +
                    "(93/10) * (10/93) = (93 * 10) / (10 * 93) = 930/930 = 1\n\n" +
                    "Therefore, the product of 9 3/10 and its reciprocal is 1. The correct answer is option b. 1."
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "Solve: 1/8 x 6 = ?",
            "9",
            "3/4",
            "18",
            "1/8",
            2,
            "To solve the multiplication problem (1/8) * 6, we can multiply the fractions.\n\n" +
                    "(1/8) * 6 = (1 * 6) / 8 = 6/8\n\n" +
                    "The fraction 6/8 can be simplified by dividing both the numerator and denominator by their greatest common divisor, which is 2:\n\n" +
                    "6/8 ÷ 2/2 = 3/4\n\n" +
                    "Therefore, the solution to (1/8) * 6 is 3/4. The correct answer is option b. 3/4."
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "Find 4/5 of 10",
            "1/3",
            "1/2",
            "8",
            "5 2/3",
            3,
            "Here's the step-by-step solution for finding 4/5 of 10:\n\n" +
                    "Multiply 10 by 4:\n" +
                    "10 * 4 = 40\n\n" +
                    "Divide the result by 5:\n" +
                    "40 / 5 = 8\n\n" +
                    "Therefore, 4/5 of 10 is 8."
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "Solve: 1/2 x 1/2 x 1/2 = ?",
            "2/32",
            "1/5",
            "1/8",
            "4",
            3,
            "Here's the step-by-step solution for solving (1/2) * (1/2) * (1/2):\n\n" +
                    "Multiply the numerators: 1 * 1 * 1 = 1.\n" +
                    "Multiply the denominators: 2 * 2 * 2 = 8.\n" +
                    "The result is 1/8.\n\n" +
                    "Therefore, (1/2) * (1/2) * (1/2) equals 1/8."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "What is n in 4/5 of 5/8 = n",
            "1/2",
            "1/8",
            "1/3",
            "1/5",
            1,
            "Here's the step-by-step solution for finding the value of n in the equation (4/5) * (5/8) = n:\n\n" +
                    "Multiply the numerators: 4 * 5 = 20.\n" +
                    "Multiply the denominators: 5 * 8 = 40.\n" +
                    "The result is 20/40.\n\n" +
                    "Simplify the fraction: Divide both the numerator and denominator by their greatest common divisor, which is 20.\n" +
                    "20/40 ÷ 20/20 = 1/2.\n" +
                    "Therefore, the value of n is 1/2."
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "12 1/3 x 2 1/2 = ?",
            "5 1/9",
            "5 4/9",
            "3",
            "4",
            2,
            "Here's the step-by-step solution for multiplying 2 1/3 and 2 1/2:\n\n" +
                    "Step 1: Convert the mixed numbers to improper fractions.\n" +
                    "2 1/3 = (2 * 3 + 1) / 3 = 7/3\n" +
                    "2 1/2 = (2 * 2 + 1) / 2 = 5/2\n\n" +
                    "Step 2: Multiply the fractions.\n" +
                    "(7/3) * (5/2) = (7 * 5) / (3 * 2) = 35/6\n\n" +
                    "Step 3: Simplify the fraction (if needed).\n" +
                    "The fraction 35/6 is already in its simplest form.\n\n" +
                    "Therefore, the product of 2 1/3 and 2 1/2 is 35/6."
        )
        questionList.add(que10)

        return questionList
    }
}