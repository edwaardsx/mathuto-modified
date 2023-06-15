package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.Question
import java.io.Serializable

object Question1 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    //const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"
    const val QUESTION_ARRANGEMENT: String = "question_arrangement"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "What is a part of a whole or a set.",
            "Fraction",
            "Similar Fraction",
            "Lowest Common Denominator (LCD)",
            "Mixed Fraction",
            1,
            "A fraction represents a part of a whole or a set. It consists of a numerator (the number above the line) and a denominator (the number below the line). The numerator represents the number of parts being considered, while the denominator represents the total number of equal parts that make up the whole or set. Fractions are commonly used to express parts or portions, such as 1/2, 3/4, or 2/5, where the numerator indicates the number of parts and the denominator indicates the total number of equal parts in the whole or set."
        )
        questionList.add(question1)

        val question2 = Question(
            1,
            "Fractions with the same denominator.",
            "Fraction",
            "Similar Fraction",
            "Lowest Common Denominator (LCD)",
            "Dissimilar Fraction",
            2,
            "Fractions with the same denominator are called similar fractions. Similar fractions have different numerators but share a common denominator.\n\nFor example: 1/4, 3/4, and 5/4 are similar fractions because they all have a denominator of 4. The numerators (1, 3, and 5) indicate different parts of the whole or set, while the denominator (4) remains the same. Similar fractions represent different quantities that are partitioned into the same number of equal parts."
        )
        questionList.add(question2)

        val question3 = Question(
            1,
            "Fractions with different denominators.",
            "Lowest Common Denominator (LCD)",
            "Mixed Fraction",
            "Dissimilar Fraction",
            "Similar Fraction",
            3,
            "Fractions with different denominators are called dissimilar fractions. Dissimilar fractions have different numerators and different denominators.\n\nFor example: 1/3 and 2/5 are dissimilar fractions because they have different denominators (3 and 5). Dissimilar fractions represent different quantities that are partitioned into a different number of equal parts."
        )
        questionList.add(question3)

        val question4 = Question(
            1,
            "Composed of a whole number and a fraction.",
            "Dissimilar Fraction",
            "Mixed Fractions",
            "Greatest Common Factor (GCF)",
            "Similar Fraction",
            2,
            "Mixed fractions are composed of a whole number and a fraction. They are written in the form of a whole number followed by a proper fraction.\n\nFor example: 3 1/2 is a mixed fraction, where 3 is the whole number and 1/2 is the fraction. Mixed fractions are used to represent quantities that include a whole number and a portion of another whole."
        )
        questionList.add(question4)

        val question5 = Question(
            1,
            "To add or subtract dissimilar fractions, this is the smallest number that can be divided by the denominators.",
            "Fraction",
            "Similar Fraction",
            "Lowest Common Denominator (LCD)",
            "Mixed Fraction",
            3,
            "To add or subtract dissimilar fractions, you need to find the least common denominator (LCD). The LCD is the smallest number that can be divided evenly by the denominators of the given fractions. Finding the LCD allows you to convert the fractions into equivalent fractions with the same denominator, making it possible to add or subtract them. By using the LCD, the fractions can be combined and simplified to obtain the final result."
        )
        questionList.add(question5)

        val question6 = Question(
            1,
            "It is the highest number that divides exactly into two or more numbers.",
            "Dissimilar Fraction",
            "Mixed Fractions",
            "Greatest Common Factor (GCF)",
            "Lowest Common Denominator (LCD)",
            3,
            "The Greatest Common Factor (GCF) is the highest number that divides exactly into two or more numbers. It is the largest number that is a common factor of the given numbers. The GCF is used to simplify fractions, factor polynomials, and solve various mathematical problems. When dealing with fractions, finding the GCF allows you to reduce the fractions to their simplest form by dividing both the numerator and denominator by the GCF."
        )
        questionList.add(question6)

        val question7 = Question(
            1,
            "When adding and subtracting fractions, all answers must be express in the?",
            "Lowest Term",
            "Similar Fraction",
            "Dissimilar Fraction",
            "Mixed Fractions",
            1,
            "When adding and subtracting fractions, it is generally recommended to express the answers in the lowest term. This means simplifying the fraction as much as possible by dividing both the numerator and denominator by their greatest common factor (GCF). By reducing the fraction to its lowest terms, you obtain a fraction where the numerator and denominator have no common factors other than 1. This gives a simplified and more concise representation of the fraction."
        )
        questionList.add(question7)

        val question8 = Question(
            1,
            "A pizza is a great example of fractions! Each piece represents a part of a whole. The pizza is divided into 8 pieces. If you have one piece, what fraction of pizza you are eating?.",
            "1/8",
            "1/4",
            "2/4",
            "4/3",
            1,
            "If a pizza is divided into 8 pieces and you have one piece, you are eating 1 out of the 8 total pieces. This can be represented as the fraction 1/8, where the numerator (1) indicates the number of pieces you have and the denominator (8) represents the total number of equal parts that make up the whole pizza.\n\n" +
                    "Here's the step-by-step solution:\n\n" +
                    "1. The given problem states that the pizza is divided into 8 pieces.\n" +
                    "2. You have one piece of the pizza, which means you have 1 out of the 8 total pieces.\n" +
                    "3. To express this as a fraction, you write the number of pieces you have as the numerator, which is 1.\n" +
                    "4. The total number of pieces in the pizza is 8, so you write this as the denominator.\n" +
                    "5. Therefore, the fraction that represents the amount of pizza you are eating is 1/8."
        )
        questionList.add(question8)

        val question9 = Question(
            1,
            "3/4 + 2/4 is what example of fraction?",
            "Dissimilar Fraction",
            "Similar Fraction",
            "Mixed Fraction",
            "Lowest Common Denominator (LCD)",
            2,
            "When adding fractions with the same denominator, such as 3/4 + 2/4, they are called similar fractions. Similar fractions have the same denominator, which in this case is 4. When adding similar fractions, you keep the same denominator and simply add the numerators. In this example, the numerator becomes 3 + 2, resulting in the fraction 5/4.\n\n" +
                    "Here's the step-by-step solution:\n\n" +
                    "1. The given problem is to add the fractions 3/4 and 2/4.\n" +
                    "2. Since the fractions have the same denominator, which is 4, they are similar fractions.\n" +
                    "3. To add similar fractions, you keep the same denominator and simply add the numerators.\n" +
                    "4. In this case, you add the numerators 3 and 2, which gives you 5.\n" +
                    "5. The denominator remains the same, which is 4.\n" +
                    "6. Therefore, the sum of 3/4 + 2/4 is 5/4."
        )
        questionList.add(question9)

        val question10 = Question(
            1,
            "5/6 - 3/4 is what example of fraction?",
            "Dissimilar Fraction",
            "Similar Fraction",
            "Mixed Fraction",
            "Greatest Common Factor (GCF)",
            1,
            "When subtracting fractions with different denominators, such as 5/6 - 3/4, they are called dissimilar fractions. Dissimilar fractions have different denominators. To subtract dissimilar fractions, you need to find a common denominator and convert the fractions to have the same denominator.\n\n" +
                    "Here's the step-by-step solution:\n\n" +
                    "1. The given problem is to subtract the fractions 5/6 and 3/4.\n" +
                    "2. Since the fractions have different denominators (6 and 4), they are dissimilar fractions.\n" +
                    "3. To subtract dissimilar fractions, you need to find a common denominator. In this case, the least common denominator (LCD) is 12, which is the smallest number that both 6 and 4 can evenly divide into.\n" +
                    "4. To convert 5/6 and 3/4 to have a common denominator of 12, you need to multiply the numerator and denominator of each fraction by a suitable factor. For 5/6, multiplying both numerator and denominator by 2 gives you 10/12. For 3/4, multiplying both numerator and denominator by 3 gives you 9/12.\n" +
                    "5. Now that both fractions have the same denominator of 12, you can subtract them. 10/12 - 9/12 gives you 1/12.\n" +
                    "6. Therefore, the difference of 5/6 - 3/4 is 1/12"
        )
        questionList.add(question10)

        return questionList
    }
}
