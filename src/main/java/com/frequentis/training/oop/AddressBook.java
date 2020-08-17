package com.frequentis.training.oop;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<Contact>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public boolean delete(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if( contacts.get(i).getName().equals(name) ) {
                contacts.remove(contacts.get(i));
                return true;
            }
        }
        return false;
    }

    public Contact find(String name) {
        for (Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "AddressBook{" +
                "contacts=";
        for (int i = 0; i < contacts.size(); i++) {
            result = result + contacts.get(i).toString() + "\n";
        }
        result = result + '}';
        return result;
    }
}
