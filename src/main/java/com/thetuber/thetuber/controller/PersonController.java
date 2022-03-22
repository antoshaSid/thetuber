package com.thetuber.thetuber.controller;

import com.thetuber.thetuber.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ModelAndView getAllPersons() {
        ModelAndView modelAndView = new ModelAndView("home", HttpStatus.OK);
        modelAndView.addObject(personService.getAllPersons());
        return modelAndView;
    }


}
