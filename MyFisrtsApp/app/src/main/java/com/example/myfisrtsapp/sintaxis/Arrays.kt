package com.example.myfisrtsapp.sintaxis

fun main(){
    val weekDays = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(weekDays[0])
    println(weekDays.size)

    //Bucle
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    //modificar valor del array
    weekDays[0]="Feliz Lunes"
    println(weekDays[0])

    //ota  manera de hacer un bucle
    for((position,value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }
    // Bucle
    for(weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}
