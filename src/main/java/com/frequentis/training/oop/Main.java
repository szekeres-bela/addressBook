package com.frequentis.training.oop;

        import java.io.IOException;
        import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Creez contacte;
        ContactData email = new Email("example@frequentis.ro");
        ContactData number = new Phone( "0771313131");
        ArrayList<ContactData> contactDataList = new ArrayList<ContactData>();
        contactDataList.add(email);
        contactDataList.add(number);
        Contact bela = new Contact("bela", contactDataList);
        Contact catalin = new Contact("catalin", contactDataList);
        //System.out.println(bela.toString());
        //Le adaug in agenda:
        AddressBook addressBook = new AddressBook();
        addressBook.add(bela);
        addressBook.add(catalin);
        System.out.println("\nAGENDA INAINTE DE MODIFICARE:   ");
        System.out.println(addressBook.toString());
        //Caut contactul Bela:
        System.out.println("\nCAUTARE DUPA NUMELE BELA:   ");
        System.out.println(addressBook.find("bela"));
        //Sterg un contact:
        addressBook.delete("bela");
        System.out.println("\nSTERGEREA CONTACTULUI BELA:   ");
        System.out.println(addressBook.toString());
        //Salvare in fisier:
        Storage storage = new Storage();
        boolean store = storage.store(addressBook);
        if(store) {
            System.out.println("\n STORED \n");
        } else {
            System.out.println("Error in storing.");
        }
        //Creez o agenda noua, si citesc din fisier:
        AddressBook addressBookLoaded = new AddressBook();
        addressBookLoaded = storage.load();
        System.out.println("AGENDA INCARCATA:    ");
        System.out.println(addressBookLoaded.toString());
    }
}
