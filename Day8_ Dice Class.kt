fun main(){
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numOfSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numOfSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice(val numOfSides:Int){

    fun roll(): Int {
        return (1..numOfSides).random()
    }
}