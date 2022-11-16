package com.vinicius_grandi.ood;

abstract class Person {
    final private String firstName;
    final private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + ' ' + lastName;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class User extends Person {
    private boolean isLogged;
    User(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setLogged(boolean logged) {
        if (isLogged) {
            System.out.println("The secret is your" + this.getLastName());
        }
        isLogged = logged;
    }
}
