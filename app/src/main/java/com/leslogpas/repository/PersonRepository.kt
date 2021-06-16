package com.leslogpas.repository

import com.leslogpas.models.Person

object PersonRepository {
    var persons = listOf<Person>(
        Person(1,"Somet", "Som","gap"),
        Person(2,"Kelly", "Kel","gap"),
        Person(3,"Jelly", "Jel","gap"),
        Person(4,"Loly", "Lol","gap"),
        Person(5,"Nancy", "Nan","gap")
    )

    fun getPersones():List<Person>{
        return persons
    }

}