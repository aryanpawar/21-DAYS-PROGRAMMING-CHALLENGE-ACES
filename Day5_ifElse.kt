fun main(){
    var age = 19
    votingEligibility(age)
    age = 16
    votingEligibility(age)
}
fun votingEligibility(age: Int){
    if (age>18){
        println("Eligible For Voting at age of ${age}")
    }
    else{
        println("Not Eligible For Voting at age of ${age}")
    }
}