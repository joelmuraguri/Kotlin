package tests.first_programs

//Take 2 numbers as input and print the largest number.

fun main(){

    print("Enter First Number :")
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter Second Number : ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null){
        if (num1 > num2){
            println("$num1 is greater than $num2")
        } else {
            println("$num2 is greater than $num1")
        }
    } else {
        println("Invalid Inputs. Please Enter Correct Values")
    }




}