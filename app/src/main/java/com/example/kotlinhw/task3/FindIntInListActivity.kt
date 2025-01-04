package com.example.kotlinhw.task3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinhw.databinding.ActivityTask3Binding

class FindIntInListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTask3Binding
    private val list: List<Any> = listOf(
        "Hello!",
        Person(name = "Nikita"),
        1L,
        Person(age = 21),
        100
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendLogButton.setOnClickListener {
            Log.d("ListLog", "Result: ${list.findInt()}")
        }

    }

}

data class Person(
    val name: String = "default user name",
    val age: Int = 0
)