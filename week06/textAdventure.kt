fun main() {
    var currentRoom = "dusty castle room"
    var direction = ""
    while (true) {
        when (currentRoom) {
            "dusty castle room" -> {
                println("You are in a dusty castle room.")
                println("Passages lead to the north and south.")
                print("What direction? ")
                direction = readLine() ?: ""
                currentRoom = if (direction == "n") "armory" else if (direction == "s") "torch-lit hallway" else currentRoom
            }
            "armory" -> {
                println("You are in the armory.")
                println("There is a room off to the south.")
                print("What direction? ")
                direction = readLine() ?: ""
                currentRoom = if (direction == "s") "dusty castle room" else currentRoom
            }
            "torch-lit hallway" -> {
                println("You are in a torch-lit hallway.")
                println("There are rooms to the east and west.")
                print("What direction? ")
                direction = readLine() ?: ""
                currentRoom = if (direction == "e") "bedroom" else if (direction == "w") "kitchen" else currentRoom
            }
            "bedroom" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard.")
                println("A hallway is to the west.")
                print("What direction? ")
                direction = readLine() ?: ""
                currentRoom = if (direction == "w") "torch-lit hallway" else currentRoom
            }
            "kitchen" -> {
                println("You are in the kitchen. It looks like a roast is being made for supper.")
                println("A hallway is to the east.")
                print("What direction? ")
                direction = readLine() ?: ""
                currentRoom = if (direction == "e") "torch-lit hallway" else currentRoom
            }
            else -> {
                println("Invalid room: $currentRoom")
                break
            }
        }
        if (currentRoom == "") {
            println("Game over.")
            break
        } else if (currentRoom == "invalid") {
            println("Can't go that way.")
            currentRoom = direction
        }
    }
}
