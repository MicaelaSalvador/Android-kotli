package com.example.myfisrtsapp.sintaxis
val age:Int=30

fun main(){
    showMyName( )
    showMyAge(30)
    add(25,76)
    val mySubtract = subtract(10,5)
   println(mySubtract)
}
fun showMyName(){
println("Me llamo Micaela Salvador")
}

fun  showMyAge(currentAge:Int){
    println("tengo $currentAge años ")
}

fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber:Int, secondNumber:Int):Int{
 return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int,secondNumber: Int):Int=firstNumber-secondNumber

fun variableAlfanumerico(){
    /**
     * Variable Alfanumerica
     */
    //char
    val charExample1:Char='e'
    val charExample2:Char='2'
    val charExample3:Char='@'

    //string
    val  stringExample:String="Micaela Salvador"
}

fun variablesBoolean(){
    /**
     * Variable booleanas
     */

    //Boolean
    val booleanExample:Boolean =true
    val booleanExample2:Boolean =false
}


fun variablesNumericas(){
    /**
     * Variable booleanas
     */

    // int
    var  age2:Int=30
    age2=29

    //long
    val example:Long=30
    val example2:Long=30

    //Float
    val floatExample:Float=30.5f

    println("sumar")
    println(age + age2)

    println("Restar")
    println(age -age2)

    println("Multiplicar")
    println(age +age2)

    println("Division")
    println(age /age2)

    println("Modulo")
    println(age % age2)
}