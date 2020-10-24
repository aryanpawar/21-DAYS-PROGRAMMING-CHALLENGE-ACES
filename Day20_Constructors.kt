import com.sun.org.apache.xpath.internal.operations.Bool

fun main(){
    var car = Automobile("Car","Petrol")
    var car2 = Automobile("Car2","Petrol")

/*    When No Parameter
    var person = Person()
    println(person.age)
    println(person.name)
    var person2 = Person()
    println(person2.age)
    println(person2.name)
 */

    //With Parameter
    var person = Person("A",20)
    println(person.age)
    println(person.name)
    var person2 = Person("B",18)
    println(person2.age)
    println(person2.name)

}


class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val engineType:String){
    init {
        println("$name is created")
    }

    init {
        println("2nd Initializer Block")
    }

    constructor(nameParam: String,engineParam:String) :
            this(nameParam,4,5,engineParam)

    fun drive(){}
    fun applyBrakes(){}
}

class Empty{}

class Person(nameParam:String, ageParam:Int){
    val name:String = "$nameParam - Clan"
    val age:Int = ageParam
}