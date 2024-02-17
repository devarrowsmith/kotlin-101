import kotlin.random.Random


fun main(args: Array<String>) {

    // Random number between 0 and 10
    println(Random.nextInt(10))

    // Random number between 20 and 20 (can only return 20)
    println(Random.nextInt(20, 21))

    // Random number between 20 and 30
    println(Random.nextInt(20, 31))
}