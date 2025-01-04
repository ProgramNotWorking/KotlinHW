package com.example.kotlinhw.task4

fun main() {

    val intList = listOf<Int?>(
        1, 10, 3, 2, 5, 6, 8, 4, 7, 9
    )
    val nullableList = listOf<Int?>(
        1, 10, null, 2, 5, null, 8, 4, null, 9
    )
    val emptyList: List<Int?> = emptyList()

    println(intList.shakerSort())
    println(nullableList.shakerSort())
    println(emptyList.shakerSort())

}

fun List<Int?>.shakerSort(): List<Int?> {
    val sortedList = this.toMutableList()
    if (sortedList.isEmpty()) return sortedList

    var left = 0
    var right = sortedList.size - 1
    var swapped: Boolean

    do {
        swapped = false
        for (i in left until right) {
            if ((sortedList[i] ?: Int.MAX_VALUE) > (sortedList[i + 1] ?: Int.MAX_VALUE)) {
                sortedList[i] = sortedList[i + 1].also { sortedList[i + 1] = sortedList[i] }
                swapped = true
            }
        }
        right--

        for (i in right downTo left + 1) {
            if ((sortedList[i - 1] ?: Int.MAX_VALUE) > (sortedList[i] ?: Int.MAX_VALUE)) {
                sortedList[i - 1] = sortedList[i].also { sortedList[i] = sortedList[i - 1] }
                swapped = true
            }
        }
        left++
    } while (swapped)

    return sortedList
}