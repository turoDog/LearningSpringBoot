package com.nasus.ch5_2_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Ch522Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
    }

    @RequestMapping("")
    String index(){
        return "Hello Spring Boot";
    }
}
