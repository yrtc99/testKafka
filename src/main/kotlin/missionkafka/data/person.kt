package missionkafka.data

import java.util.*
//a model to hold our data
//POJO in java
//val 是不變的, only follow non-null values
data class Person(
        val firstName: String,
        val lastName: String,
        val birthDate: Date
)


