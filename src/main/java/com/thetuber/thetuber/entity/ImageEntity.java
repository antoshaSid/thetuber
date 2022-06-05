package com.thetuber.thetuber.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "images")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name = "image_url")
    private String url;

    @NonNull
    @Column(name = "image_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;
}
