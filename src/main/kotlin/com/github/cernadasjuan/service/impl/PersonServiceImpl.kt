package com.github.cernadasjuan.service.impl

import com.github.cernadasjuan.domain.Person
import com.github.cernadasjuan.repository.PersonRepository
import com.github.cernadasjuan.service.PersonService
import org.springframework.stereotype.Service

@Service
open class PersonServiceImpl(val personRepository: PersonRepository) : PersonService {

    override fun findAll(): List<Person> = personRepository.findAll()

    override fun findAllWithReverseName(): List<Person> {
        val persons = findAll()
        return persons.map { person -> Person(person.id, person.name?.reversed()) }
    }

}