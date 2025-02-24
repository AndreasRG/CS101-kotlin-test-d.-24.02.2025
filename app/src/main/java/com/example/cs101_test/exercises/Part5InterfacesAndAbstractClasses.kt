package com.example.cs101_test.exercises

object Part5InterfacesAndAbstractClasses {

    // ---------------------- EXERCISE 1
    // Create an abstract class called MediaContent with 4 properties: title, releaseYear, genre, and rating
    // Add an abstract method: playContent() that needs to be implemented by subclasses
    // Create 3 classes (Movie, Series, and Documentary) that extend the MediaContent class
    //   - Movie class should have an additional property: director
    //   - Series class should have an additional property: seasons
    //   - Documentary class should have an additional property: subject
    // Each subclass should override the playContent() method to print a message specific to its type
    abstract class MediaContent constructor(
        var title:String,
        var releaseYear:Int,
        var genre:String,
        var rating:Double
    ) {
        abstract fun playContent()
    }

    class Movie constructor(title:String, releaseYear:Int, genre:String, rating:Double, var director:String) : MediaContent(title, releaseYear, genre, rating) {
        override fun playContent() {
            println("Playing movie '$title' directed by $director.")
        }
    }
    class Series constructor(title:String, releaseYear:Int, genre:String, rating:Double, var seasons:Int) : MediaContent(title, releaseYear, genre, rating) {
        override fun playContent() {
            println("Playing series '$title' with $seasons seasons.")
        }
    }
    class Documentary constructor(title:String, releaseYear:Int, genre:String, rating:Double, var subject:String) : MediaContent(title, releaseYear, genre, rating) {
        override fun playContent() {
            println("Playing documentary '$title' on the subject of $subject.")
        }
    }

    // ---------------------- EXERCISE 2
    // Create an interface called Account with 3 properties: accountNumber, accountHolder, and balance (Double)
    // Add methods: deposit(amount: Double), withdraw(amount: Double), and checkBalance() that need to be implemented by classes
    //      checkBalance should return a Double
    // Create 3 classes (SavingsAccount, CurrentAccount, and BusinessAccount) that implement the Account interface
    //   - SavingsAccount should have an additional property: interestRate
    //   - CurrentAccount should have an additional property: overdraftLimit
    //   - BusinessAccount should have an additional property: businessName
    // Each class should implement the methods to manage deposits and withdrawals with specific rules for each account type
    //      This means that for the CurrentAccount class, the withdraw function will be successful as long as
    //          the amount is less than or equal to the sum of the balance and overdraftLimit
    //      Should you try to withdraw more money than allowed, it should print: "Insufficient funds"
    interface Account {
        var accountNumber:String
        var accountHolder:String
        var balance:Double

        fun deposit(amount:Double)
        fun withdraw(amount:Double)
        fun checkBalance():Double
    }

    class SavingsAccount(
        override var accountNumber:String,
        override var accountHolder:String,
        override var balance:Double,
        var interestRate:Double
    ) :Account {
        override fun deposit(amount:Double) {
            balance += amount
        }

        override fun withdraw(amount:Double) {
            if (balance >= amount) {
                balance -= amount
            } else {
                println("Insufficient funds")
            }
        }

        override fun checkBalance():Double {
            return balance
        }
    }

    class CurrentAccount(
        override var accountNumber:String,
        override var accountHolder:String,
        override var balance:Double,
        var overdraftLimit:Double
    ) : Account {
        override fun deposit(amount:Double) {
            balance += amount
        }

        override fun withdraw(amount:Double) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount
            } else {
                println("Insufficient funds")
            }
        }

        override fun checkBalance():Double {
            return balance
        }
    }

    class BusinessAccount(
        override var accountNumber:String,
        override var accountHolder:String,
        override var balance:Double,
        var businessName:String
    ) : Account {
        override fun deposit(amount:Double) {
            balance += amount
        }

        override fun withdraw(amount:Double) {
            if (balance >= amount) {
                balance -= amount
            } else {
                println("Insufficient funds")
            }
        }

        override fun checkBalance():Double {
            return balance
        }
    }

}
