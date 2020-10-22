fun main(){
    var i = 13
    var j = 2

    // Arithmetic Operators
    println(i + j)
    println(i - j)
    println(i * j)
    println(i.toFloat() / j)
    println(i % j)

    // Relational Operators
    println( i > j)
    println( i < j)
    println( i >= j)
    println( i <= j)
    println( i == j)
    println( i != j)

    // Pre Post Increment
    println(i++)
    println(i--)

    println(++i)
    println(--i)
    println(i++ + ++i)

    // Logical Operators
    val above70 = false
    val knowsProgramming = true

    //&& AND
    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    // || OR
    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    // ! NOT
    val answer = false
    val result = !answer
    println(result)

}