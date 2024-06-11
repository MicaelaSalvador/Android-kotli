package com.example.myfisrtsapp.todoapp

sealed class TaskCategory(var isSelected:Boolean=true
) {
    object Personal : TaskCategory()
    object Bussines : TaskCategory()
    object other  : TaskCategory()
}

