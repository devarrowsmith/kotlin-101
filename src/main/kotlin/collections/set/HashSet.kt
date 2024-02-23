package collections.set

fun main(args: Array<String>) {

    // HashSet //////////

    // A HashSet is a mutable Set
    val magicCards = hashSetOf("Path to Exile", "Swords to Ploughshares", "Banishing Blade", "Wanderer's Strike")
    println(magicCards)

    // add(): Add an element
    magicCards.add("Yoshimaru, Ever Faithful")
    println(magicCards)

    // addAll(): Add a set of elements
    val counterCards = hashSetOf("Counterspell", "Negate", "Nullify", "Exclude", "Dissolve")
    magicCards.addAll(counterCards)
    println(magicCards)

    // remove(): Remove al element by value
    magicCards.remove("Yoshimaru, Ever Faithful")
    println(magicCards)

    // removeAll(): Remove all elements from a hashset
    val whiteCards = hashSetOf("Path to Exile", "Swords to Ploughshares", "Banishing Blade", "Wanderer's Strike")
    magicCards.removeAll(whiteCards)
    println(magicCards)

    // intersect(): Returns values that are common between two sets
    val lowCostCards = hashSetOf("Path to exile", "Swords to ploughshares", "Counterspell", "Negate", "Nullify")
    val lowCostCounterCards = counterCards.intersect(lowCostCards)
    println(lowCostCounterCards)

    // clear(): Empties a hashset.
    magicCards.clear()
    println(magicCards.isEmpty())
}
