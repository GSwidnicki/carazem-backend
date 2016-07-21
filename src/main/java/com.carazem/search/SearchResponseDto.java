package com.carazem.search;

import java.math.BigInteger;

public class SearchResponseDto {

    private String cityFrom;
    private String cityTo;
    private String date;
    private String DriverName;
    private String DriverSurname;
    private BigInteger Price;

    public SearchResponseDto(String cityFrom, String cityTo, String date, String driverName, String driverSurname, BigInteger price) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.date = date;
        DriverName = driverName;
        DriverSurname = driverSurname;
        Price = price;
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
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getDriverSurname() {
        return DriverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        DriverSurname = driverSurname;
    }

    public BigInteger getPrice() {
        return Price;
    }

    public void setPrice(BigInteger price) {
        Price = price;
    }
}
