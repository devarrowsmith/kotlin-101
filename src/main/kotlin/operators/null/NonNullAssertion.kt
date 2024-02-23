package operators.`null`

fun main(args: Array<String>) {

    /*
    NB: THIS OPERATOR HAS VERY FEW USEFUL APPLICATIONS.
    IF MISUSED IT CAN EASILY CAUSE CRASH.
    DO NOT USE UNLESS YOU REALLY KNOW WHAT YOU'RE DOING.

    !!. is the Non-null assertion.
    It is guarantee from the developer that the variable is not null.
    It bypasses all language checks for null safety.
    If the variable does turn out to be null, the system will crash.
    Avoid it as much as you can.
     */

    // If this isrun, the program errors (it actually returns null):
        val catName: String? = null
        println(catName?.length)

    // If this is run, the program crashes with a NullPointerException.
    // println will still be attempted, but as catName is null, it can't be evaluated.
        val dogName: String? = null
        println(dogName!!.length)
}