package com.thetuber.thetuber.repository;

import com.thetuber.thetuber.entity.ContentType;
import com.thetuber.thetuber.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

    List<PersonEntity> findByOrderByPriority();

    List<PersonEntity> findPersonByContentTypeOrderByPriority(ContentType contentType);

}
