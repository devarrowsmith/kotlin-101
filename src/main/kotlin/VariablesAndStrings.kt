// Strings & variables

// const: Top-level variables that are immutable & are not calculated at runtime.
const val BEST_DINOSAUR = "Triceratpos"
fun main(args: Array<String>) {

    //var: Mutable, can be reassigned. Type can't change.
    var name = "Dave"
    println(name)
    name = "David"
    println(name)

    // val: Immutable, can't be reassigned.
    val catName = "My cat's name is \"Boris\"."
    println(catName)

    val bunnyLineOne = "(\\(\\"
    val bunnyLineTwo = "(=.=)"
    val bunnyLineThree = "o_(\")(\")"
    println(bunnyLineOne)
    println(bunnyLineTwo)
    println(bunnyLineThree)

    println(BEST_DINOSAUR)
}

