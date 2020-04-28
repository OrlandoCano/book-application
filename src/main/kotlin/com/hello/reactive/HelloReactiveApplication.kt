package com.hello.reactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloReactiveApplication

fun main(args: Array<String>) {
	runApplication<HelloReactiveApplication>(*args)
}
