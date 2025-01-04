package com.example.kotlinhw.task3

fun List<Any>.findInt(): Int? {
    for (item in this) {
        if (item is Int) return item
    }
    return null
}