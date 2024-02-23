package operators

fun main(args: Array<String>) {

    // For nullable variables we can’t use the basic math operators. They expect a value.

    // Instead we can use special Kotlin methods for nullable variables. They will return a value when applied to a value; or ‘null’ when applied to null.

    val a:Int? = 10
    val b:Int? = null

    println("Plus")
    val valueAddition = a?.plus(3)
    println(valueAddition)
    val nullAddition = b?.plus(3)
    println(nullAddition)

    println("Minus")
    val valueSubtraction = a?.minus(3)
    println(valueSubtraction)
    val nullSubtraction = b?.minus(3)
    println(nullSubtraction)

    println("Multiply")
    val valueTimes= a?.times(5)
    println(valueTimes)
    val nullTimes = b?.times(5)
    println(nullTimes)

    println("Divide")
    val valueDivide = a?.div(5)
    println(valueDivide)
    val nullDivide = b?.div(5)
    println(nullDivide)

    println("Modulo")
    val valueModulo = a?.rem(7)
    println(valueModulo)
    val nullModulo = b?.rem(7)
    println(nullModulo)

    // Be wary of type / overflow when numerical ranges increase.

}