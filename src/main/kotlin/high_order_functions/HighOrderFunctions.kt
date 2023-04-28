package high_order_functions

// High-order Functions are return a function or takes a functions as parameters

fun main(){
    println("High Order Function")
    plWinners(champions)
    calculateSum(sum)
    multFunc(::multiply)
    val result = difference()
    val difference = result(87, 78)
    println("The Difference : $difference")
    champions.invoke()
}

//Using Lambda Expressions
val champions = { println("Manchester City")}
fun plWinners( winners : () -> Unit){
    winners()
}


var sum = { a : Int, b  : Int -> a + b}
fun calculateSum( sum : (Int, Int) -> Int){
    val result = sum(3,7)
    println("The sum : $result")
}

//Using Functions
fun multiply(a : Float, b : Float) : Float{
    return a * b
}
fun multFunc(product : (Float, Float) -> Float){
    val result = product(4.7F, 7.9F)
    println("The product : $result")
}


//Returning a function
fun subtract( a: Int, b : Int) : Int {
    return a-b
}
fun difference() : ((Int, Int) -> Int){
    return ::subtract
}

