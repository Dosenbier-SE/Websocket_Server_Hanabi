package com.se2_hanabi.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyServiceTests {

    @Autowired
    private MyService myService;

    @Test
    void testGreet() {
        String greeting = myService.greet("World");
        assertThat(greeting).isEqualTo("Hello, World");
    }
}