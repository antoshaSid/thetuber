package com.thetuber.thetuber.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    @Column(name = "person_name")
    private String name;

    @NonNull
    @Column(name = "person_description")
    private String description;

    @OneToMany(mappedBy = "person")
    private List<Image> images;

}
