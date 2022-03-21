package com.thetuber.thetuber.service.impls;

import com.thetuber.thetuber.entity.Person;
import com.thetuber.thetuber.dao.PersonRepository;
import com.thetuber.thetuber.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}
