package com.nasus.ch7_7;

import com.nasus.ch7_7.domain.Person;
import java.awt.PageAttributes.MediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch77Application {

    @RequestMapping(value = "/search",produces = "application/json")
    public Person search(String personName){
        return new Person(personName, 32, "Guangzhou");
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch77Application.class, args);
    }
}
