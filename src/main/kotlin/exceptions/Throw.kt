package exceptions

fun main(args: Array<String>) {
    // Throw //////////

    /*
    Using throw, we can generate our own exceptions when a condition of our choosing occurs.

    For example, we may feel that in a certain situation the code cannot continue and an error should be generated,
    but it isn't an error that the system will automatically detect.

    We can create a throw, that raises an exception in this circumstance.

    This is usually used to communicate with other developers or other levels of the program, not the user.
    So the example below is a bit trivial!
     */

    println("Please enter a word.")
    var test = readLine()
    throw IllegalStateException("I don't like this word. Goodbye.")


}