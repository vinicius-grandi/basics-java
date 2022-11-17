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
    //constructor overflow
    Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "nonLastName";
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
    User(String firstName) {
        super(firstName);
    }

    public static void main(String[] args) {
        User userA = new User("Jaime");
        System.out.println(userA.getFullName());
    }

    public void setLogged(boolean logged) {
        if (isLogged) {
            System.out.println("The secret is your" + this.getLastName());
        }
        isLogged = logged;
    }
}
