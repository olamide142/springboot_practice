package com.olamide.springboot_practice.Person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@EnableAutoConfiguration
public class Sample {

    @RequestMapping("/")
    List<Person> hello(){
        List<Person> li = new ArrayList<>();
        for(int i=0; i<2;i++){
            li.add(new Person(UUID.randomUUID(), "M", 21, new Person.Occupation("Sales", "Senior Java Developer", 270000)));
        }
        return li;
    }

    public static void main(String[] args) {
        SpringApplication.run(Sample.class, args);
    }
}
