package com.thetuber.thetuber.controller;

import com.thetuber.thetuber.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String getAllPersons(Model model) {
        model.addAttribute("personPairs", personService.getAllPersonsWithContentType());
        return "homePage";
    }

}
