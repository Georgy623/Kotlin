
fun main() {
val n = 12 // Change this to the number of Fibonacci numbers you want to print
    for (i in 0 until n) {
        val fib = fibonacci(i)
        println(fib)

}
}

fun fibonacci(number: Int): Int {
    return if (number <= 1) {
        number
    } else {
        fibonacci(number - 1) + fibonacci(number - 2)
    }
}
