fun main(args: Array<String>) {
    println("What is your name? Please type it in.")

    val userName = readLine()?:"nameless person"

    println("Good morning $userName. My name is Friend Computer.")

    println("I can do mathematics.")
    println("Please enter an integer. I will square it.")

    val userInteger = readLine()?:"0"
    val squareOfUserInteger = userInteger.toInt() * userInteger.toInt()

    println("You entered $userInteger.")

    // In the template below, type coercion converts squareOfUserInteger to a string
    println("$userInteger squared is $squareOfUserInteger.")

}