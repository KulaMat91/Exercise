package com.sda.day1.EX5;

import java.util.Objects;

public class Adress {
    private String street;
    private String city;
    private int postCode;

    public Adress(){
    }

    public Adress(String street, String city, int postCode){
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

//    Klasa która kopiuje
    public Adress(Adress adress){
        this.street = adress.getStreet();
        this.city = adress.getCity();
        this.postCode = adress.getPostCode();
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // czy nie porownujemy tego samego obiektu
        if (o == null || getClass() != o.getClass()) return false; //
        Adress adress = (Adress) o; // castowanie do tego obiektu do Adress z Object
        return postCode == adress.postCode
                && Objects.equals(street, adress.street)
                && Objects.equals(city, adress.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, postCode);
    }
}
