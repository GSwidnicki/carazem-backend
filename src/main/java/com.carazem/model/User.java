package com.carazem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @Setter @Getter private Long id;

    @Column(name = "email")
    @Setter @Getter private String email;

    @Column(name = "password")
    @Setter @Getter private String password;

    @Column(name = "first_name")
    @Setter @Getter private String firstName;

    @Column(name = "second_name")
    @Setter @Getter private String secondName;

    @Column(name = "phone_number")
    @Setter @Getter private String phoneNumber;

    @Column(name = "hometown")
    @Setter @Getter private String hometown;

    @Column(name = "birth_date")
    @Setter @Getter private Date birthDate;

    @Column(name = "description")
    @Setter @Getter private String description;

    @Column(name = "car_model")
    @Setter @Getter private String carModel;

    @Column(name = "photo_url")
    @Setter @Getter private String photoUrl;
}