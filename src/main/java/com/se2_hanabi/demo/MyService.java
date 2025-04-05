package com.se2_hanabi.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MyService {

    public String greet(String name) {
        return "Hello, " + name;
    }
    @GetMapping("/connect")
    public String connect() {
        return "Connection established with the server!";
    }

    @GetMapping("/game/start")
    public String startGame() {
        return "Game started! New deck created.";
    }

    @GetMapping("/game/draw")
    public String drawCard() {
        return "";
    }
}