package com.example.myfisrtsapp.sintaxis

fun main(){
    ifMultipleOR()
}
fun ifMultipleOR(){
    var pet="cat"
    var isHappy =true

    if (pet =="dog" || (pet=="cat" && isHappy)){
        println("Es un gato o un perro")
    }
}
fun ifMultiple(){
    var age=18
    var parentPermission=false
    var imHappy=true
    if(age >= 18 && parentPermission && imHappy){
        println("Tienes los permisos para beber una cerveza")
    }
    else{
        println("No tienes los permisos para beber una cerveza")
    }
}

fun ifInt(){
    var age=18
    if (age >=18){
        println("Beber cerveza")
    }
    else{
        println("Beber Jugo")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean=true
    if (!soyFeliz)
    {
        print("Estoy triste")
    }
    else{
        print("Estoy Feliz")
    }
}

fun ifAnidado(){
    val animal="cat"
    if(animal == "dog"){
        println("Es un Perrito")
    }else if (animal== "cat"){
        println("Es un gato")
    }else if (animal =="bird"){
        println("Es un pajaro")
    }else{
        println("No selecciono ninguno de los animales esperados")
    }

}

fun ifBasico(){
    val name="Micaela"
    if(name == "Micaela"){
        println("Oye,la variable name es Micaela")
    }
    else{
        println("No eres Micaela")
    }
}