package lambdas

fun main() {
    name()
    name.invoke()
    calculateSum.invoke()
    loopThroughCities.invoke()
    findOddEven.invoke()

}

//Declaring lambda expressions
val name = { println("Hi I am Joel Muraguri. Passionate Android Developer ")}
val calculateSum = {
    val a = 89
    val b = 9
    println(" The Sum : ${a + b}")
}
val loopThroughCities = {
    val cities = listOf("Nairobi, AmsterDam, Tokyo, China")
    for (i in cities.indices){
        println(cities[i])
    }
    cities.forEach {
        println(it)
    }
}

val findOddEven = {

    val find = fun(a : Int) : String{
        return if (a/2 != 0 ){
            "This is an odd Number"
        } else {
            "This is an Even NUmber"
        }
    }
}