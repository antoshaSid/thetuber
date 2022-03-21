package com.thetuber.thetuber.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "person_name")
    private String name;

    @Column(name = "person_description")
    private String description;

    @Column(name = "channel_name")
    private String channelName;

    @Column(name = "channel_url")
    private String channelUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "country")
    private Country country;

    @OneToMany(mappedBy = "person")
    private List<Image> images;

}
