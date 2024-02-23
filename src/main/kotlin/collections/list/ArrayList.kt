package collections.list

fun main(args: Array<String>) {
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





}