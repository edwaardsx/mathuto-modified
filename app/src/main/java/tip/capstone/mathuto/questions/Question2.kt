package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice
import java.io.Serializable

object Question2 : Serializable {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val multipleChoiceList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "Justine bought 8 1/2 meters of rope. He used 4 3/4 meters for his project. How many meters of rope were left?",
            "3 3/4",
            "4 3/4",
            "5 3/4",
            "6 3/4",
            1,
            "Justine initially bought 8 1/2 meters of rope. He used 4 3/4 meters for his project. To find out how many meters of rope were left, we need to subtract the amount used from the initial amount.\n\n" +
                    "8 1/2 - 4 3/4\n\n" +
                    "To subtract fractions, we need a common denominator. In this case, the common denominator is 4. We can convert the mixed numbers to improper fractions:\n\n" +
                    "8 1/2 = 17/2\n" +
                    "4 3/4 = 19/4\n\n" +
                    "Now, we can subtract the fractions:\n\n" +
                    "17/2 - 19/4\n\n" +
                    "To subtract fractions, the denominators must be the same. We can convert 17/2 to have a denominator of 4:\n\n" +
                    "17/2 = 17/2 * 2/2 = 34/4\n\n" +
                    "Now we can subtract:\n\n" +
                    "34/4 - 19/4 = 15/4\n\n" +
                    "The result is 15/4. To express this as a mixed number, we divide the numerator (15) by the denominator (4):\n\n" +
                    "15 ÷ 4 = 3 with a remainder of 3.\n\n" +
                    "Therefore, the answer is 3 3/4. So, Justine has 3 3/4 meters of rope left."
        )
        multipleChoiceList.add(que1)

        val que2 = MultipleChoice(
            1,
            "James painted his room during summer. He used 1 2/4 gallons of white paint and 3 3/5 gallons of blue paint. Solve for the total gallons of paints James used.",
            "4 1/10",
            "5 1/10",
            "6 1/10",
            "7 1/10",
            2,
            "To find the total gallons of paint James used, we need to add the amounts of white paint and blue paint.\n\n" +
                    "White paint used: 1 2/4 gallons\n" +
                    "Blue paint used: 3 3/5 gallons\n\n" +
                    "Let's convert the mixed numbers to improper fractions:\n\n" +
                    "1 2/4 = 6/4\n" +
                    "3 3/5 = 18/5\n\n" +
                    "Now we can add the fractions:\n\n" +
                    "6/4 + 18/5\n\n" +
                    "To add fractions, we need a common denominator. In this case, the least common multiple (LCM) of 4 and 5 is 20. We can convert the fractions to have a denominator of 20:\n\n" +
                    "6/4 = 6/4 * 5/5 = 30/20\n" +
                    "18/5 = 18/5 * 4/4 = 72/20\n\n" +
                    "Now we can add:\n\n" +
                    "30/20 + 72/20 = 102/20\n\n" +
                    "The result is 102/20. To express this as a mixed number, we divide the numerator (102) by the denominator (20):\n\n" +
                    "102 ÷ 20 = 5 with a remainder of 2.\n\n" +
                    "Therefore, the answer is 5 2/20, which simplifies to 5 1/10. James used a total of 5 1/10 gallons of paint."
        )
        multipleChoiceList.add(que2)

        val que3 = MultipleChoice(
            1,
            "Eoin rode his bike for one-sixth of a kilometer on saturday and two-sixths of a kilometer on sunday. How many kilometers did he ride altogether?",
            "1/5",
            "1/4",
            "1/2",
            "1/3",
            3,
            "To find the total distance Eoin rode, we need to add the distances he rode on Saturday and Sunday.\n\n" +
                    "Distance rode on Saturday: one-sixth of a kilometer\n" +
                    "Distance rode on Sunday: two-sixths of a kilometer\n\n" +
                    "Let's add the fractions:\n\n" +
                    "1/6 + 2/6\n\n" +
                    "The denominators are the same, so we can add the numerators:\n\n" +
                    "1/6 + 2/6 = 3/6\n\n" +
                    "The result is 3/6. To simplify the fraction, we can divide the numerator and denominator by their greatest common divisor, which is 3:\n\n" +
                    "3/6 ÷ 3/3 = 1/2\n\n" +
                    "Therefore, Eoin rode a total of 1/2 kilometer. The answer is 1/2."
        )
        multipleChoiceList.add(que3)

        val que4 = MultipleChoice(
            1,
            "It took Yuan three-fourths of an hour to complete his math homework on monday, seven-sixths on tuesday, and two-thirds of an hour on wednesday. How many hours did he take to complete his homework altogether?",
            "2 4/12",
            "2 5/12",
            "2 6/12",
            "2 7/12",
            4,
            "To find the total time Yuan took to complete his homework, we need to add the times for Monday, Tuesday, and Wednesday.\n\n" +
                    "Time taken on Monday: three-fourths of an hour\n" +
                    "Time taken on Tuesday: seven-sixths of an hour\n" +
                    "Time taken on Wednesday: two-thirds of an hour\n\n" +
                    "Let's add the fractions:\n\n" +
                    "3/4 + 7/6 + 2/3\n\n" +
                    "To add fractions, we need a common denominator. In this case, the least common multiple (LCM) of 4, 6, and 3 is 12. We can convert the fractions to have a denominator of 12:\n\n" +
                    "3/4 = 9/12\n" +
                    "7/6 = 14/12\n" +
                    "2/3 = 8/12\n\n" +
                    "Now we can add:\n\n" +
                    "9/12 + 14/12 + 8/12 = 31/12\n\n" +
                    "The result is 31/12. To express this as a mixed number, we divide the numerator (31) by the denominator (12):\n\n" +
                    "31 ÷ 12 = 2 with a remainder of 7.\n\n" +
                    "Therefore, the answer is 2 7/12. Yuan took a total of 2 7/12 hours to complete his homework."
        )
        multipleChoiceList.add(que4)

        val que5 = MultipleChoice(
            1,
            "Ann added four-fifths of a bag of soil to her garden. Her neighbor Marie added nine-sevenths bags of soil to her garden. How much more soil did Marie add than Ann?",
            "17/35",
            "18/35",
            "19/35",
            "20/35",
            1,
            "To find out how much more soil Marie added than Ann, we need to subtract the amount of soil Ann added from the amount of soil Marie added.\n\n" +
                    "Soil added by Ann: four-fifths of a bag\n" +
                    "Soil added by Marie: nine-sevenths of a bag\n\n" +
                    "Let's subtract the fractions:\n\n" +
                    "9/7 - 4/5\n\n" +
                    "To subtract fractions, we need a common denominator. In this case, the least common multiple (LCM) of 7 and 5 is 35. We can convert the fractions to have a denominator of 35:\n\n" +
                    "9/7 = 45/35\n" +
                    "4/5 = 28/35\n\n" +
                    "Now we can subtract:\n\n" +
                    "45/35 - 28/35 = 17/35\n\n" +
                    "Therefore, Marie added 17/35 more soil than Ann. The answer is 17/35."
        )
        multipleChoiceList.add(que5)

        val que6 = MultipleChoice(
            1,
            "Carlos has two and three-sevenths meters of cloth. He uses one and two-fourths to cover the table. How much meter is he left with?",
            "11/14",
            "13/14",
            "9/14",
            "12/14",
            2,
            "To find out how much cloth Carlos is left with, we need to subtract the amount of cloth he used from the total amount of cloth he had.\n\n" +
                    "Cloth Carlos had: two and three-sevenths meters\n" +
                    "Cloth used to cover the table: one and two-fourths meters\n\n" +
                    "Let's convert the mixed numbers to improper fractions:\n\n" +
                    "Two and three-sevenths meters = (2 * 7 + 3) / 7 = 17/7 meters\n" +
                    "One and two-fourths meters = (1 * 4 + 2) / 4 = 6/4 meters\n\n" +
                    "Now we can subtract the fractions:\n\n" +
                    "17/7 - 6/4\n\n" +
                    "To subtract fractions, we need a common denominator. In this case, the least common multiple (LCM) of 7 and 4 is 28. We can convert the fractions to have a denominator of 28:\n\n" +
                    "17/7 = 68/28\n" +
                    "6/4 = 42/28\n\n" +
                    "Now we can subtract:\n\n" +
                    "68/28 - 42/28 = 26/28\n\n" +
                    "The result is 26/28. To simplify the fraction, we can divide the numerator and denominator by their greatest common divisor, which is 2:\n\n" +
                    "26/28 ÷ 2/2 = 13/14\n\n" +
                    "Therefore, Carlos is left with 13/14 meters of cloth. The answer is 13/14."
        )
        multipleChoiceList.add(que6)

        val que7 = MultipleChoice(
            1,
            "Roel and Riza own a 10-hectare of cornfields. Roel harvested four and one-sixth hectares of corn on friday and Riza harvested two and five-eighths hectares. How many more hectares did Roel harvest than Riza?",
            "3 13/14",
            "4 13/14",
            "1 13/24",
            "2 13/24",
            3,
            "To find out how many more hectares Roel harvested than Riza, we need to subtract the amount of corn harvested by Riza from the amount harvested by Roel.\n\n" +
                    "Corn harvested by Roel: four and one-sixth hectares\n" +
                    "Corn harvested by Riza: two and five-eighths hectares\n\n" +
                    "Let's convert the mixed numbers to improper fractions:\n\n" +
                    "Four and one-sixth hectares = (4 * 6 + 1) / 6 = 25/6 hectares\n" +
                    "Two and five-eighths hectares = (2 * 8 + 5) / 8 = 21/8 hectares\n\n" +
                    "Now we can subtract the fractions:\n\n" +
                    "25/6 - 21/8\n\n" +
                    "To subtract fractions, we need a common denominator. In this case, the least common multiple (LCM) of 6 and 8 is 24. We can convert the fractions to have a denominator of 24:\n\n" +
                    "25/6 = 100/24\n" +
                    "21/8 = 63/24\n\n" +
                    "Now we can subtract:\n\n" +
                    "100/24 - 63/24 = 37/24\n\n" +
                    "The result is 37/24. To express this as a mixed number, we divide the numerator (37) by the denominator (24):\n\n" +
                    "37 ÷ 24 = 1 with a remainder of 13.\n\n" +
                    "Therefore, Roel harvested 1 13/24 hectares more than Riza. The answer is 1 13/24."
        )
        multipleChoiceList.add(que7)

        val que8 = MultipleChoice(
            1,
            "Three scouts brought three pieces of rope of lengths five and three-fourths meters, six and two-thirds meters and five and seven-eighths meters to their camp. How long are the 3 pieces together?",
            "15 7/24",
            "16 7/24",
            "17 7/24",
            "18 7/24",
            4,
            "To find out the total length of the three pieces of rope, we need to add their lengths.\n\n" +
                    "Length of the first rope: five and three-fourths meters\n" +
                    "Length of the second rope: six and two-thirds meters\n" +
                    "Length of the third rope: five and seven-eighths meters\n\n" +
                    "Let's convert the mixed numbers to improper fractions:\n" +
                    "Five and three-fourths meters = (5 * 4 + 3) / 4 = 23/4 meters\n" +
                    "Six and two-thirds meters = (6 * 3 + 2) / 3 = 20/3 meters\n" +
                    "Five and seven-eighths meters = (5 * 8 + 7) / 8 = 47/8 meters\n\n" +
                    "Now we can add the fractions:\n\n" +
                    "23/4 + 20/3 + 47/8\n\n" +
                    "To add fractions, we need a common denominator. In this case, the least common multiple (LCM) of 4, 3, and 8 is 24. We can convert the fractions to have a denominator of 24:\n\n" +
                    "23/4 = 138/24\n" +
                    "20/3 = 160/24\n" +
                    "47/8 = 141/24\n\n" +
                    "Now we can add:\n\n" +
                    "138/24 + 160/24 + 141/24 = 439/24\n\n" +
                    "The result is 439/24. To express this as a mixed number, we divide the numerator (439) by the denominator (24):\n\n" +
                    "439 ÷ 24 = 18 with a remainder of 7.\n\n" +
                    "Therefore, the total length of the three pieces of rope is 18 7/24 meters. The answer is 18 7/24"
        )
        multipleChoiceList.add(que8)

        val que9 = MultipleChoice(
            1,
            "Mary found one-half of a pie on the plate. He ate one-half of it. What fraction of the whole pie was left? ",
            "1/3",
            "1/4",
            "1/5",
            "1/6",
            2,
            "Mary found one-half of a pie on the plate. If she ate one-half of it, we can calculate the fraction of the whole pie that was left.\n\n" +
                    "Let's start with the fraction Mary found, which is one-half (1/2) of the whole pie.\n\n" +
                    "Next, she ate one-half (1/2) of the fraction she found.\n\n" +
                    "To find the fraction that was left, we can multiply the two fractions:\n\n" +
                    "1/2 * 1/2 = 1/4\n\n" +
                    "Therefore, one-fourth (1/4) of the whole pie was left after Mary ate one-half of the fraction she found. The answer is 1/4"
        )
        multipleChoiceList.add(que9)

        val que10 = MultipleChoice(
            1,
            "A box contains five and two-thirds cups of rice. If three-fourths of the rice will be used, how many cups of rice remained in the box?",
            "4 11/12",
            "3 11/12",
            "2 11/12",
            "1 11/12",
            1,
            "The box contains five and two-thirds cups of rice. If three-fourths of the rice will be used, we can calculate how many cups of rice remained in the box.\n\n" +
                    "First, let's convert the mixed number to an improper fraction:\n\n" +
                    "Five and two-thirds cups of rice = (5 * 3 + 2) / 3 = 17/3 cups\n\n" +
                    "Next, we need to find three-fourths of 17/3 cups. To do this, we multiply the fraction by three-fourths:\n\n" +
                    "(17/3) * (3/4) = (17 * 3) / (3 * 4) = 51/12 cups\n\n" +
                    "Now, we can subtract the result from the original amount to find how much rice remained in the box:\n\n" +
                    "17/3 - 51/12\n\n" +
                    "To subtract fractions, we need a common denominator. In this case, the least common multiple (LCM) of 3 and 12 is 12. We can convert the fractions to have a denominator of 12:\n\n" +
                    "17/3 = 68/12\n" +
                    "51/12 = 51/12\n\n" +
                    "Now we can subtract:\n\n" +
                    "68/12 - 51/12 = 17/12\n\n" +
                    "The result is 17/12. To express this as a mixed number, we divide the numerator (17) by the denominator (12):\n\n" +
                    "17 ÷ 12 = 1 with a remainder of 5.\n\n" +
                    "Therefore, there are 1 5/12 cups of rice remaining in the box. The correct answer is option d. 1 5/12."
        )
        multipleChoiceList.add(que10)

        val que11 = MultipleChoice(
            1,
            "Yael walked one-half of a kilometer yesterday and three-fourths of a kilometer today. How many miles has Yael walked?",
            "1 1/4",
            "0.7767",
            "3 1/3",
            "2 1/2",
            2,
            "To convert kilometers to miles, we can use the conversion factor of 0.621371 miles per kilometer.\n\n" +
                    "Yael walked one-half of a kilometer yesterday, which is equal to:\n\n" +
                    "(1/2) kilometer * 0.621371 miles/kilometer = 0.3106855 miles.\n\n" +
                    "Yael walked three-fourths of a kilometer today, which is equal to:\n\n" +
                    "(3/4) kilometer * 0.621371 miles/kilometer = 0.46602825 miles.\n\n" +
                    "To find the total distance Yael walked, we add the distances from yesterday and today:\n\n" +
                    "0.3106855 miles + 0.46602825 miles = 0.77671375 miles.\n\n" +
                    "Therefore, Yael has walked approximately 0.7767 miles."
        )
        multipleChoiceList.add(que11)

        val que12 = MultipleChoice(
            1,
            "Mother bought three and one-third dozen apples. She served three-fourths of the apples to Rico’s friends. How many apples remained?",
            "3 3/12",
            "2 7/12",
            "5/6",
            "4 4/12",
            3,
            "First, we convert the whole number to a fraction by multiplying it by the denominator of the fraction and adding the numerator.\n\n" +
                    "3 * 3 = 9\n" +
                    "9 + 1 = 10\n\n" +
                    "So, \"three and one-third\" can be written as the improper fraction 10/3.\n\n" +
                    "Next, we need to find three-fourths of the apples, which means multiplying the total number of apples by 3/4.\n\n" +
                    "10/3 * 3/4 = (10 * 3) / (3 * 4) = 30/12 = 2 6/12\n\n" +
                    "To simplify the fraction, we can reduce it by dividing both the numerator and the denominator by their greatest common divisor, which is 6.\n\n" +
                    "2 6/12 = 2 (6/6) / (12/6) = 2 (1/2) = 2 1/2\n\n" +
                    "So, three-fourths of the apples is equal to 2 1/2 apples.\n\n" +
                    "To find out how many apples remained, we subtract the quantity served from the total quantity:\n" +
                    "10/3 - 2 1/2 = (10/3) - (5/2)\n\n" +
                    "To subtract fractions, we need a common denominator. In this case, the common denominator is 6.\n" +
                    "10/3 = 20/6\n" +
                    "5/2 = 15/6\n\n" +
                    "Now we can subtract the fractions:\n" +
                    "20/6 - 15/6 = (20 - 15)/6 = 5/6\n\n" +
                    "Therefore, the number of apples that remained is 5/6 of a dozen or approximately 0.83 dozen."
        )
        multipleChoiceList.add(que12)

        val que13 = MultipleChoice(
            1,
            "A bulldozer weighed 325 tons. If it scooped up 558 tons of sand, what would be the combined weight of the bulldozer and the sand?",
            "9 3/40 tons",
            "9 7/40 tons",
            "8 1/40 tons",
            "883 tons",
            4,
            "Given:\n" +
                    "Weight of the bulldozer = 325 tons\n" +
                    "Weight of the scooped sand = 558 tons\n\n" +
                    "To find the combined weight, we need to add the weights together:\n\n" +
                    "Step 1: Add the tons of the bulldozer and the scooped sand:\n" +
                    "325 tons + 558 tons = 883 tons\n\n" +
                    "Therefore, the combined weight of the bulldozer and the sand is 883 tons."
        )
        multipleChoiceList.add(que13)

        val que14 = MultipleChoice(
            1,
            "A regular size chocolate bar was 738 inches long. If the king size bar was 537 inches longer, what is the length of the king size bar? ",
            "12 45/56 inches",
            "1275 inches",
            "13 45/56 inches",
            "12 47/56 inches",
            2,
            "Given:\n" +
                    "Length of the regular size bar = 738 inches\n" +
                    "Additional length for the king size bar = 537 inches\n\n" +
                    "To find the length of the king size bar:\n\n" +
                    "Step 1: Add the additional length to the regular size bar:\n" +
                    "738 inches + 537 inches = 1275 inches\n\n" +
                    "Therefore, the length of the king size chocolate bar is 1275 inches."
        )
        multipleChoiceList.add(que14)

        val que15 = MultipleChoice(
            1,
            "Sarah's recycled 923 boxes of paper in a month. If she recycled another 649 boxes the next month, what was the total amount she recycled?",
            "1572 boxes",
            "16 1/9 boxes",
            "14 4/9 boxes",
            "16 5/9 boxes",
            1,
            "Given:\n" +
                    "Boxes recycled in the first month = 923 boxes\n" +
                    "Boxes recycled in the second month = 649 boxes\n\n" +
                    "To find the total amount of boxes recycled:\n\n" +
                    "Step 1: Add the number of boxes from each month:\n" +
                    "923 boxes + 649 boxes = 1572 boxes\n\n" +
                    "Therefore, the total amount of boxes Sarah recycled is 1572 boxes."
        )
        multipleChoiceList.add(que15)

        return multipleChoiceList
    }
}
