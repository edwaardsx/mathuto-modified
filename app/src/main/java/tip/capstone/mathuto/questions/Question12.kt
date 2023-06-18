package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question12 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "A store sells a toy for $10. If Billy buys 3 toys and there is a 20% discount on the total purchase, what is the total cost of the toys after the discount?",
            "$24",
            "$22",
            "$18",
            "$20",
            1,
            "Solution:\n" +
                    "Step 1: Multiply the price of one toy by the number of toys to find the total cost before the discount.\n" +
                    "\$10 x 3 = \$30\n\n" +
                    "Step 2: Calculate the discount amount by multiplying the total cost by the discount percentage.\n" +
                    "\$30 x 20% = \$6\n\n" +
                    "Step 3: Subtract the discount amount from the total cost to find the total cost after the discount.\n" +
                    "\$30 - \$6 = \$24"
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "A recipe requires 1.5 cups of flour. If you want to make 2 times the recipe, how many cups of flour will you need?",
            "3 cups",
            "2.5 cups",
            "2 cups",
            "1 cup",
            1,
            "Step 1: Multiply the amount of flour required for one recipe by the number of times you want to make the recipe.\n" +
                    "1.5 cups x 2 = 3 cups"
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "A car traveled 50 miles on Monday, 60 miles on Tuesday, and 30 miles on Wednesday. What was the total distance traveled by the car over these three days?",
            "120 miles",
            "130 miles",
            "140 miles",
            "150 miles",
            3,
            "Solution:\n" +
                    "Step 1: Add the distances traveled on each day.\n" +
                    "50 miles + 60 miles + 30 miles = 140 miles"
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "A store is offering a 30% discount on a $50 toy. What is the sale price of the toy after the discount?",
            "$35",
            "$40",
            "$45",
            "$25",
            1,
            "Solution:\n" +
                    "Step 1: Calculate the discount amount by multiplying the original price by the discount percentage.\n" +
                    "\$50 x 30% = \$15\n\n" +
                    "Step 2: Subtract the discount amount from the original price to find the sale price.\n" +
                    "\$50 - \$15 = \$35"
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "A toy is originally priced at $20, but it is on sale for 10% off. What is the sale price of the toy?",
            "$22",
            "$80",
            "$19",
            "$20",
            2,
            "Solution:\n" +
                    "Step 1: Calculate the discount amount by multiplying the original price by the discount percentage.\n" +
                    "\$20 x 10% = \$2\n\n" +
                    "Step 2: Subtract the discount amount from the original price to find the sale price.\n" +
                    "\$20 - \$2 = \$18"
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "Tom bought 2 pounds of apples for $4. What is the cost of the apples per pound?",
            "$1",
            "$2",
            "$3",
            "$4",
            2,
            "Solution:\n" +
                    "Step 1: Divide the total cost by the number of pounds to find the cost per pound.\n" +
                    "\$4 ÷ 2 = \$2"
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "A box of chocolates contains 8 ounces. If a person eats 2 ounces of chocolates, what fraction of the box remains uneaten?",
            "1/4",
            "1/3",
            "1/2",
            "3/4",
            4,
            "Solution:\n" +
                    "Step 1: Subtract the amount eaten from the total amount to find the amount remaining.\n" +
                    "8 ounces - 2 ounces = 6 ounces\n\n" +
                    "Step 2: Express the remaining amount as a fraction of the total.\n" +
                    "6 ounces out of 8 ounces = 6/8 = 3/4"
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "A tank contains 5 gallons of water. If 2 gallons of water are used, how much water remains in the tank?",
            "3 gallons",
            "2 gallons",
            "1 gallon",
            "4 gallons",
            1,
            "Solution:\n" +
                    "Step 1: Subtract the amount used from the total amount to find the amount remaining.\n" +
                    "5 gallons - 2 gallons = 3 gallons"
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "The distance between two cities is 100 miles. If a car travels at an average speed of 50 miles per hour, how long will it take to reach the destination?",
            "2 hours",
            "3 hours",
            "4 hours",
            "5 hours",
            1,
            "Solution:\n" +
                    "Step 1: Divide the total distance by the speed to find the time taken.\n" +
                    "100 miles ÷ 50 miles per hour = 2 hours"
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "A store is offering a 15% discount on all toys. If a customer buys a toy for $25, what is the sale price after the discount?",
            "$22.50",
            "$21.25",
            "$20.75",
            "$23.75",
            2,
            "Solution:\n" +
                    "Step 1: Calculate the discount amount by multiplying the original price by the discount percentage.\n" +
                    "\$25 x 15% = \$3.75\n\n" +
                    "Step 2: Subtract the discount amount from the original price to find the sale price.\n" +
                    "\$25 - \$3.75 = \$21.25"
        )
        questionList.add(que10)

        return questionList
    }
}