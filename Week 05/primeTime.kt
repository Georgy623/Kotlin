
fun main() {
    val number = 10 // Change this to the number you want to check
    if (isPrime(number)) {
        println("$number is prime")
    } else {
        println("$number is not prime")
    }
}
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..number/2) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }
    return true
}
