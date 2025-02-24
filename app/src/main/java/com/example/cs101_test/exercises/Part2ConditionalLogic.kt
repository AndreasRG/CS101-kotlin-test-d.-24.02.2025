package com.example.cs101_test.exercises

object Part2ConditionalLogic {
    // ---------------------- EXERCISE 1
    // Create a function that takes an integer as a parameter and returns "Positive", "Negative", or "Zero".
    fun checkNumber(number: Int): String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }

    // ---------------------- EXERCISE 2
    // Create a function that takes a string and prints each character on a new line.
    fun printChars(input: String) {
        for (i in 0 until input.length) {
            println(input[i])
        }
    }

    // ---------------------- EXERCISE 3
    // Create a function that takes an integer and returns the sum of its digits.
    // For example if input is 45 then output should be 9 (4+5)
    fun sumDigits(number: Int): Int {
        var sum = 0
        var num = Math.abs(number)
        while (num != 0) {
            sum += num % 10
            num /= 10
        }
        return sum
    }

    // ---------------------- EXERCISE 4
    // Create a function that takes a list of integers and returns a new list with only the odd numbers.
    // For example if input is (1,2,3,4,5) then output should be (1,3,5)
    fun filterOddNumbers(numbers: List<Int>): List<Int> {
        val newList:MutableList<Int> = mutableListOf()
        for (i in 0 until numbers.size) {
            if (numbers[i] % 2 != 0) {
                newList.add(numbers[i])
            }
        }
        return newList
    }

    // ---------------------- EXERCISE 5
    // Create a function that takes a list of strings and returns a new list with all strings in lowercase.
    fun transformToLowercase(strings: List<String>): List<String> {
        val newList:MutableList<String> = mutableListOf()
        for (i in 0 until strings.size) {
            newList.add(strings[i].toLowerCase())
        }
        return newList.toList()
    }

    // ---------------------- EXERCISE 6
    // Create a function that prints numbers from 1 to 10 with println(), but skips multiples of 3 using a loop.
    // Expected output: "1", "2", "4", "5", "7", "8", "10"
    fun printNumbersSkipMultiplesOf3() {
        for (i in 1..10) {
            if (i % 3 != 0) {
                println(i)
            }
        }
    }

    // ---------------------- EXERCISE 7
    // Create a function that takes a string and returns true if it is a palindrome, false otherwise.
    // Palindrome: a word, phrase, or sequence that reads the same backwards as forwards, e.g. "madam" or "nurses run".
    // White spaces should be ignored.
    fun isPalindrome(input: String): Boolean {
        val sanitizedInput = input.replace("\\s".toRegex(), "").lowercase()
        return sanitizedInput == sanitizedInput.reversed()
    }

    // ---------------------- EXERCISE 8
    // Modify the function to have default values for both width and height and to return the area of the rectangle.
    // Example of a function with a default value "world": fun greet(name: String = "world") {}
    fun calculateArea(width: Int = 3, height: Int = 2): Int {
        return width*height
    }

    // ---------------------- EXERCISE 9
    // Create a function that takes a day of the week as a string and returns "Weekday" or "Weekend".
    // Make sure it handles both uppercase and lowercase letters.
    // Acceptable days: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    // If the day does not exist, return "Invalid day".
    fun dayType(day: String): String {
        return when (day) {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday"
            "Saturday", "Sunday" -> "Weekend"
            else -> "INVALID INPUT; please use format first letter uppercase and rest lowercase"
        }
    }

    // ---------------------- EXERCISE 10
    // Create a function that takes an integer year and returns true if it is a leap year, false otherwise.
    // Leap year requirements:
    //      Dividing the year by 4 must result in a whole number with no remainder (no decimals)
    //      If dividing the year by 100 result in a whole number, it must also result in a whole number when dividing by 400
    // Examples: 2024 is a leap year, and 2023 is not
    fun isLeapYear(year: Int): Boolean {
        return when {
            year % 400 == 0 -> true
            year % 100 == 0 -> false
            year % 4 == 0 -> true
            else -> false
        }
    }

    // ---------------------- EXERCISE 11
    // Create a function that takes a list of integers and a lambda function, and returns
    // a new list with the results of applying the lambda to each element.
    // Example:
    //      val numbers = listOf(1, 2, 3, 4, 5)
    //      val result = applyLambda(numbers) { it * 2 }
    //      Should return: [2, 4, 6, 8, 10]
    fun applyLambda(numbers: List<Int>, lambda: (Int) -> Int): List<Int> {
        return numbers.map(lambda)
    }
}
