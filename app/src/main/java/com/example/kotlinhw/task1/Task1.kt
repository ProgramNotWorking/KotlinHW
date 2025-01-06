package com.example.kotlinhw.task1

/**
 * В данном классе поля field2 и field3 являются изменяемыми
 * Если значение данных полей изменится после того, как объект будет добавлен в HashMap,
 * то хэш-код из hashCode и сравнение через equals не будет работать некорректно
 * Из-за этого объект может быть не наден в HashMap, даже если он находится в таблице
 * **/
data class Key(
    val field1: Int,
    var field2: String
) {
    var field3: String? = null
}

/**
 * Решение проблемы
 * **/
data class CorrectKey(
    val field1: Int,
    // Сделали поле не изменяемым
    val field2: String
) {

    var field3: String? = null

    // Если же нужно оставить поле изменямым, то стоит переопределить методы hashcode и equals
    override fun hashCode(): Int {
        return 31 * field1 + field2.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Key) return false
        return field1 == other.field1 && field2 == other.field2
    }

}