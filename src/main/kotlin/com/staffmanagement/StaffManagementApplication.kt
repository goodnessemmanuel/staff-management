package com.staffmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StaffManagementApplication

fun main(args: Array<String>) {
	runApplication<StaffManagementApplication>(*args)
}
