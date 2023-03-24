package missionkafka.data

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.util.StdDateFormat
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

//this is a JSON mapper
//serialize our data class to JSON

val personsTopic = "persons"
val personsAvroTopic = "persons-avro"
val agesTopic = "ages"


//initialize the ObjectMapper
//enable Kotlin module
//set serialization format for dates
//Serialize : 將 Java Object 轉換成 json
val jsonMapper = ObjectMapper().apply {
    registerKotlinModule()
    disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
    setDateFormat(StdDateFormat())
}