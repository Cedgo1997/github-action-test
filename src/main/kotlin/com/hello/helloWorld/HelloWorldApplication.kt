package com.hello.helloWorld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class HelloWorldApplication

@GetMapping("/welcome")
fun welcome(): String {
    return "Welcome to project"
}