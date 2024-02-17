package numbers

fun main(args: Array<String>) {

    println("Number Types")

    println("Automatically assigned number types")

    //Kotlin assigns number types according to their memory requirements.

    // Integer types: byte, short, int, long //////////

    // byte is between -128 & 127
    val byteExample = 5
    // kotlin automatically assigns this range to int
    println(byteExample::class.java)

    // short is -32768 to 32767
    val shortExample = 2000
    // kotlin automatically assigns this range to int
    println(shortExample::class.java)

    // short is -32768 to 32767.
    val intExample = 40000
    // kotlin automatically assigns this range to int
    println(intExample::class.java)

    // short is -32768 to 32767
    val longExample = 9876543210
    // kotlin automatically assigns this range to long
    println(longExample::class.java)


    // Float types: float, double //////////

    // float is 6-7 decimal places, +ve or -ve.
    val floatExample = 1.123456
    // kotlin automatically assigns this range to double
    println(floatExample::class.java)

    // double is 15-16 decimal places, +ve or -ve.
    val doubleExample = 1.123456789
    // kotlin automatically assigns this range to double
    println(doubleExample::class.java)


    println("Explicitly assigned number types")

    val oneAuto = 1 // Int (automatically assigned)
    println(oneAuto::class.java)

    val oneLong = 1L // Long
    println(oneLong::class.java)

    val oneFloat = 1F // Float
    println(oneFloat::class.java)

    // The assignment operator `:` can be used to assign most types.
    val oneByte: Byte = 1 // Byte
    println(oneByte::class.java)


    println("Inheritance")

    // When two numbers of different types are operated on, kotlin will try to choose an inherited type suitable for the new value.
    val longNumber = 400000000000000
    println(longNumber ::class.java) // long
    val shortNumber = 1
    println(shortNumber ::class.java) // int

    val product = longNumber * shortNumber
    println(product)
    println(product ::class.java) // Inherits type `long` because `ìnt` is too small for this large value.


    println("Overflow")

    // Danger! If a number is processed in such a way that it exceeds its size limit, it will overflow!
    // short is -32768 to 32767.
    val largeInt = 2000000000 // Close to the int limit of 2147483647
    println(largeInt)
    println(largeInt::class.java)

    val doubleLargeInt = largeInt * 2 // = 400000000.
    // The int type is inherited from largeInt.
    // However, this value exceeds the int limit of 2147483647, so overflow occurs.
    println(doubleLargeInt) // Due to overflow, doubleLargeInt is -294967296
    println(doubleLargeInt ::class.java)


}