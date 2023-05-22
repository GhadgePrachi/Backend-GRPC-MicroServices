package com.projects.plantcare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlantcareApplication

fun main(args: Array<String>) {
	println("Starting service :: Plant Care")
	runApplication<PlantcareApplication>(*args)
	println("Started service :: Plant Care")
}
