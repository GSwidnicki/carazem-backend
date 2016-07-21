package com.carazem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rides")
public class Ride {

    public Ride() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ride_id")
    @Setter @Getter private int id;

    @Column(name = "city_from")
    @Setter @Getter private String cityFrom;

    @Column(name = "city_to")
    @Setter @Getter private String cityTo;

    @Column(name = "ride_date")
    @Setter @Getter private Date rideDate;

    @Column(name = "driver_id")
    @JoinColumn(name = "user_id")
    @Setter @Getter private User driver;

    @Column(name = "seats")
    @Setter @Getter private int seats;

}

