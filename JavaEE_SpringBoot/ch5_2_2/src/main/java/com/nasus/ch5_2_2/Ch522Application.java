package com.nasus.ch5_2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Ch522Application {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index(){
        return "book name is:"+bookName+"and book author is:"+bookAuthor;
    }
    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
        //关闭 banner
        /*SpringApplication app = new SpringApplication(Ch522Application.class);
        app.setBannerMode(Mode.OFF);
        app.run(args);*/
    }
}
