package Operators

fun main(args: Array<String>) {

    // =   Assignment operator
    val dozen = 12

    // $    Reference operator
    val farmerStatement = "I sell boxes of $dozen eggs."
    println(farmerStatement)

    // Reference expression operator
    val bakerStatement = "I will bake ${dozen + 1} buns."
    println(bakerStatement)

    // Augmented assignment operators

    var bikes = 2
    println(bikes)  // =2
    bikes += 3
    println(bikes)  // =5
    bikes -= 1
    println(bikes)  // =4
    bikes *= 3
    println(bikes)  // =12
    bikes /= 4
    println(bikes)  // =3
    bikes %= 2
    println(bikes)  // =1

    // NB: Remember to consider number type when doing arithmetic.
    // If a variable is of a given type,
    // and an assignment operator produces a different type (eg. a float)
    // then an error will occur
}
