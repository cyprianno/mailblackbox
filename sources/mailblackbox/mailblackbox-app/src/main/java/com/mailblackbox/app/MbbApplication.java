package com.mailblackbox.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Configuration
@EnableAutoConfiguration
@RestController
@SpringBootApplication
public class MbbApplication {

    @Value("${sample.data}")
    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }

    @PostConstruct
    public void test() {
        System.out.println(home());
    }

    public static void main(String[] args) {
        SpringApplication.run(MbbApplication.class, args);
    }

}
