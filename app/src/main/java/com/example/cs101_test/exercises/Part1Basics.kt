package com.example.cs101_test.exercises

object Part1Basics {
    // ---------------------- EXERCISE 1
    // Declare a mutable variable called 'temperature' of type Int and assign it a value of 25.
    var temperature:Int = 25

    // ---------------------- EXERCISE 2
    // Declare an immutable variable called 'greeting' of type String and assign it a value of "Hello, Kotlin!".
    val greeting:String = "Hello, Kotlin!"

    // ---------------------- EXERCISE 3
    // Print on separate lines the variables from exercise 1 and 2.
    fun printVariables() {
        println(temperature)
        println(greeting)
    }

    // ---------------------- EXERCISE 4
    // Complete the function to convert a string to uppercase and return it.
    fun convertToUpperCase(input: String): String {
        val reformedString:String = input.toUpperCase()
        return reformedString
    }

    // ---------------------- EXERCISE 5
    // Write a function to check if a number is even or odd and return true if even and false if odd.
    fun isEven(number: Int): Boolean {
        var result:Boolean = false

        if (number % 2 == 0) {
            result = true
        }
        return result
    }

    // ---------------------- EXERCISE 6
    // Create a function to find the second largest number in a list.
    fun secondLargest(list: List<Int>): Int {
        var secondHighestValue:Int = 0
        var highestValue:Int = 0
        for (i in 0 until list.size) {
            if (list[i]>highestValue) {
                secondHighestValue = highestValue
                highestValue = list[i]
            } else if (secondHighestValue < list[i]) {
                secondHighestValue = list[i]
            }
        }
        return secondHighestValue
    }

    // ---------------------- EXERCISE 7
    // Create a function that takes a name as a parameter and returns "Hello, <name>!".
    fun greetUser(name: String): String {
        val greeting:String = "Hello, $name!"
        return greeting
    }

    // ---------------------- EXERCISE 8
    // Create a function to find the maximum value in a list.
    fun findMax(numbers: List<Int>): Int {
        val maximumNumber: Int = numbers.max()
        return maximumNumber
    }

    // ---------------------- EXERCISE 9
    // Create a function to get the value for a given key from a map.
    fun getValue(map: Map<String, Int>, key: String): Int? {
        val value = getValue(map, key)
        return value
    }

    // ---------------------- EXERCISE 10
    // Create a function that calculates the area of a rectangle given its length and width.
    fun calculateArea(length: Double, width: Double): Double {
        return length*width
    }

    // ---------------------- EXERCISE 11
    // Create a function that checks if a number is positive and returns a boolean. 0 is not positive.
    fun isPositive(number: Int): Boolean {
        var result:Boolean = false
        if (number >= 0) {
            result = true
        }
        return result
    }

    // ---------------------- EXERCISE 12
    // Create a function to calculate the average of an array of doubles.
    fun calculateAverage(numbers: Array<Double>): Double {
        var average:Double = 0.0
        for (i in 0 until numbers.size) {
            average += numbers[i]
        }
        return average/numbers.size
    }

    // ---------------------- EXERCISE 13
    // Create a function that filters out negative numbers from a list.
    fun filterNegativeNumbers(numbers: List<Int>): List<Int> {
        val newList:MutableList<Int> = mutableListOf()
        for (i in 0 until numbers.size) {
            if (numbers[i] >= 0) {
                newList.add(numbers[i])
            }
        }
        return newList
    }

    // ---------------------- EXERCISE 14
    // Create a function that returns a map of characters to their frequency in a string.
    // Ignore numbers, punctuation and all that is not a character A-Z or a-z.
    // Example:
    //      Input: "hello, world"
    //      Expected Output: {h=1, e=1, l=3, o=2, w=1, r=1, d=1}
    fun charFrequency(str: String): Map<Char, Int> {
        val result = mutableMapOf<Char, Int>()
        str.forEach { char ->
            if (char.isLetter()) {
                val lowercaseChar = char.lowercaseChar()
                result[lowercaseChar] = result.getOrDefault(lowercaseChar, 0) + 1
            }
        }
        return result
    }
}
