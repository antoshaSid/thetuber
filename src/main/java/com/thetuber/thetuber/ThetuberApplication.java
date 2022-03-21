package com.thetuber.thetuber;

import com.thetuber.thetuber.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThetuberApplication {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ThetuberApplication.class, args);

    }

}
