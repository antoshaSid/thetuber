package com.thetuber.thetuber.service;

import com.thetuber.thetuber.entity.ContentType;
import com.thetuber.thetuber.entity.Person;

import java.util.List;
import java.util.Map;

public interface PersonService {

    Map<String, List<List<Person>>> getAllPersonsWithContentType();

}
