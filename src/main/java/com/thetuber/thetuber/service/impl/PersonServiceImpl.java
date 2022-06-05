package com.thetuber.thetuber.service.impl;

import com.thetuber.thetuber.repository.PersonRepository;
import com.thetuber.thetuber.entity.PersonEntity;
import com.thetuber.thetuber.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.thetuber.thetuber.entity.ContentType.*;
import static com.thetuber.thetuber.utils.PageUtils.gridList;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Map<String, List<List<PersonEntity>>> getAllPersonsWithContentType() {
        Map<String, List<List<PersonEntity>>> personListWithContentType = new HashMap<>();
        personListWithContentType.put(
                TECHNIC_CONTENT.toString(),
                gridList(personRepository.findPersonByContentTypeOrderByPriority(TECHNIC_CONTENT))
        );
        personListWithContentType.put(
                AUTO_CONTENT.toString(),
                gridList(personRepository.findPersonByContentTypeOrderByPriority(AUTO_CONTENT))
        );
        personListWithContentType.put(
                GAME_CONTENT.toString(),
                gridList(personRepository.findPersonByContentTypeOrderByPriority(GAME_CONTENT))
        );
        personListWithContentType.put(
                ENTERTAINMENT_CONTENT.toString(),
                gridList(personRepository.findPersonByContentTypeOrderByPriority(ENTERTAINMENT_CONTENT))
        );
        personListWithContentType.put(
                TRAVEL_CONTENT.toString(),
                gridList(personRepository.findPersonByContentTypeOrderByPriority(TRAVEL_CONTENT))
        );
        personListWithContentType.put(
                OTHERS.toString(),
                gridList(personRepository.findByOrderByPriority())
        );

        return personListWithContentType;
    }

}
