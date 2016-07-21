package com.carazem.search;

import java.math.BigInteger;

public class SearchResponseDto {

    private String cityFrom;
    private String cityTo;
    private String date;
    private String driverName;
    private String driverSurname;
    private BigInteger price;

    public SearchResponseDto(String cityFrom, String cityTo, String date, String driverName, String driverSurname, BigInteger price) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.date = date;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.price = price;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
