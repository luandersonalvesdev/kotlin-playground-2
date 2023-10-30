package com.betrybe.playground

class Student(
    val enrollmentNumber: Int,
    val subjects: List<Discipline>,
    val academicPeriod: PeriodEnum,
    name: String,
    age: Int,
    email: String,
) : Person(name, age, email)