package collections

fun main(args: Array<String>) {
// List //////////
    /*
    - An ordered collection.
    - Elements can be accessed by index (0-indexed).
    - Can contain duplicate elements.
    - Immutable. Values cannot be added, removed or changed.

    Example: A collection of words that, in order, form a sentence.
    Order matters, can contian duplicate words.
     */

    val beatles = listOf("John", "George", "Ringo", "Paul")
    println(beatles)

    // A list can be empty;
    // however if it is, you must define the type of its elements (even though there are none!).
    val emptyList = listOf<String>()
    println(emptyList)

    // A list can contain null values.
    val spectrum = listOf(null, "black", "brown", "lightblue", "pink", "red", "yellow", "green", "turquoise", "indigo", "violet", null)
    println(spectrum)

    // Access values in a list by indexing [x] or using get(x).
    println(spectrum[2])
    println(spectrum.get(4))

    // size method returns the length of the list
    println(spectrum.size)
}