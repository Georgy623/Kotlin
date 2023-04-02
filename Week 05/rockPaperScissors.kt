import kotlin.random.Random

fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options[Random.nextInt(3)]
    var userChoice: String? = null

    while (userChoice == null) {
        println("Choose your weapon: Rock, Paper, or Scissors")
        val input = readLine()?.toLowerCase()
        if (input in options) {
            userChoice = input
        } else {
            println("Invalid input. Please choose one of the options provided.")
        }
    }

    println("Computer chooses: $computerChoice")
    if (userChoice == computerChoice) {
        println("It's a tie! Let's play again.")
    } else {
        when (userChoice) {
            "rock" -> {
                when (computerChoice) {
                    "scissors" -> println("You win! Rock smashes scissors.")
                    "paper" -> println("You lose. Paper wraps rock.")
                }
            }
            "paper" -> {
                when (computerChoice) {
                    "rock" -> println("You win! Paper wraps rock.")
                    "scissors" -> println("You lose. Scissors cuts paper.")
                }
            }
            "scissors" -> {
                when (computerChoice) {
                    "paper" -> println("You win! Scissors cuts paper.")
                    "rock" -> println("You lose. Rock smashes scissors.")
                }
            }
        }
    }
}
