package com.frequentis.training.oop;

import java.io.*;
import java.util.List;

public class Storage{

    public boolean store(AddressBook addressBook) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("AddressBook.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(addressBook.getContacts());
        out.close();
        fileOut.close();
        return true;
    }

    public AddressBook load() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("AddressBook.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        AddressBook addressBook = new AddressBook();
        addressBook.setContacts((List<Contact>) in.readObject());
        in.close();
        fileIn.close();
        return addressBook;
    }
}
