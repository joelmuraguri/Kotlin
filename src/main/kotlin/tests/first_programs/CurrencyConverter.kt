package tests.first_programs

import java.text.DecimalFormat

//Input currency in rupees and output in USD.

fun main(){

    print("Enter Amount in (rupees) :")
    val amount = readLine()?.toDoubleOrNull()


    val exchangeRate = 0.012
    val amountInUSD = amount?.times(exchangeRate)

    //decimal format that handles the number of decimal places of a digit
    val decimalFormat = DecimalFormat("#.##")
    val currencyFormat = decimalFormat.format(amountInUSD)

    if (amount != null){
        println("$${currencyFormat} USD")
    } else{
        println("Invalid Input. Please Try Again")
    }


}