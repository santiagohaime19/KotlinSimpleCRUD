package com.james.simpleCRUD.simpleCRUD.feature

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class HelloWorldController(
    @Value("\${simpleCRUD.class.hello}")
    private val hello: String) {

    @GetMapping("/springboot")
    fun helloWorld(): String {
        return this.hello
    }
}