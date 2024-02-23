package collections.list

fun main(args: Array<String>) {

    // List functions //////////

    val trees = listOf("Birch", "Elm", "Oak", "Redwood", "Beech", "Pine", "Birch")
    println(trees)

    println(trees.size)

    println(trees.contains("Pine"))
    println(trees.contains("Mangrove"))

    println(trees.indexOf("Birch"))
    println(trees.lastIndexOf("Birch"))

    // ArrayList functions /////////

    /*
    All of the above List functions also work on ArrayLists.
    As ArrayLists are mutable they have additional mutating methods.
     */

    val insects = arrayListOf("Piccasso moth", "Red spotted jewel beetle", "Violin beetle", "Green milkweed grasshopper", "Gray's leaf insect")
    println(insects)

    // set(x, value): Replace value in position x
    insects.set(1, "Cuckoo wasp")
    println(insects)

    //subList(x, y): Return a new ArrayList containing the values starting at x, and ending at y-1.
    println(insects.subList(2,5))

    //clear(): Removes all values from a list.
    insects.clear()
    println(insects)

    //isEmpty(): Returns true if list is empty; otherwise, false.
    println(insects.isEmpty())

    /*
    There are plenty of other ArrayList methods.
    Check out intellij's tooltips for more.
     */

}