package com.example.SpringSecurityDemo.model;

import java.util.Objects;

public class City {
    private String cityName;
    private String code;
    private String state;

    public City(String cityName, String code, String state) {
        this.cityName = cityName;
        this.code = code;
        this.state = state;
    }

    public City() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(getCityName(), city.getCityName()) &&
                Objects.equals(getCode(), city.getCode()) &&
                Objects.equals(getState(), city.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityName(), getCode(), getState());
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", code='" + code + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
