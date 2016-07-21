package com.carazem.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "rides")
@ToString
public class Ride {

    public Ride() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ride_id")
    @Setter @Getter private Long id;

    @Column(name = "city_from")
    @Setter @Getter private String cityFrom;

    @Column(name = "city_to")
    @Setter @Getter private String cityTo;

    @Column(name = "ride_date")
    @Setter @Getter private Date rideDate;

    @OneToOne
    @JoinColumn(name = "driver_id")
    @Setter @Getter private User driver;

    @Column(name = "seats")
    @Setter @Getter private int seats;

    @Column(name = "price")
    @Setter @Getter private BigInteger price;

}

