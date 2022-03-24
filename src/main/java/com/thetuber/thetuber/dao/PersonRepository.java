package com.thetuber.thetuber.dao;

import com.thetuber.thetuber.entity.ContentType;
import com.thetuber.thetuber.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByOrderByPriority();

    List<Person> findPersonByContentTypeOrderByPriority(ContentType contentType);

}
