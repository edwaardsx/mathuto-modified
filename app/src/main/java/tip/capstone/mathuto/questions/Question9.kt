package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question9 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "0.23\\nx 0.7\\n_______",
            "3.325",
            "4.1393",
            "0.161",
            "16.56",
            3,
            "Here's the step-by-step solution for finding the product of 0.23 and 0.7:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "23 x 7 = 161.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there are 2 decimal places (0.23 has 2 decimal places, and 0.7 has 1 decimal place).\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 2. In this case, we have 2 decimal places, so the decimal point is placed two places from the right:\n\n" +
                    "1.61\n\n" +
                    "Therefore, the product of 0.23 and 0.7 is 0.161."
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "7.2\\nx 2.3\\n_______",
            "3.325",
            "16.56",
            "15.762",
            "1,896.3",
            2,
            "Here's the step-by-step solution for finding the product of 7.2 and 2.3:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "72 x 23 = 1656.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there is 1 decimal place in 7.2 and 1 decimal place in 2.3.\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 2. In this case, we have 2 decimal places, so the decimal point is placed two places from the right:\n\n" +
                    "16.56\n\n" +
                    "Therefore, the product of 7.2 and 2.3 is 16.56."
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "0.35\\nx 9.5\\n________",
            "90",
            "15.808",
            "3.325",
            "47.25",
            2,
            "Here's the step-by-step solution for finding the product of 0.35 and 9.5:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "35 x 95 = 3325.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there is 2 decimal places in 0.35 and 1 decimal place in 9.5.\n\n" +
                    "Add the total number of decimal places from step 2. In this case, we have 3 decimal places.\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 3. In this case, we have 3 decimal places, so the decimal point is placed three places from the right:\n\n" +
                    "15.808\n\n" +
                    "Therefore, the product of 0.35 and 9.5 is 15.808. The correct answer is 15.808."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "4.16\\nx 3.8\\n________",
            "0.161",
            "15.808",
            "15.808",
            "47.25",
            3,
            "Here's the step-by-step solution for finding the product of 4.16 and 3.8:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "416 x 38 = 15808.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there is 2 decimal places in 4.16 and no decimal places in 3.8.\n\n" +
                    "Add the total number of decimal places from step 2. In this case, we have 2 decimal places.\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 3. In this case, we have 2 decimal places, so the decimal point is placed two places from the right:\n\n" +
                    "15.808\n\n" +
                    "Therefore, the product of 4.16 and 3.8 is 15.808. The correct answer is (c) 15.808."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "21.3 x 0.74",
            "15.762",
            "15.808",
            "0.161",
            "47.25",
            1,
            "Here's the step-by-step solution for finding the product of 21.3 and 0.74:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "213 x 74 = 15762.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there is 1 decimal place in 21.3 and 2 decimal places in 0.74.\n\n" +
                    "Add the total number of decimal places from step 2. In this case, we have 3 decimal places.\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 3. In this case, we have 3 decimal places, so the decimal point is placed three places from the right:\n\n" +
                    "15.762\n\n" +
                    "Therefore, the product of 21.3 and 0.74 is 15.762. The correct answer is 15.762."
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "7.81 x 0.53",
            "15.762",
            "15.808",
            "0.161",
            "41.393",
            4,
            "Here's the step-by-step solution for finding the product of 7.81 and 0.53:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "781 x 53 = 41393.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there is 2 decimal places in 7.81 and 2 decimal places in 0.53.\n\n" +
                    "Add the total number of decimal places from step 2. In this case, we have 4 decimal places.\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 3. In this case, we have 4 decimal places, so the decimal point is placed four places from the right:\n\n" +
                    "41.393"
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "39.6 x 5.8",
            "15.762",
            "15.808",
            "0.161",
            "229.68",
            4,
            "To calculate the product of 39.6 and 5.8, follow these steps:\n\n" +
                    "Multiply the two numbers without considering the decimal points:\n" +
                    "396 x 58 = 22968.\n\n" +
                    "Count the total number of decimal places in the original numbers. In this case, there is 1 decimal place in 39.6 and no decimal places in 5.8.\n\n" +
                    "Add the total number of decimal places from step 2. In this case, we have 1 decimal place.\n\n" +
                    "Place the decimal point in the product by counting from the rightmost digit and moving the decimal point to the left, according to the number of decimal places counted in step 3. In this case, we have 1 decimal place, so the decimal point is placed one place from the right:\n\n" +
                    "229.68"
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "A fruit vendor was able to sell 7.5 dozens of mangoes. How many pieces of mangoes were he able to sell?",
            "90",
            "80",
            "30",
            "100",
            1,
            "Here's the step-by-step solution:\n\n" +
                    "Start with the given information: The fruit vendor sold 7.5 dozens of mangoes.\n" +
                    "Recall that there are 12 pieces in one dozen.\n" +
                    "Multiply the number of dozens by 12 to find the total number of pieces: 7.5 x 12 = 90.\n" +
                    "The result is 90, which means the fruit vendor sold 90 pieces of mangoes.\n" +
                    "So, the step-by-step solution is as follows:\n" +
                    "7.5 x 12 = 90.\n\n" +
                    "Therefore, the fruit vendor was able to sell 90 pieces of mangoes."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "A lumberyard sells 21 long wood mouldings. If each moulding measures 2.25 meters each, how many meters of mouldings are there?\n",
            "47.25",
            "23.54",
            "32.12",
            "32.54",
            1,
            "To find the total length of the wood mouldings, you need to multiply the number of mouldings by the length of each moulding.\n\n" +
                    "Given:\n" +
                    "Number of mouldings = 21\n" +
                    "Length of each moulding = 2.25 meters\n\n" +
                    "To find the total length:\n" +
                    "Total length = Number of mouldings x Length of each moulding\n" +
                    "Total length = 21 x 2.25\n\n" +
                    "Calculating the expression:\n" +
                    "Total length = 47.25 meters\n\n" +
                    "Therefore, the total length of the wood mouldings is 47.25 meters."
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "A school lawn has a dimension of 73.5 meters by 25.8 meters. What is the area of the school lawn?",
            "1,896.3 ",
            "123.2",
            "3124.2",
            "543.5",
            1,
            "To find the area of the school lawn, you need to multiply the length by the width.\n\n" +
                    "Given:\n" +
                    "Length = 73.5 meters\n" +
                    "Width = 25.8 meters\n\n" +
                    "To find the area:\n" +
                    "Area = Length x Width\n" +
                    "Area = 73.5 x 25.8\n\n" +
                    "Calculating the expression:\n" +
                    "Area = 1894.2 square meters\n\n" +
                    "Therefore, the area of the school lawn is 1894.2 square meters."
        )
        questionList.add(que10)

        val que11 = MultipleChoice(
            1,
            " What is the result of 3.2 multiplied by 2.5?",
            "6.4",
            "8.0",
            "5.0",
            "7.5",
            2,
            "To find the result of multiplying 3.2 by 2.5, simply multiply the two numbers together.\n\n" +
                    "3.2 x 2.5 = 8.0\n\n" +
                    "Therefore, the result of 3.2 multiplied by 2.5 is 8.0."
        )
        questionList.add(que11)

        val que12 = MultipleChoice(
            1,
            "A box contains 2.5 kilograms of apples. If there are 4 boxes, what is the total weight of the apples?",
            "6.0 kilograms",
            "8.0 kilograms",
            "9.5 kilograms",
            "10.0 kilograms",
            4,
            "To find the total weight of the apples in 4 boxes, multiply the weight of one box by the number of boxes.\n\n" +
                    "Weight of one box: 2.5 kilograms\n" +
                    "Number of boxes: 4\n\n" +
                    "Total weight: 2.5 kilograms * 4 = 10.0 kilograms\n\n" +
                    "Therefore, the total weight of the apples is 10.0 kilograms."
        )
        questionList.add(que12)

        val que13 = MultipleChoice(
            1,
            "A bag contains 0.6 kilograms of candies. If there are 3 bags, what is the total weight of the candies?",
            "1.6 kilograms",
            "1.8 kilograms",
            "1.4 kilograms",
            "1.2 kilograms",
            2,
            "To find the total weight of the candies in 3 bags, multiply the weight of one bag by the number of bags.\n\n" +
                    "Weight of one bag: 0.6 kilograms\n" +
                    "Number of bags: 3\n\n" +
                    "Total weight: 0.6 kilograms * 3 = 1.8 kilograms\n\n" +
                    "Therefore, the total weight of the candies is 1.8 kilograms."
        )
        questionList.add(que13)

        val que14 = MultipleChoice(
            1,
            "A book costs \$8.95. If you buy 5 books, how much will you spend in total?",
            "\$40.25",
            "\$45.25",
            "\$42.7",
            "\$44.75",
            1,
            "To find the total cost of buying 5 books, multiply the cost of one book by the number of books.\n\n" +
                    "Cost of one book: \$8.95\n" +
                    "Number of books: 5\n\n" +
                    "Total cost: \$8.95 * 5 = \$44.75\n\n" +
                    "Therefore, you will spend a total of \$44.75 if you buy 5 books."
        )
        questionList.add(que14)

        val que15 = MultipleChoice(
            1,
            "The length of a rectangle is 3.2 meters and the width is 1.5 meters. What is the area of the rectangle?",
            "4.8 square meters",
            "4.7 square meters",
            "4.0 square meters",
            "4.5 square meters",
            1,
            "To find the area of a rectangle, multiply its length by its width.\n\n" +
                    "Length of the rectangle: 3.2 meters\n" +
                    "Width of the rectangle: 1.5 meters\n\n" +
                    "Area = Length x Width = 3.2 meters x 1.5 meters = 4.8 square meters\n\n" +
                    "Therefore, the area of the rectangle is 4.8 square meters."
        )
        questionList.add(que15)

        return questionList
    }
}