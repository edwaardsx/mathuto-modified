package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice

object Question18 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "A recipe calls for 0.75 cups of sugar to make 24 cookies. How much sugar is needed to make 36 cookies?",
            "1 cup",
            "1.125 cups",
            "1.5 cups",
            "1.75 cups",
            2,
            "To determine the amount of sugar needed to make 36 cookies, we can set up a proportion based on the ratio of cups of sugar to the number of cookies.\n\n" +
                    "Let's set up the proportion:\n\n" +
                    "0.75 cups / 24 cookies = x cups / 36 cookies\n\n" +
                    "To solve for x, we can cross-multiply:\n\n" +
                    "0.75 cups * 36 cookies = 24 cookies * x cups\n\n" +
                    "27 cups = 24x\n\n" +
                    "Now, divide both sides by 24 to solve for x:\n\n" +
                    "27 cups / 24 = x cups\n\n" +
                    "x ≈ 1.125 cups\n\n" +
                    "Therefore, the amount of sugar needed to make 36 cookies is approximately 1.125 cups."
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "A car travels a distance of 360 miles in 9 hours. What is the average speed of the car in miles per hour?",
            "36 mph",
            "40 mph",
            "45 mph",
            "50 mph",
            2,
            "To find the average speed of the car, we divide the total distance traveled by the total time taken.\n\n" +
                    "Average Speed = Total Distance / Total Time\n\n" +
                    "In this case, the car traveled a distance of 360 miles in 9 hours.\n\n" +
                    "Average Speed = 360 miles / 9 hours\n\n" +
                    "Average Speed = 40 miles per hour\n\n" +
                    "Therefore, the average speed of the car is 40 mph."
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "A store sold 180 boxes of cereal in one week. If each box weighs 0.5 pounds, what is the total weight of the cereal sold?",
            "80 pounds",
            "90 pounds",
            "100 pounds",
            "120 pounds",
            2,
            "To find the total weight of the cereal sold, we multiply the number of boxes by the weight per box.\n\n" +
                    "Number of boxes = 180\n" +
                    "Weight per box = 0.5 pounds\n\n" +
                    "Total weight = Number of boxes * Weight per box\n" +
                    "Total weight = 180 * 0.5\n" +
                    "Total weight = 90 pounds\n\n" +
                    "Therefore, the total weight of the cereal sold is 90 pounds."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "A rectangular field is 45.6 meters long and 12.8 meters wide. If the field is divided into square plots with side lengths of 2 meters, how many plots are there in total?",
            "145 plots",
            "160 plots",
            "180 plots",
            "200 plots",
            1,
            "To find the number of square plots in the rectangular field, we need to divide the total area of the field by the area of each square plot.\n\n" +
                    "Area of the field = Length * Width\n" +
                    "Area of the field = 45.6 meters * 12.8 meters\n\n" +
                    "Area of each square plot = Side length * Side length\n" +
                    "Area of each square plot = 2 meters * 2 meters\n\n" +
                    "Number of plots = Area of the field / Area of each square plot\n" +
                    "Number of plots = (45.6 meters * 12.8 meters) / (2 meters * 2 meters)\n\n" +
                    "Simplifying the calculation:\n\n" +
                    "Number of plots = (582.72 square meters) / (4 square meters)\n" +
                    "Number of plots = 145.68\n\n" +
                    "Therefore, there are approximately 145 plots in total."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "A recipe requires 2.5 cups of flour to make 12 muffins. How many cups of flour are needed to make 36 muffins?",
            "6 cups",
            "7.5 cups",
            "9 cups",
            "10.5 cups",
            2,
            "To determine the amount of flour needed to make 36 muffins, we can set up a proportion based on the ratio of cups of flour to the number of muffins.\n\n" +
                    "Let's set up the proportion:\n\n" +
                    "2.5 cups / 12 muffins = x cups / 36 muffins\n\n" +
                    "To solve for x, we can cross-multiply:\n\n" +
                    "2.5 cups * 36 muffins = 12 muffins * x cups\n\n" +
                    "90 cups = 12x\n\n" +
                    "Now, divide both sides by 12 to solve for x:\n\n" +
                    "90 cups / 12 = x cups\n\n" +
                    "x ≈ 7.5 cups\n\n" +
                    "Therefore, approximately 7.5 cups of flour are needed to make 36 muffins."
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "A group of friends shared a pizza with a total cost of $16.80. If each person contributed $2.10, how many friends were there?",
            "6 friends",
            "7 friends",
            "8 friends",
            "9 friends",
            3,
            "To find the number of friends, we divide the total cost of the pizza by the amount contributed by each person.\n\n" +
                    "Total cost of the pizza = $16.80\n" +
                    "Amount contributed by each person = $2.10\n\n" +
                    "Number of friends = Total cost of the pizza / Amount contributed by each person\n" +
                    "Number of friends = $16.80 / $2.10\n\n" +
                    "Number of friends = 8\n\n" +
                    "Therefore, there were 8 friends in total."
        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "A tank can hold 24.5 gallons of water. If it is filled to 75% of its capacity, how many gallons of water are in the tank?",
            "16.25 gallons",
            "18.375 gallons",
            "20.75 gallons",
            "22.125 gallons",
            2,
            "To find the number of gallons of water in the tank when it is filled to 75% of its capacity, we need to calculate 75% of the tank's capacity.\n\n" +
                    "Tank capacity = 24.5 gallons\n" +
                    "Percentage filled = 75%\n\n" +
                    "Gallons of water in the tank = Tank capacity * Percentage filled\n" +
                    "Gallons of water in the tank = 24.5 gallons * 0.75\n\n" +
                    "Gallons of water in the tank = 18.375 gallons\n\n" +
                    "Therefore, there are 18.375 gallons of water in the tank when it is filled to 75% of its capacity."
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "A shipment of 240 toys is divided equally into 12 boxes. How many toys are there in each box?",
            "12 toys",
            "18 toys",
            "20 toys",
            "24 toys",
            3,
            "To find the number of toys in each box, we divide the total number of toys by the number of boxes.\n\n" +
                    "Total number of toys = 240 toys\n" +
                    "Number of boxes = 12 boxes\n\n" +
                    "Toys in each box = Total number of toys / Number of boxes\n" +
                    "Toys in each box = 240 toys / 12 boxes\n\n" +
                    "Toys in each box = 20 toys\n\n" +
                    "Therefore, there are 20 toys in each box."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "A marathon race is 26.2 miles long. If a runner completes the race in 3.5 hours, what is the average speed of the runner in miles per hour?",
            "7.49 mph",
            "7.48 mph",
            "7.46 mph",
            "7.45 mph",
            1,
            "To find the average speed of the runner in miles per hour, we divide the total distance covered by the time taken.\n\n" +
                    "Total distance covered = 26.2 miles\n" +
                    "Time taken = 3.5 hours\n\n" +
                    "Average speed = Total distance covered / Time taken\n" +
                    "Average speed = 26.2 miles / 3.5 hours\n\n" +
                    "Average speed ≈ 7.49 mph\n\n" +
                    "Therefore, the average speed of the runner is approximately 7.49 mph."
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "A bag of candy weighs 0.35 pounds. If there are 40 candies in the bag, what is the weight of one candy?",
            "0.00875 pounds",
            "0.0085 pounds",
            "0.008 pounds",
            "0.0075 pounds",
            1,
            "To find the weight of one candy, we divide the total weight of the bag of candy by the number of candies.\n\n" +
                    "Total weight of the bag of candy = 0.35 pounds\n" +
                    "Number of candies = 40\n\n" +
                    "Weight of one candy = Total weight of the bag of candy / Number of candies\n" +
                    "Weight of one candy = 0.35 pounds / 40\n\n" +
                    "Weight of one candy ≈ 0.00875 pounds\n\n" +
                    "Therefore, the weight of one candy is approximately 0.00875 pounds."
        )
        questionList.add(que10)

        return questionList
    }
}