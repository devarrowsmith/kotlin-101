package exceptions

fun main(args: Array<String>) {
    /*
    An exception is an unexpected event in a program.
    The system cannot recover from an exception. Execution is stopped and data is lost.
    Causes very bad user experience.
     */


    /*
    An interface may provide information when an exception occurs.
    Message: A programmed output. It can be usefully descriptive or not!
    Stacktrace: A log of what the program did before the exception occurred.
    Cause: A log indicating why the error occurred.
     */

    // Try catch //////////
    /*
    If we know part of our code my generate an exception, we can manage it with a try catch.
    */

    println("Please enter a number.")
    var test = readLine()

    try {
        println(test?.toInt())
    } catch (e:Exception) {
        // This block is executed of the try{} block raises an exception,
        // for example if the user enters text rather than a number.

        // This line prints a stack trace. This is usually a good idea as it may go into a log.
        e.printStackTrace()

        // This line outputs a message. We may show this to the user.
        println("An exception has occurred\n${e.localizedMessage}")
    } finally {
        println("This process will now terminate.")
    }


    // Finally block //////////
    /*
    A finally{} block can follow the try and catch blocks.
    The finally{} block will be executed regardless of whether the try{} or catch{} block runs.

    Why do this?

    If an exception occurs, the process will halt.
    Any memory resources in use will continue to exist in memory.
    Running a finally{} block will allow the script to continue, end and terminate,
    freeing up that memory.
    This is always important, but it's especially important when large resources (lots of memory) are used.
    This is an example of Junk or garbage;
    and Junk/Garbage Collection.
     */

    println("Please enter another number.")
    test = readLine()

    try {
        println("Your number was ${test?.toInt().toString()}")
    } catch (e:Exception) {
        // This block is executed of the try{} block raises an exception,
        // for example if the user enters text rather than a number.

        // This line prints a stack trace. This is usually a good idea as it may go into a log.
        e.printStackTrace()

        // This line outputs a message. We may show this to the user.
        println("An exception has occurred\n${e.localizedMessage}")
    } finally {
        println("This process will now terminate.")
    }

}
