package com.vinicius_grandi.ood;

abstract class Person {
    String firstName;
    String lastName;
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class User extends Person {
    private int followers;
    private int following;

    public void follow() {
        //
    }
    User(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
