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

    //////////

    val insects = arrayListOf("Piccasso moth", "Red spotted jewel beetle", "Violin beetle", "Green milkweed grasshopper", "Gray's leaf insect", "Piccasso moth")

    // Access values in a list by indexing [x] or using get(x).
    println(insects[2])
    println(insects.get(4))

    // size method returns the length of the list
    println(insects.size)

    println(insects.contains("Violin beetle"))
    println(insects.contains("Cuckoo wasp"))

    println(insects.indexOf("Piccasso moth"))
    println(insects.lastIndexOf("Piccasso moth"))


    // ArrayList //////////

    /*
    A mutable list.
    We can add, remove and modify elements.
     */

    val trees = arrayListOf("Birch", "Elm", "Oak", "Redwood", "Beech", "Pine")
    println(trees)

    // Append an element
    trees.add("Willow")
    println(trees)

    // Append an ArrayList
    val moreTrees = arrayListOf("Gingko", "Baobab", "Banyan", "Mangrove")
    trees.addAll(moreTrees)
    println(trees)

    // Remove an element
    // If there are duplicates, only the first instance is removed.
    trees.remove("Willow")
    println(trees)

    // Remove each element in an ArrayList.
    // If there are duplicates, all of them will be removed.
    trees.add("Mangrove")
    println(trees)
    trees.removeAll(moreTrees)
    println(trees)

    // remove by position
    trees.removeAt(1)
    println(trees)

    // Replace an element
    trees.set(2, "Dragon")
    println(trees)

    trees[2] = "Yuzu"
    println(trees)

    //subList(x, y): Return a new ArrayList containing the values starting at x, and ending at y-1.
    println(trees.subList(2,5))

    //clear(): Removes all values from a list.
    trees.clear()
    println(trees)

    //isEmpty(): Returns true if list is empty; otherwise, false.
    println(trees.isEmpty())

    /*
    There are plenty of other ArrayList methods.
    Check out intellij's tooltips for more.
     */

}