package com.github.cernadasjuan.service

import com.github.cernadasjuan.domain.Person

interface PersonService {

    fun findAll(): List<Person>
    fun findAllWithReverseName(): List<Person>
}