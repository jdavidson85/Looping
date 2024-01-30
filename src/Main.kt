fun main() {
    var userAns = 0

    do {
        println("1) Playstation")
        println("2) Xbox")
        println("3) Nintendo")
        println("4) PC")
        println("5) VR")
        println("6) Exit")

        println("Pick Favorite System: ")
        userAns = readln()!!.toInt()
        println("You Selected $userAns ")
       
        if (userAns == 1)
            println("You Selected Playstation")
            else if (userAns == 2)
                println("You Selected Xbox")
            else if (userAns == 3)
                println("You Selected Nintendo")
            else if (userAns == 4)
                println("You Selected PC")
            else if (userAns == 5)
                println("You Selected VR")
            else if (userAns == 6)
                println("You have ended the program")
            else if (userAns >= 7)
                println("Invalid Try again")
    } while (userAns != 6)

}