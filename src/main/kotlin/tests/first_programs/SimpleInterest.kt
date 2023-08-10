package tests.first_programs

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// SI = P × R × T

fun main(){

    print("Enter Principal amount :")
    val principal = readLine()?.toDoubleOrNull()

    print("Enter Rate (%) :")
    val rate = readLine()?.toDoubleOrNull()

    print("Enter Time (years):")
    val time = readLine()?.toDoubleOrNull()

    if ( principal != null && rate != null && time != null){
        val interest = principal * rate * time
        println("Simple Interest : $interest")

    } else {
        println("Invalid Inputs. Please Try again")
    }
}