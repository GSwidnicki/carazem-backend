package com.carazem.search;

public class SearchRequestDto {
    private String cityFrom;
    private String cityTo;
    private String dataFrom;

    public SearchRequestDto(String cityFrom, String cityTo, String dataFrom) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.dataFrom = dataFrom;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
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
