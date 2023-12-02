package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.getAllGreetings();
    }

    @GetMapping("/greetings/{id}")
    public Greeting getGreeting(@PathVar