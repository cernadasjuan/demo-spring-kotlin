package com.github.cernadasjuan

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class DemoSpringKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoSpringKotlinApplication::class.java, *args)
}
