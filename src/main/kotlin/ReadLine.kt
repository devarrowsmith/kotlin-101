import java.time.Year

fun main(args: Array<String>) {
    println("What is your name? Please type it in.")

    val userName = readLine()?:"nameless person"

    println("Good morning $userName. My name is Friend Computer.")

    println("I can do mathematics.")
    println("Please enter an integer. I will square it.")

    val userInteger = (readLine()?:"0").toInt()
    val squareOfUserInteger = userInteger * userInteger

    // In the templates below, type coercion converts squareOfUserInteger to a string
    println("You entered $userInteger.")
    println("$userInteger squared is $squareOfUserInteger.")

    println("In what year were you born?")

    val userBirthYear = (readLine()?:"0").toInt()
    val userApproximateAge = Year.now().value - userBirthYear.toInt()

    println("You entered $userBirthYear.")
    println("That means you are approximately $userApproximateAge years old.")
}