package com.sachin.Project1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {

    Apple(){
        System.out.println("Apple object is created");
    }
    void eatApple(){
        System.out.println("I am eating the apple ....");
    }

    @PostConstruct
    void init(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void destroy(){
        System.out.println("Cleaning up resources...");
    }
}
