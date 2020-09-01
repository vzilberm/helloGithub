package com.zmints.demo.controller

import com.zmints.demo.model.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    @GetMapping("/greetings")
    Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        new Greeting(greetingText: String.format("Hello, " + name))
    }
}
