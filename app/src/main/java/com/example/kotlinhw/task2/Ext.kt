package com.example.kotlinhw.task2

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

internal fun Long.formatTime(): String {
    val date = Date(this)
    val sdf = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault())
    return sdf.format(date)
}