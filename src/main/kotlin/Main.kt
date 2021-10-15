

//void fun to print: the aura Color,if the player is pleased ,the name and health Status.
fun printPlayerInfo(auraColor:String,isBlessed:Boolean,name:String,healthStatus:String){
    println("The name of the player is:$name  \n The health Status:$healthStatus " +
            " \n Aura:$auraColor, " + "Blessed:${if (isBlessed) "YES" else "NO"}")

}






fun main(args: Array<String>) {
    val name = "Renad"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false


//this condition is to determine the karma color.
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "The Color is not determined"
    }


//this condition is to determine the health Status for the player.
    val healthStatus: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
    printPlayerInfo(auraColor,isBlessed,name,healthStatus)
}




