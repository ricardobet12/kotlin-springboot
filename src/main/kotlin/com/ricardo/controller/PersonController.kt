package com.ricardo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/persons")
class PersonController {

    @GetMapping("/")
    fun prueba(): String {
        return "personService!!.save(Person) "
    }
}