package com.carazem.ride.dto;

import com.carazem.ride.Ride;

import java.math.BigInteger;
import java.util.Date;

public class SearchUserResponseDto {

    private String cityFrom;
    private String cityTo;
    private Date rideDate;
    private BigInteger price;

    public SearchUserResponseDto() {
    }

    public SearchUserResponseDto(String cityFrom, String cityTo, Date rideDate, BigInteger price) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.rideDate = rideDate;
        this.price = price;
    }

    public SearchUserResponseDto(Ride ride) {
        this.cityFrom = ride.getCityFrom();
        this.cityTo = ride.getCityTo();
        this.rideDate = ride.getRideDate();
        this.price = ride.getPrice();
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

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
