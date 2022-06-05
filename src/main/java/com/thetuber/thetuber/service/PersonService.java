package com.thetuber.thetuber.service;

import com.thetuber.thetuber.entity.PersonEntity;

import java.util.List;
import java.util.Map;

public interface PersonService {

    Map<String, List<List<PersonEntity>>> getAllPersonsWithContentType();

}
