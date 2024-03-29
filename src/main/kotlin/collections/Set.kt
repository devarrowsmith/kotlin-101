package collections

fun main(args: Array<String>) {
// Set //////////
    /*
    - A collection of UNIQUE elements. Cannot contain duplicates.
    - Unordered: The order has no significance.
    - We can iterate over the elements, but the order of iteration is not defined.
    - Immutable. Values cannot be added, removed or changed.

    Example: A deck of cards. 52 unique values, no specific order.
     */

    val cards = setOf("Club 6", "Club 9", "Heart Jack", "Spade 10")
    println(cards)

    // If we create an empty set we must specify the type
    val emptyHand = setOf<String>()
    println(emptyHand)

    // If we give the set duplicate values, only one instance is retained.
    val trickHand = setOf("Heart Ace", "Heart Ace", "Heart Ace", "Heart Ace")
    println(trickHand)

    // A set can contain a null element, but only one as each value must be unique.
    val jokerHand = setOf(null, null, null, null)
    println(jokerHand)

    // size: Get length of a set
    println(cards.size)

    // contains(): Check if value is in the set
    println(cards.contains("Heart Jack"))
    println(cards.contains("Heart King"))

    // containsAll(): Check if all values are in the set
    val clubs = setOf("Club 6", "Club 9")
    println(cards.containsAll(clubs))


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
