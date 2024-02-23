package collections

fun main(args: Array<String>) {
    // Map //////////

    /*
    - A set of key-value pairs
        - Keys are unique
        - Values can be duplicates
    - Each key maps to one value

    - All keys must have the same type.
    - All values must have the same type.
    - However the key type and value type can differ.

    Example: A dictionary.
        Each key is a unique word.
        Each value is that word's definition.
     */

    val favouriteDeck = mapOf(Pair("Dave", "Cats & Dogs"), Pair("Ian", "Dinosaurs"), Pair("James", "Hobbits"))
    println(favouriteDeck)

    // We can create an empty map, but we must specify the key type and value type
    val numberOfDecks = mapOf<String, Int>()
    println(numberOfDecks)

    // get(): Get a value by key
    // Can also use index: [key]
    println(favouriteDeck.get("Dave"))
    println(favouriteDeck["Ian"])

    // Get a list of keys or values:
    println(favouriteDeck.keys)
    println(favouriteDeck.values)

    // .size: Gives length of map.
    println(favouriteDeck.size)

    //.containsKey
    println(favouriteDeck.containsKey("David"))
    println(favouriteDeck.containsKey("Dave"))

    //.containsValue
    println(favouriteDeck.containsValue("Dinosaurs"))
    println(favouriteDeck.containsValue("Demons"))

    //.isEmpty
    println(favouriteDeck.isEmpty())

    // HashMap //////////

    val favouriteGames = hashMapOf(Pair("Dave", "Soma"), Pair("Ian", "Persona 5"), Pair("James", "The Last Of Us"))
    println(favouriteGames)

    // Add a key-value pair:
    favouriteGames.put("Rob", "Death Stranding")
    println(favouriteGames)
    //Can also use assignment
    favouriteGames["Mike"] = "Rosetta Stone"
    println(favouriteGames)

    // Add all elements of another map
    val palsFavouriteGames = hashMapOf(Pair("Stefano", "Legend of Zelda"), Pair("Morgan","Mario Kart"), Pair("Mike M", "Mario Kart"), Pair("Mike & Neil", "Mario Kart"))
    favouriteGames.putAll(palsFavouriteGames)
    println(favouriteGames)

    // Reassign:
    favouriteGames["Dave"] = "Resident Evil 2"
    println(favouriteGames)

    // As with othe rcollections, we also have remove() & clear()
    favouriteGames.remove("Dave")
    println(favouriteGames)
    favouriteGames.clear()
    println(favouriteGames)
}