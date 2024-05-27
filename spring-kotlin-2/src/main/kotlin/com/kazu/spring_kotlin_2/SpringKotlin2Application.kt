package com.kazu.spring_kotlin_2

import com.kazu.spring_kotlin_2.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringKotlin2Application{
	@GetMapping
	fun hi():Person{
		return Person(name = "nishant", lastName = "kumar")
	}
}
fun main(args: Array<String>) {
	runApplication<SpringKotlin2Application>(*args)
}
