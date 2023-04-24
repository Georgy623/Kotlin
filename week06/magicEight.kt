import kotlin.random.Random

fun main() {
    val responses = arrayOf(
        "I don’t think so.",
        "Yes, of course!",
        "I’m not sure.",
        "It's possible.",
        "Definitely not.",
        "Without a doubt.",
        "Ask again later.",
        "Better not tell you now.",
        "Outlook not so good.",
        "Cannot predict now."
    )
    val random = Random(System.currentTimeMillis())

    do {
        println("Ask a yes or no question, or type 'quit' to exit:")
        val input = readLine()?.trim()?.toLowerCase()
        if (input == "quit") {
            break
        }
        val response = responses[random.nextInt(responses.size)]
        println(response)
    } while (true)
}
