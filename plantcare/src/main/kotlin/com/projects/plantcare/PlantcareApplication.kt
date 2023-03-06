package com.projects.plantcare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlantcareApplication

fun main(args: Array<String>) {
	print("Starting service :: Plant Care")
	runApplication<PlantcareApplication>(*args)
	print("Started service :: Plant Care")
}
