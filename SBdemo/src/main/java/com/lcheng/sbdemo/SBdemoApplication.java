package com.lcheng.sbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SBdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SBdemoApplication.class, args);
    }
    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse res = new GreetResponse(
                new Person("B10505058", 20, 2000 ),
                "admin");
        return res;
    }
    record Person(String ID, int age, int creditScore){}
    record GreetResponse(Person person, String permission){}
}
