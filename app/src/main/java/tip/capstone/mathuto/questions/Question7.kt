package tip.capstone.mathuto.questions

import tip.capstone.mathuto.sqlite.MultipleChoice

object Question7 {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"
    const val WRONG_ANS: String = "wrong_answers"
    const val UNANSWERED_QUESTIONS: String = "unanswered_questions"
    const val SELECTED_ANSWERS: String = "selected_answers"

    fun getQuestions(): ArrayList<MultipleChoice>{

        val questionList = ArrayList<MultipleChoice>()

        val que1 = MultipleChoice(
            1,
            "Can be defined as a whole number whose fractional part is separated by a decimal value.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            1,
            "A decimal number is a numerical representation that includes a whole number part and a fractional part separated by a decimal point. The fractional part of a decimal number is expressed using place value, where each digit to the right of the decimal point represents a decreasing power of 10.\n\n" +
                    "For example, in the decimal number 3.14, the whole number part is 3, and the fractional part is .14. The digit 1 is in the tenths place (1/10), and the digit 4 is in the hundredths place (4/100).\n\n" +
                    "So, when we talk about a whole number whose fractional part is separated by a decimal value, we are referring to a decimal number where the whole number part is separated from the fractional part by a decimal point."
        )
        questionList.add(que1)

        val que2 = MultipleChoice(
            1,
            "This is the value of where a digit is in a decimal number.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            2,
            "Place value refers to the value or position of a digit within a number, which determines its significance in representing the quantity. In a decimal number, each digit's place value is based on powers of 10.\n\n" +
                    "For example, let's consider the decimal number 245.73. Each digit in this number has a specific place value:\n\n" +
                    "The digit 2 is in the hundreds place, representing 2 × 10^2 (or 200).\n" +
                    "The digit 4 is in the tens place, representing 4 × 10^1 (or 40).\n" +
                    "The digit 5 is in the ones place, representing 5 × 10^0 (or 5).\n" +
                    "The digit 7 is in the tenths place, representing 7 × 10^(-1) (or 0.7).\n" +
                    "The digit 3 is in the hundredths place, representing 3 × 10^(-2) (or 0.03).\n\n" +
                    "So, place value helps us understand the significance of each digit in a decimal number and enables us to express the value of the number accurately."
        )
        questionList.add(que2)

        val que3 = MultipleChoice(
            1,
            "The decimal point show a value smaller than one.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            3,
            "The decimal point shows a value smaller than one refers to the concept of decimal fractions, not whole numbers.\n\n" +
                    "A whole number is an integer that does not have a fractional or decimal part. It consists of all the natural numbers (positive integers) and their additive inverses (negative integers), including zero.\n\n" +
                    "In contrast, decimal fractions represent values smaller than one, and they are expressed using a decimal point to separate the whole number part from the fractional part.\n\n" +
                    "So, in this case, the correct answer is indeed Whole Number."
        )
        questionList.add(que3)

        val que4 = MultipleChoice(
            1,
            "The usual way to write a decimal.",
            "Decimal",
            "Place Value",
            "Whole Number",
            "Standard Form",
            4,
            "The correct answer is Standard Form.\n\n" +
                    "Standard form refers to the usual or standard way of writing a decimal number. It is typically written as a whole number followed by a decimal point and then the fractional part. For example, 3.14 is the standard form of the decimal number representing pi.\n\n" +
                    "Decimal is the general term used to describe numbers that include a decimal point and fractional part.\n\n" +
                    "Place Value refers to the value assigned to a digit based on its position in a number.\n\n" +
                    "Whole Number refers to a number without any fractional or decimal part."
        )
        questionList.add(que4)

        val que5 = MultipleChoice(
            1,
            "Writing the decimals in words, such as four and two tenths.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            1,
            "The correct answer is \"Word Form.\"\n\n" +
                    "When writing decimals in words, we use the word form to represent the decimal value. For example, the decimal 4.2 would be written as \"four and two tenths\" in word form. It helps to express the value of the decimal in words, making it easier to understand and read.\n\n" +
                    "Therefore, \"Word Form\" is the appropriate term for writing decimals in words, such as expressing 4.2 as \"four and two tenths.\""
        )
        questionList.add(que5)

        val que6 = MultipleChoice(
            1,
            "A decimal point is read as.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            2,
            "The answer is \"and\".\n\n" +
                    "When reading a decimal number aloud, the word \"and\" is used to indicate the decimal point. For example, the decimal number 3.14 is read as \"three and fourteen hundredths.\""

        )
        questionList.add(que6)

        val que7 = MultipleChoice(
            1,
            "That numbers have the same length or decimal places.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            3,
            "The correct answer is \"Zeros.\"\n\n" +
                    "In the context of decimals, zeros are used as placeholders to hold a position in a number. They do not change the value of the number but help indicate the magnitude and precision of the digits. Zeros can appear before significant digits (leading zeros), between significant digits (interior zeros), or after significant digits (trailing zeros).\n\n" +
                    "For example, in the number 0.025, the zero before the decimal point is a leading zero, and the zeros after the decimal point are trailing zeros. These zeros help determine the decimal's place value and maintain the intended precision of the number."
        )
        questionList.add(que7)

        val que8 = MultipleChoice(
            1,
            "Numbers should be written in and align the decimal points.",
            "Word Form",
            "\"and\"",
            "Zeros",
            "Column",
            4,
            "The correct answer is \"Column.\"\n\n" +
                    "When writing numbers in decimal form, it is important to align the decimal points to maintain the correct place value of each digit. This is often done by using columns. Each digit occupies a specific column based on its place value, such as ones, tenths, hundredths, and so on. The decimal point is aligned vertically, ensuring that corresponding place values are stacked on top of each other.\n\n" +
                    "For example:\n" +
                    "12.345\n\n" +
                    "3.67\n" +
                    "16.015\n\n" +
                    "By aligning the decimal points, we can easily perform addition, subtraction, multiplication, or division operations while maintaining the accuracy of the decimal values."
        )
        questionList.add(que8)

        val que9 = MultipleChoice(
            1,
            "In adding or subtracting decimals, we have to start from the?.",
            "Right",
            "Ten Thousand",
            "Zeros",
            "Column",
            1,
            "In adding or subtracting decimals, we have to start from the right.\n\n" +
                    "When adding or subtracting decimals, it is important to align the decimal points. Once the decimal points are aligned, we start from the rightmost column (also known as the ones column) and proceed to the left, carrying over any values as needed. By starting from the right, we ensure that the place values are properly accounted for and the calculation is performed accurately.\n\n" +
                    "For example:\n" +
                    "12.34\n\n" +
                    "5.67\n" +
                    "18.01\n\n" +
                    "In this addition example, we start from the rightmost column (the ones column) and move to the left, adding the corresponding digits in each column."
        )
        questionList.add(que9)

        val que10 = MultipleChoice(
            1,
            "In the decimal number, 24.5678, the number 5 is in the tenths place and number 8 is in the what place.",
            "Right",
            "Ten Thousand",
            "Zeros",
            "Column",
            2,
            "In the decimal number 24.5678, the number 5 is indeed in the ten-thousandths place, and the number 8 is in the thousandths place. The ten-thousandths place is four positions to the right of the decimal point, and the thousandths place is three positions to the right. Therefore, the correct answer is \"b. Ten Thousand.\""
        )
        questionList.add(que10)

        return questionList
    }
}