package com.example.appengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppEngineApplication.class, args);
    }


    @GetMapping("/")
    public String returnMessage(){
        return "Hello";
    }

}
