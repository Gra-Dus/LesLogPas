package com.leslogpas.models

data class Person(
    val idPerson: Int,
    val namePerson: String,
    val loginPerson: String,
    val passwordPerson: String
){
    fun idPerson(): Int = idPerson
    fun namePerson(): String = namePerson
    fun loginPerson(): String = loginPerson
    fun passwordPerson(): String = passwordPerson
}
