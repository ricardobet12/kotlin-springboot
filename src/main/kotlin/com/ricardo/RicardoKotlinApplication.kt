package com.ricardo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RicardoKotlinApplication

fun main(args: Array<String>) {
	runApplication<RicardoKotlinApplication>(*args)
}
