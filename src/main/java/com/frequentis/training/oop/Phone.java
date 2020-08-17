package com.frequentis.training.oop;

public class Phone implements ContactData {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return " Phone number: " + number;
    }
}
