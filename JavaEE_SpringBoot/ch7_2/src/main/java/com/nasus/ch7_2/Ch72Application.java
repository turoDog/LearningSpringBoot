package com.nasus.ch7_2;

import com.nasus.ch7_2.domain.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Ch72Application {

    @RequestMapping("/")
    public String index(Model model){
        Person single = new Person("aa",666);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx",666);
        Person p2 = new Person("yy",777);
        Person p3 = new Person("zz",888);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);

        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch72Application.class, args);
    }
}
