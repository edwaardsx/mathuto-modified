package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice

object  Question8 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "When the sum of 1.3240 and 1.4872 is subtracted from 4.0121, it will give you the difference of?.",
            "1.2109",
            "2.0905",
            "1.2009",
            "2.7009",
            3,
            "Here's a step-by-step solution:\n\n" +
                    "Start by adding 1.3240 and 1.4872 to find their sum:\n" +
                    "1.3240\n" +
                    "1.4872\n" +
                    "2.8112\n\n" +
                    "Now, subtract the sum (2.8112) from 4.0121:\n" +
                    "4.0121\n" +
                    "2.8112\n" +
                    "1.2009\n\n" +
                    "So, when you subtract the sum of 1.3240 and 1.4872 from 4.0121, you get a difference of 1.2009.\n\n" +
                    "Therefore, the correct answer is \"c. 1.2009.\""
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "What should be subtracted from 9.4518 to get 5.6324?",
            "3.4018",
            "3.8194",
            "3.0832",
            "3.1948",
            2,
            "To find what should be subtracted from 9.4518 to get 5.6324, follow these steps:\n\n" +
                    "Subtract 5.6324 from 9.4518:\n" +
                    "9.4518 - 5.6324 = 3.8194\n\n" +
                    "The result is 3.8194, which represents the difference between 9.4518 and 5.6324.\n\n" +
                    "Therefore, the solution is 3.819"
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "Take away 28.567 from the sum of 10.548 and 27.69, what's you get?.",
            "9.671",
            "8.671",
            "7.176",
            "6.176",
            1,
            "To find the result of taking away 28.567 from the sum of 10.548 and 27.69, follow these steps:\n\n" +
                    "Add 10.548 and 27.69:\n" +
                    "10.548 + 27.69 = 38.238\n\n" +
                    "Subtract 28.567 from the sum:\n" +
                    "38.238 - 28.567 = 9.671\n\n" +
                    "The result of taking away 28.567 from the sum of 10.548 and 27.69 is 9.671."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "Rina bought school items at the department store: bag for Php. 223.75, pencil  case for Php. 55.90, 6 notebooks for Php. 78.65 and a crayons for Php. 25.55. How much did she spend?",
            "Php. 382",
            "Php. 383",
            "Php. 384",
            "Php. 385",
            3,
            "To find out how much Rina spent on school items, add the prices of each item:\n\n" +
                    "Bag: Php. 223.75\n" +
                    "Pencil case: Php. 55.90\n" +
                    "6 notebooks: Php. 78.65\n" +
                    "Crayons: Php. 25.55\n\n" +
                    "Add all the amounts:\n\n" +
                    "223.75 + 55.90 + 78.65 + 25.55 = Php. 383.85\n\n" +
                    "Therefore, Rina spent Php. 383.85 on school items."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "Father bought 15.5833 liters of gasoline for his car. He consumed 0.58 litres on Monday and 4.7501 litres on Tuesday. How many liters of gasoline were left?",
            "11.2532",
            "10.2532",
            "9.3225",
            "8.5322",
            2,
            "To find out how many liters of gasoline were left, subtract the amount consumed from the total amount purchased:\n\n" +
                    "Total gasoline purchased: 15.5833 liters\n" +
                    "Gasoline consumed on Monday: 0.58 liters\n" +
                    "Gasoline consumed on Tuesday: 4.7501 liters\n\n" +
                    "Subtract the consumed amounts from the total:\n\n" +
                    "15.5833 - 0.58 - 4.7501 = 10.2532\n\n" +
                    "Therefore, there were 10.2532 liters of gasoline left."
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "Jean and Manny joined a walkathon to raise fund for a charitable organization. In six minutes, Jean walked 0.4805 km., while Manny walked 0.4818 km. By how many kilometer does Jean walks farther than Manny?",
            "0.0213 km",
            "0.1022km",
            "0.2021km",
            "0.0013km",
            4,
            "To find the difference in distance walked by Jean and Manny, subtract Manny's distance from Jean's distance:\n\n" +
                    "Jean's distance: 0.4805 km\n" +
                    "Manny's distance: 0.4818 km\n\n" +
                    "0.4805 km - 0.4818 km = -0.0013 km\n\n" +
                    "The result is -0.0013 km. This means that Manny walked 0.0013 km farther than Jean.\n\n" +
                    "However, it's important to note that the result is negative, indicating that Jean actually walked 0.0013 km less than Manny. Therefore, the correct answer is \"0.0013 km.\""
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "Mario had a long copper wire, from which he cut two pieces. One piece was 0.8324m and the other was 1.3568m. After cutting the two pieces, there was 3.9m copper wire left. What are the length of the wire at the start?",
            "3.0892",
            "4.0892",
            "5.0892",
            "6.0892",
            4,
            "To find the length of the wire at the start, we need to add the lengths of the two pieces that were cut from it to the length of the remaining wire.\n\n" +
                    "Length of the first piece: 0.8324m\n" +
                    "Length of the second piece: 1.3568m\n" +
                    "Length of the remaining wire: 3.9m\n\n" +
                    "Total length of the wire at the start = Length of the first piece + Length of the second piece + Length of the remaining wire\n\n" +
                    "Total length = 0.8324m + 1.3568m + 3.9m\n" +
                    "Total length = 6.0892m\n\n" +
                    "Therefore, the length of the wire at the start was 6.0892 meters."
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "Bob went shopping. He bought a pair of sandals for Php 85.50 and a pair of socks for Php 32.95. How much change did he get from Php 500.00 bill?",
            "Php 183.55",
            "Php 831.55",
            "Php 381.55",
            "Php 531.55",
            3,
            "To find the change Bob received, we need to subtract the total cost of the items from the amount he paid.\n\n" +
                    "Total cost of the items = Php 85.50 + Php 32.95 = Php 118.45\n" +
                    "Amount paid = Php 500.00\n\n" +
                    "Change = Amount paid - Total cost of the items\n" +
                    "Change = Php 500.00 - Php 118.45\n" +
                    "Change = Php 381.55\n\n" +
                    "Therefore, Bob received Php 381.55 in change."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "What number will you add 892.013 to get 958.2?",
            "46.187",
            "56.187",
            "66.187",
            "76.187",
            2,
            "To find the number that needs to be added to 892.013 to get 958.2, we subtract 892.013 from 958.2.\n\n" +
                    "958.2 - 892.013 = 66.187\n\n" +
                    "Therefore, the number you need to add to 892.013 to get 958.2 is 66.187.\n\n"
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "The sum of 1.0768 and 1.096 minus 1.0120 is",
            "1.1615",
            "1.1716",
            "2.1715",
            "2.5611",
            1,
            "To find the sum of 1.0768 and 1.096 and then subtract 1.0120, we first add 1.0768 and 1.096:\n\n" +
                    "1.0768 + 1.096 = 2.1728\n\n" +
                    "Then, we subtract 1.0120 from the result:\n\n" +
                    "2.1728 - 1.0120 = 1.1608\n\n" +
                    "Therefore, the correct answer is 1.1608."
        )
        questionList.add(que10)

        return questionList
    }
}