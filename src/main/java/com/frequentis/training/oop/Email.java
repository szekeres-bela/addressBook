package com.frequentis.training.oop;

public class Email implements ContactData {
    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return " Email address: " + emailAddress;
    }
}
