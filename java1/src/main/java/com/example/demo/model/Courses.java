package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "curs")
public class Courses {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="titlu")
    private String courseName;
    @Column(name="semestru")
    private String semester;
    @Column(name="credite")
    private String ECTS;
}
