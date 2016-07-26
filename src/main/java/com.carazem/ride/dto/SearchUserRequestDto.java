package com.carazem.ride.dto;


import com.carazem.user.User;

import java.util.Date;

public class SearchUserRequestDto {

    private String cityFrom;
    private String cityTo;
    private Date rideDate;
    private User driver;

    public SearchUserRequestDto() {
    }

    public SearchUserRequestDto(String cityFrom, String cityTo, Date rideDate, User driver) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.rideDate = rideDate;
        this.driver = driver;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public Date getRideDate() {
        return rideDate;
    }

    public void setRideDate(Date rideDate) {
        this.rideDate = rideDate;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }
}
