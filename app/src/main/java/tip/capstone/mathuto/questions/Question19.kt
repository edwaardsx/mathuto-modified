package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.TrueOrFalse
import java.io.Serializable

object Question19: Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<TrueOrFalse>{

        val questionList = ArrayList<TrueOrFalse>()

        val que1 = TrueOrFalse(
            1,
            "When solving multi-step problems involving division of decimals and other operations, you must always perform the division operation first.",
            "True",
            "False",
            2,
            "When solving multi-step problems involving division of decimals and other operations, the order of operations (also known as the \"PEMDAS\" or \"BODMAS\" rule) should be followed. According to the order of operations, you must perform operations inside parentheses first, then any exponents or roots, followed by multiplication and division from left to right, and finally addition and subtraction from left to right. So, division does not always need to be performed first; it depends on the specific problem and the order of operations."
        )
        questionList.add(que1)

        val que2 = TrueOrFalse(
            1,
            "In multi-step problems involving division of decimals, you should always round the quotient to the nearest whole number.",
            "True",
            "False",
            2,
            "In multi-step problems involving division of decimals, you should follow the appropriate level of precision based on the given problem and the desired level of accuracy. Rounding the quotient to the nearest whole number may not be suitable or accurate in all cases. It is important to consider the context and any specific instructions provided in the problem. Depending on the problem, you may need to round the quotient to a certain number of decimal places or express it as a fraction or mixed number."
        )
        questionList.add(que2)

        val que3 = TrueOrFalse(
            1,
            "In multi-step problems, the order in which you perform the operations can affect the final result.",
            "True",
            "False",
            1,
            "In multi-step problems, the order in which you perform the operations can indeed affect the final result. The order of operations, also known as the \"PEMDAS\" or \"BODMAS\" rule, provides guidelines for the sequence in which mathematical operations should be performed to ensure consistent and accurate results. If the operations are performed in a different order, the intermediate results and the final result may be different. It is important to follow the specified order of operations to obtain the correct solution."
        )
        questionList.add(que3)

        val que4 = TrueOrFalse(
            1,
            "When solving multi-step problems involving division of decimals and other operations, you should always start with the operation that appears first from left to right.",
            "True",
            "False",
            2,
            "When solving multi-step problems involving division of decimals and other operations, you should follow the order of operations, also known as the \"PEMDAS\" or \"BODMAS\" rule. According to this rule, you should perform operations inside parentheses first, then any exponents or roots, followed by multiplication and division from left to right, and finally addition and subtraction from left to right. So, the operation that appears first from left to right may not necessarily be the first operation you should perform. It depends on the order of operations specified in the problem."
        )
        questionList.add(que4)

        val que5 = TrueOrFalse(
            1,
            "When solving multi-step problems, it is not necessary to show the intermediate steps or calculations.",
            "True",
            "False",
            2,
            "When solving multi-step problems, it is important to show the intermediate steps or calculations, especially if you're working on paper or providing a detailed solution. Showing the intermediate steps helps to demonstrate the process you used to arrive at the final answer and allows for easier verification of your work. It also helps others understand your thought process and allows for easier identification of any errors made along the way. Additionally, showing the intermediate steps can be helpful in educational settings to demonstrate the application of various mathematical concepts and techniques."
        )
        questionList.add(que5)

        val que6 = TrueOrFalse(
            1,
            "In multi-step problems involving division of decimals, it is acceptable to approximate decimal numbers to whole numbers to simplify the calculations.",
            "True",
            "False",
            1,
            "In some cases, it is acceptable to approximate decimal numbers to whole numbers in multi-step problems involving division of decimals. This can be done to simplify calculations and make the problem more manageable. However, it's important to note that approximations may introduce some level of error in the final result. Therefore, if accuracy is crucial or if the problem specifically asks for a precise answer, it is recommended to carry out the calculations using the original decimal numbers without rounding or approximation. It's always important to consider the context and requirements of the problem before deciding to approximate decimal numbers"
        )
        questionList.add(que6)

        val que7 = TrueOrFalse(
            1,
            "The order of operations is the same when solving multi-step problems with both whole numbers and decimals.",
            "True",
            "False",
            1,
            "The order of operations, also known as the \"PEMDAS\" or \"BODMAS\" rule, remains the same when solving multi-step problems with both whole numbers and decimals. The order of operations is a standard convention in mathematics that helps ensure consistent and accurate results. It states that calculations should be performed in the following order: parentheses (brackets), exponents (powers or roots), multiplication and division (from left to right), and addition and subtraction (from left to right). This order applies to both whole numbers and decimals, and it helps maintain the proper sequence of operations and avoid ambiguity in the calculations."
        )
        questionList.add(que7)

        val que8 = TrueOrFalse(
            1,
            "When solving multi-step problems, you can perform the operations in any order as long as you end up with the correct answer.",
            "True",
            "False",
            2,
            "When solving multi-step problems, you must follow the order of operations, also known as the \"PEMDAS\" or \"BODMAS\" rule. The order of operations ensures consistency and accuracy in mathematical calculations. The rule states that calculations should be performed in the following order: parentheses (brackets), exponents (powers or roots), multiplication and division (from left to right), and addition and subtraction (from left to right). Deviating from this order can lead to incorrect results. Therefore, it is essential to perform the operations in the correct order to obtain the correct answer in multi-step problems."
        )
        questionList.add(que8)

        val que9 = TrueOrFalse(
            1,
            "In multi-step problems involving division of decimals, the final answer should always be expressed as a decimal.",
            "True",
            "False",
            2,
            "In multi-step problems involving division of decimals, the final answer may not necessarily be expressed as a decimal. It depends on the context and the specific problem being solved. While division of decimals often results in a decimal quotient, there are cases where the quotient can be a whole number or a fraction.\n\n" +
                    "For example, if you divide a decimal by a whole number and the division is exact, the quotient will be a whole number. Similarly, if you divide a decimal by another decimal and the division is exact, the quotient can be a fraction or a whole number.\n\n" +
                    "Therefore, it is important to consider the specific problem and the mathematical operations involved to determine whether the final answer should be expressed as a decimal, a fraction, or a whole number."
        )
        questionList.add(que9)

        val que10 = TrueOrFalse(
            1,
            "It is not necessary to check the reasonableness of the final answer in multi-step problems involving division of decimals.",
            "True",
            "False",
            2,
            "It is necessary to check the reasonableness of the final answer in multi-step problems involving division of decimals. Checking the reasonableness of the answer helps to ensure the accuracy of the solution and verify that it makes sense in the context of the problem.\n\n" +
                    "There are various ways to check the reasonableness of the final answer. One common approach is to estimate the result using mental math or approximation and compare it to the obtained answer. If the obtained answer is significantly different from the estimate, it indicates that an error may have occurred during the calculation.\n\n" +
                    "Additionally, you can perform a reverse calculation by multiplying the quotient back with the divisor to see if it yields the original dividend. If the result is close to the original dividend, it provides further confirmation of the accuracy of the division.\n\n" +
                    "By checking the reasonableness of the final answer, you can catch any potential errors and ensure the solution is valid and appropriate for the given problem."
        )
        questionList.add(que10)

        return questionList
    }
}