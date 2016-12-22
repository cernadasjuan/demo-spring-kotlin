package com.github.cernadasjuan.repository

import com.github.cernadasjuan.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long>