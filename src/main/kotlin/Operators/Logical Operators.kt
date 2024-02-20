package Operators

fun main(args: Array<String>) {
    /*

    NB: Kotlin does not coerce 'truthy' and 'falsey' values to booleans (unlike JS).
    As such, these logic operators take booleans, and do not accept other types.

    &&      And
    ||      Or
    >       Greater than
    >=      Greater or equal
    <       Less than
    <=      Less or equal
    ==      Values is equal to
    !=      Value is not equal to
    !       Not: Inverts a boolean.
     */

    // Exercise //////////
    /*
    A farmer has 3 cows.
    One of these cows produces milk.
    He has two children

    He is trying to apply for funding. The requirements are:

    - You must have no more than 5 animals
    - Collectively the animals must produce something that can be sold
    - Regardless of the other conditions, funding will be approved if the family has 3 or more members

    Does the farmer receive the funding?
     */

    val cows:Int = 3
    val milkProducingCows:Int = 1
    val familySize = 3

    val noMoreThanFiveAnimals = cows <= 5
    val animalProducesRetailProduct = milkProducingCows > 0
    val familyHasThreeOrMoreMembers = familySize >= 3

    val eligibleForFunding = (noMoreThanFiveAnimals && animalProducesRetailProduct) || familyHasThreeOrMoreMembers
    println(eligibleForFunding)
}