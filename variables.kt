fun main(){

    var animal = "Dog"
    println(animal)

    animal = "Cat"
    println(animal)

    animal = ""
    println(animal)

    println(animal.isEmpty())

    var money = 50
    money = 200
    println(money)


    // Creating Read Only Variables

    val x = 5
    println(x)
   //  x = 7  Gives error because we cannot reassign read only variable


//    Explicitely Providing Type To Variable

    var a : Int = 5
    println(a::class)  // Checking Data Type Of Variable
}