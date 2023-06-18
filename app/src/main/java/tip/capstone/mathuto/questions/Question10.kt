package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice

object Question10 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "27.83 x 10",
            "0.905",
            "278.3",
            "250.5",
            "3244.2",
            2,
            "To get the solution for multiplying 27.83 by 10, follow these steps:\n\n" +
                    "Step 1: Write down the number 27.83\n" +
                    "Step 2: Multiply the number by 10\n" +
                    "27.83 x 10 = 278.3\n\n" +
                    "Therefore, the solution is 278.3"
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "806.25 x 100",
            "5454.0",
            "2345.0",
            "80625.9",
            "0.234",
            3,
            "To multiply 806.25 by 100, follow these steps:\n\n" +
                    "Write down the number 806.25\n" +
                    "Multiply the number by 100\n" +
                    "806.25 x 100 = 80625\n\n" +
                    "Therefore, the correct answer is 80625"
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "9.05 x 0.1",
            "0.789",
            "0.384",
            "0.905",
            "0.653",
            3,
            "To multiply 9.05 by 0.1, follow these steps:\n\n" +
                    "Write down the number 9.05\n" +
                    "Multiply the number by 0.1\n" +
                    "9.05 x 0.1 = 0.905\n\n" +
                    "Therefore, the correct answer is 0.905"
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "0.36 x 0.01",
            "0.0036",
            "0.00345",
            "0.0034",
            "0.0052",
            1,
            "To multiply 0.36 by 0.01, follow these steps:\n\n" +
                    "Write down the number 0.36\n" +
                    "Multiply the number by 0.01\n" +
                    "0.36 x 0.01 = 0.0036\n\n" +
                    "Therefore, the correct answer is 0.0036"
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "100 x 2.50",
            "240.9",
            "23.0",
            "250.0",
            "900",
            3,
            "To multiply 100 by 2.50, follow these steps:\n\n" +
                    "Write down the number 100\n" +
                    "Multiply the number by 2.50\n" +
                    "100 x 2.50 = 250.0\n\n" +
                    "Therefore, the correct answer is 250.0"

        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "What is the result of multiplying 5.6 by 0.1?.",
            "0.056",
            "0.56",
            "0.0560",
            "0.560",
            2,
            "To multiply 5.6 by 0.1, follow these steps:\n\n" +
                    "Write down the number 5.6\n" +
                    "Multiply the number by 0.1\n" +
                    "5.6 x 0.1 = 0.56\n\n" +
                    "Therefore, the correct answer is 0.56"
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "Calculate the value of 0.075 multiplied by 0.01.",
            "0.00075",
            "0.0075",
            "0.75",
            "0.0750",
            1,
            "To calculate the value of 0.075 multiplied by 0.01, follow these steps:\n\n" +
                    "Write down the number 0.075\n" +
                    "Multiply the number by 0.01\n" +
                    "0.075 x 0.01 = 0.00075\n\n" +
                    "Therefore, the correct answer is 0.00075"
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "If you multiply 3.45 by 10, what is the result?",
            "0.345",
            "3.45",
            "34.5",
            "345",
            3,
            "Here's the step-by-step solution to multiplying 3.45 by 10:\n\n" +
                    "Write down the number 3.45\n" +
                    "Multiply 3.45 by 10 by moving the decimal point one place to the right.\n" +
                    "Move the decimal point in 3.45 one place to the right: 34.5\n" +
                    "The result of multiplying 3.45 by 10 is 34.5.\n" +
                    "So, step-by-step, the solution is:\n\n" +
                    "3.45 x 10 = 34.5"
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "Calculate the product of 2.8 multiplied by 100.",
            "280",
            "28",
            "2.8",
            "0.028",
            1,
            "To calculate the product of 2.8 multiplied by 100, follow these steps:\n\n" +
                    "Write down the number 2.8.\n" +
                    "Multiply 2.8 by 100 by moving the decimal point two places to the right.\n" +
                    "Move the decimal point in 2.8 two places to the right: 280\n" +
                    "The result of multiplying 2.8 by 100 is 280.\n" +
                    "So, step-by-step, the solution is:\n\n" +
                    "2.8 x 100 = 280"
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "What is the result of multiplying 4.2 by 0.1?",
            "0.042",
            "0.42",
            "4.2",
            "0.0042",
            1,
            "To find the product of 4.2 multiplied by 0.1, follow these steps:\n\n" +
                    "Write down the number 4.2.\n" +
                    "Multiply 4.2 by 0.1.\n" +
                    "Multiply the numbers without the decimal point: 42 x 1 = 42.\n" +
                    "Count the total number of decimal places in the original numbers (1 in 0.1 and 1 in 4.2).\n" +
                    "Place the decimal point in the product by counting the total number of decimal places from step 3.\n" +
                    "In this case, there are 2 decimal places, so the decimal point should be placed two places from the right: 0.042.\n" +
                    "The result of multiplying 4.2 by 0.1 is 0.042.\n" +
                    "So, step-by-step, the solution is:\n\n" +
                    "4.2 x 0.1 = 0.042"
        )
        questionList.add(que10)

        return questionList
    }
}