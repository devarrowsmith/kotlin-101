fun main(args: Array<String>) {

    // Nullability //////////

    /*
    Nullability is a programming language concept.
    It is the ability of a variable to have a null value.

    Null values are a big problem, because a program can't perform any operations on a null value.

    It has no memory allocation; in effect, it does not exist. So nothing can be done to it.

    This causes errors, when functionality expecting a value receives a null and therefore cannot proceed (errors, crashes).

    This type of error is called a Null Pointer Exception.
     */


    // Kotlin guards against null values //////////

    /*
    Kotlin doesn't allow null values to be accessed (null pointer exceptions cannot be caused), -unless- you explicitly and intentionally tell it to (which can be used for testing).
     */


    // Nullable Variables //////////

    // By default a variable with null value will cause a compilation error.
    // However we can give a variable a type that permits null values. It is a nullable variable.

    // A variable can be assigned a type.
    var captain: String = "Picard"

    // This variable can only take a string.
    // What if the var can also be null at times?
    // We can use the null type operator to permit this.
    var securityOfficer: String? = null
    println(securityOfficer) // prints "null"
    securityOfficer = "Worf"
    println(securityOfficer) // prints "Worf"
}