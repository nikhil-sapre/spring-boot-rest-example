package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String templateEnglish = "Hello, %s!";
    private static final String templateHindi = "Namaste , %s!";
    private final AtomicLong counter = new AtomicLong();

    private List<Greeting> greetings = new ArrayList<Greeting>(Arrays.asList(new Greeting("1",templateEnglish),
            new Greeting("2", templateHindi)));

    public List<Greeting> getAllGreetings(){
        return greetings;
    }

    public Greeting getGreeting(String id){
        return greetings.stream().filter(t -> t.id().equals(id)).findFirst().get();
    }

    public void addGreeting(Greeting greeting) {
        greetings.add(greeting);
    }
}
