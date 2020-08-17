package com.frequentis.training.oop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contact implements Serializable {
    private String name;
    private List<ContactData> data;

    public Contact(String name, ArrayList<ContactData> data) {
        this.name = name;
        if(data == null) {
            this.data = new ArrayList<ContactData>();
        } else {
            this.data = data;
        }
    }

    public String getName() {
        return name;
    }

    public List<ContactData> getData() {
        return data;
    }

    public void addContactData(ContactData contactData) {
        data.add(contactData);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name +
                ", data=" + data +
                '}';
    }
}
