package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class greetcontrol {

    private static final String temp = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new greeting(counter.incrementAndGet(), String.format(temp,name));
    }
}
