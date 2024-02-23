package operators

fun main(args: Array<String>) {

    // +:   Concatenate
    // Concatenates strings into a new string

    val message = "Hi"
    val whitespace = " "
    val name = "Stefano"
    val exclamation = "!"

    println(message + whitespace + name + exclamation)


    // $:  Reference
    // Use $ within a string to insert a variable.
    // "I have $numberOfCats cats."

    val numberOfCats = 2
    val myFirstCatName = "Boris"
    val mySecondCatName = "Scarlett"

    println("I have $numberOfCats cats, $myFirstCatName and $mySecondCatName")


    // ${}: Reference Expression
    // Used to insert functionality into a string.

    val numberOfKittens = 14
    val numberOfAdoptees = 12

    println("I currently have $numberOfCats cats. However $mySecondCatName is going to have $numberOfKittens kittens, so soon I will have ${numberOfCats + numberOfKittens} cats. $numberOfAdoptees are going to be adopted, after which I will have ${numberOfCats + numberOfKittens - numberOfAdoptees} cats.")
}