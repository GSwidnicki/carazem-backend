package com.carazem.ride.dto;

import org.springframework.format.annotation.DateTimeFormat;


import java.sql.Timestamp;
import java.util.Date;


public class SearchRequestDto {
    private String cityFrom;
    private String cityTo;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Timestamp rideDate;

    public SearchRequestDto(){}

    public SearchRequestDto(String cityFrom, String cityTo, Timestamp rideDate) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.rideDate = rideDate;
    }


    public Timestamp getRideDate() {
        return rideDate;
    }

    public void setRideDate(Timestamp rideDate) {
        this.rideDate = rideDate;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }
}
