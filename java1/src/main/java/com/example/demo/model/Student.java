package com.example.demo.model;


import lombok.*;

import javax.persistence.*;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "student")
public class Student {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nr_matricol")
    private Long nr_matricol;
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Column(name = "grupa")
    private String grupa;
    @Column(name = "an")
    private Long an;
    @Column(name = "bursa")
    private Long bursa;
    @Column(name = "data_nastere")
    private Date data_nastere;



/*
    @Id

   /* @Column(name="nr_matricol")
    private Long id;

    @Column(name="nume")
    private String firstname;
    @Column(name="prenume")
    private String lastName;
    @Column(name="grupa")
    private String group;
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nume")
    private String nume;
    private String prenume;*/
}
