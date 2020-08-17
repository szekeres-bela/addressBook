package com.frequentis.training.oop;

public class Address implements ContactData {
    private String city;
    private String street;
    private int number;

    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}' + "\n";
    }
}
