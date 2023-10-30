package com.betrybe.playground

class Director(
    val startTime: String,
    val endTime: String,
    functionId: Int,
    name: String,
    age: Int,
    email: String
) : Collaborator(functionId, name, age, email)