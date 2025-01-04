package com.example.kotlinhw.task2

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LaunchTimeDelegate : ReadWriteProperty<Any?, Long> {

    private var cachedTimeValue: Long? = null

    override fun getValue(thisRef: Any?, property: KProperty<*>): Long {
        return cachedTimeValue ?: System.currentTimeMillis().also {
            cachedTimeValue = it
        }
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
        cachedTimeValue = value
    }

}