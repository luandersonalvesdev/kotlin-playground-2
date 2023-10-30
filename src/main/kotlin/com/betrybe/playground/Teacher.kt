package com.betrybe.playground

class Teacher(
    val subjects: List<Discipline>,
    val period: PeriodEnum,
    functionId: Int,
    name: String,
    age: Int,
    email: String
) : Collaborator(functionId, name, age, email)
