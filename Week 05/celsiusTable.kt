fun celsius(fahrenheit: Double): Double {
    val celsius = 5.0 / 9.0 * (fahrenheit - 32.0)
    return celsius
}


fun main() {
    println("Fahrenheit\tCelsius")
    println("------------------------")
    for (f in 0..20) {
        val c = celsius(f.toDouble())
        println("$f\t\t${"%.2f".format(c)}")
    }
}
