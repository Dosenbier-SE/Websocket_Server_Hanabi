package com.se2_hanabi.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String greet(String name) {
        return "Hello, " + name;
    }
}