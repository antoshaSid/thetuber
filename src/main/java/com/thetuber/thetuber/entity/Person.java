package com.thetuber.thetuber.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "person_name")
    private String name;

    @Column(name = "person_description")
    private String description;

    @Column(name = "channel_name")
    private String channelName;

    @Column(name = "channel_url")
    private String channelUrl;

    @Column(name = "subscribers")
    private String subscribers;

    @Enumerated(EnumType.STRING)
    @Column(name = "content_type")
    private ContentType contentType;

    @Enumerated(EnumType.STRING)
    @Column(name = "country")
    private Country country;

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
    private List<Image> images;

}
