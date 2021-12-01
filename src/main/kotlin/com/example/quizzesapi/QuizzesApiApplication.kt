package com.example.quizzesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class QuizzesApiApplication

fun main(args: Array<String>) {
	runApplication<QuizzesApiApplication>(*args)
}

@RestController
@RequestMapping("/test")
class TestController{
	@GetMapping
	fun test() = "test"
}
