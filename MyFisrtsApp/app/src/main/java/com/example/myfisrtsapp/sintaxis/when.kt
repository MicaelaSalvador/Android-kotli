package com.example.myfisrtsapp.sintaxis


fun main(){
    generateAnswerString()
}

var  count: Int = 42
fun generateAnswerString(): String {
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }

    return answerString
}

fun result(value: Any){
    when(value){
       is Int -> println( value+value)
        is String -> println(value)
        is Boolean -> if (value) print("Micaela")
    }
}

fun getMySemester(month: Int) =  when(month){
        in 1..6 ->  "Primer semestre"
        in 7..12 ->"Segundo Semestre"
        !in 1..12 -> "Semestre no valido"
        else -> "Micaela"
    }

fun getSemester(month: Int){
    when(month){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo Semestre")
        !in 1..12 -> print("Semestre no valido")
    }
}

fun getTrimester(month: Int){
    when(month){
        1,2,3-> println("Primer Trimestre")
        4,5,6-> println("Segundo Trimestre")
        7,8,9-> println("Tercer Trimestre")
        10,11,12-> println("Cuarto Trimestre")
        else -> println("Trimestre no valido")
    }
}



fun getMonthWhen(month: Int){
    when(month){
        1-> println("Enero")
        2-> println("Febrero")
        3-> println("Marzo")
        4-> println("Abril")
        5-> println("Mayo")
        6-> println("Junio")
        7-> println("Julio")
        8-> println("Agosto")
        9-> println("Septirmbre")
        10-> println("Octubre")
        11->{
            println("Noviembre")
            println("Noviembre")
        }
        12-> println("Diciembre")
        else -> println("No es un mes valido")
    }

}

fun getMonth(month:Int){
    if (month == 1){
        println("Enero")
    }else if (month==2){
        println("Febrero")
    }else if (month==3){
        println("Marzo")
    }else if (month==4){
        println("Abril")
    }else if (month==5){
        println("Mayo")
    }else if (month==6){
        println("Junio")
    }else if (month==7){
        println("Julio")
    }else if (month==8){
        println("Agosto")
    }else if (month==9){
        println("Septiembre")
    }else if (month==10){
        println("Octubre")
    }else if (month==11){
        println("Niviembre")
    }else if (month==12){
        println("Diciembre")
    }else{
        println("El mes no existe")
    }
}