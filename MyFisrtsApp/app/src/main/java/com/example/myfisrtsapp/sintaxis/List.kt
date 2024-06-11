package com.example.myfisrtsapp.sintaxis

fun main(){
    mutableList()
}

fun mutableList(){
    val weekDays : MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(3,"AristDay")
    println(weekDays)
    if(weekDays.isEmpty()){
        // No  voy a pintar nada por que no hay
    }
    else{
        weekDays.forEach{println(it)}
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach{println(it)}
    }
    weekDays.last()
    weekDays.first()
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    val example = readOnly.filter { it.contains("a") }
    println(example)

    //for
    readOnly.forEach{weekDay -> println(weekDay) }
}