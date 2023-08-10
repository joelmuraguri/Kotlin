package tests.first_programs

// Take name as input and print a greeting message for that particular name.

fun main(){

    print("Enter Name :")
    val name = readLine().toString()

    println("Hi $name")

}