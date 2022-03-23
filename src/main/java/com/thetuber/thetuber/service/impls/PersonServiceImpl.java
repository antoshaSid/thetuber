package com.thetuber.thetuber.service.impls;

import com.thetuber.thetuber.dao.PersonRepository;
import com.thetuber.thetuber.entity.Person;
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
    public Map<String, List<List<Person>>> getAllPersonsWithContentType() {
        Map<String, List<List<Person>>> personListWithContentType = new HashMap<>();
        personListWithContentType.put(
                TECHNIC_CONTENT.toString(),
                gridList(personRepository.findPersonByContentType(TECHNIC_CONTENT))
        );
        personListWithContentType.put(
                AUTO_CONTENT.toString(),
                gridList(personRepository.findPersonByContentType(AUTO_CONTENT))
        );
        personListWithContentType.put(
                GAME_CONTENT.toString(),
                gridList(personRepository.findPersonByContentType(GAME_CONTENT))
        );
        personListWithContentType.put(
                ENTERTAINMENT_CONTENT.toString(),
                gridList(personRepository.findPersonByContentType(ENTERTAINMENT_CONTENT))
        );
        personListWithContentType.put(
                TRAVEL_CONTENT.toString(),
                gridList(personRepository.findPersonByContentType(TRAVEL_CONTENT))
        );
        personListWithContentType.put(
                OTHERS.toString(),
                gridList(personRepository.findAll())
        );

        return personListWithContentType;
    }

}
