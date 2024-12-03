import java.io.IO.println
import java.util.Collections.emptyList
import kotlin.collections.* // For emptyList and mutableListOf

fun main() {
    val primes = generatePrimes(10)
    println("First 10 prime numbers: $primes")
}

fun generatePrimes(n: Int): List<Int> {
    if (n <= 0) return java.util.ArrayList()
    val primes = java.util.ArrayList<Int>()
    var num = 2
    while (primes.size < n) {
        if (isPrime(num)) {
            primes.add(num)
        }
        num++
    }
    return primes
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}



// My questions to ChatGPT

// What is Kotlin, and why is it popular for Android development?
//Kotlin is a programming language developed by JetBrains that is fully interoperable with Java and provides a modern, concise syntax.
// It is the official language for Android development because it reduces boilerplate code and includes features like null safety,
// which prevents common errors like NullPointerException.

//---------------

//How is Kotlin different from Java?
//Kotlin is more concise, reducing the amount of code you need to write compared to Java. It has built-in null safety, extension functions, and default
// parameter values, which Java lacks, making it easier to write clean and robust code.

//---------------

//Can I use Kotlin with my existing Java projects?
//Yes, Kotlin is fully interoperable with Java, meaning you can use Kotlin in your existing Java projects without rewriting all your code.
// You can even call Java methods from Kotlin and vice versa.

//--------------

//Is Kotlin hard to learn if I already know Java?
//Kotlin is relatively easy to learn for Java developers because of its similar syntax and seamless interoperability.
// It simplifies many concepts you already know, so you can quickly adapt to writing in Kotlin while appreciating its modern features.

//-----------------------------------------

// MY EXPERIENCE WITH THIS TASK

// I was surprised that most of the errors were related to the project setup. Once that was out of the way it went relatively fast.