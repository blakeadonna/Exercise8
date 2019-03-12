package com.blakey.exercise8;
import java.util.*;

class Contacts{
    private String name;
    private String email;

    public Contacts(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact | " +
                "Name: " + getName() +
                ", Email: " + getEmail();
    }
}

class Business extends Contacts{
    private String phone;

    public Business(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Business | " +
                "Name: " + getName() +
                ", Email: " + getEmail() +
                ", Phone: " + phone;
    }
}

class collection {

    public String addContact(Contacts addMeToList) {

        List<String> add = new ArrayList<>();
        add.add(String.valueOf(addMeToList));
        for(String items: add){
            System.out.println(items);
        }
        return null;
    }
}
public class Main {

    public static void main(String[] args) {

        Contacts c0 = new Business("Kaede Takagaki", "infinote@chaldea.net","714-345-8578");
        collection p1 = new collection();

        Contacts c1 = new Contacts("Kaede Takagaki", "koikaze@chaldea.net");

        Contacts b1 = new Business("Yui Ootsuki", "gotsumethunder@chaldea.net","714-535-4311");


        collection group = new collection();
        group.addContact(c0);
        group.addContact(c1);
        group.addContact(b1);

    }
}