package com.github.cernadasjuan.controller

import com.github.cernadasjuan.domain.Person
import com.github.cernadasjuan.service.PersonService
import org.slf4j.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class PersonRestController(val personService: PersonService, val logger: Logger) {

    @GetMapping("persons")
    fun findAll(): List<Person> {
        val persons = personService.findAll()
        persons.forEach { person -> logger.info(person.toString()) }
        return persons
    }

    @GetMapping(value = "persons", params = arrayOf("reverseName"))
    fun findAllWithReverseName(): List<Person> {
        val persons = personService.findAllWithReverseName()
        persons.forEach { person -> logger.info(person.toString()) }
        return persons
    }

}