package com.example.kotlinhw.task3

fun main() {

    val list: List<Any> = listOf(
        "Hello!",
        Person(name = "Nikita"),
        1L,
        Person(age = 21),
        100
        )

    print(list.findInt())

}

