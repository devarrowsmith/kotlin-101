package operators.`null`

fun main(args: Array<String>) {

    // Elvis operator
    // Conditional. Ternary.
    // Evaluates a variable. If the variable is non-null, it will be used. Otherwise, a defined default value will be used instead.
    // Allows us to create a 'safe' statement that will not return a null

    var numberOfEggs: String? = null
    fun eggsStatement(): String {
        return "There are ${numberOfEggs ?: "no"} eggs."
    }
    println(eggsStatement()) // There are no eggs

    numberOfEggs = "twelve"
    println(eggsStatement()) // There are twelve eggs
}
