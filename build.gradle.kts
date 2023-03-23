buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.51"
    }
}

apply plugin: "java"
apply plugin: "kotlin"

// $ gradle classes

sourceCompatibility = 1.8

repositories {
    mavenCentral()
    maven { url 'https://packages.confluent.io/maven/' }
}

dependencies {
    compile "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.2.51"

    // fake data generator
    compile "com.github.javafaker:javafaker:0.15"

    // logging
    compile 'org.slf4j:slf4j-api:1.7.25'
    compile 'org.slf4j:slf4j-log4j12:1.7.25'

    // JSON serialization
    compile 'com.fasterxml.jackson.core:jackson-databind:2.9.6'
    compile 'com.fasterxml.jackson.module:jackson-module-kotlin:2.9.6'

    // Kafka
    compile 'org.apache.kafka:kafka-clients:2.0.0'
    compile 'io.confluent:kafka-avro-serializer:5.0.0'
}