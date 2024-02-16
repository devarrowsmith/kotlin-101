import java.util.* // This import automatically appeared when I entered some string methods.
fun main(args: Array<String>) {

    /*
    Here we're looking at some methods you can use with strings.

    <<<Protip>>>
    If you write the variable name followed by a period `myPet.` then IntelliJ will show  a list of methods you can use with it.
    Like JS, in Kotlin strings are objects.
     */

    val myPet = "Velociraptor"
    println(myPet)

    println(myPet.length)

    // println(myPet.capitalize()): Example in the course, but caplitalize is actually deprecated. Here's an alternative suggested by IntelliJ:
    println(myPet.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    // Strings are zero-indexed.
    println("${myPet.get(0)}${myPet.get(1)}${myPet.get(9)}${myPet.get(10)}")

    // Indexing [] is a better syntax than get().
    println("${myPet[9]}${myPet[11]}${myPet[5]}${myPet[4]}${myPet[1]}${myPet[6]}${myPet[7]}${myPet[9]}${myPet[10]}${myPet[8]}s")

    println(myPet.substring(2,6))

    val whitespace = "            There's too much whitespace!          "
    println(whitespace)
    println(whitespace.trim())

    // The course said to try out a random method from the code editor's methods list. So I selected the random()method. it retaurns a random char from the string.
    println(myPet.random())

    // template with variables using $variable
    println("I love my $myPet! <3 <3 <3")

    // template with expressions using ${}
    println("${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}${myPet.random()}")
}

