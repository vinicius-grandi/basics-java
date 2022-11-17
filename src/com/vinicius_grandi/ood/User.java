package com.vinicius_grandi.ood;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

public class User extends Person {
    // static property is the same across all instances of User
    static private int count;
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

    public String toString() {
        return String.format("User {\n\tfirstName = %s;\n\tlastName = %s; \n}", getFirstName(),
                getLastName());
    }

    public String toString(boolean returnHash) {
        if (returnHash) {
            return super.toString();
        }
        return String.format("User {\n\tfirstName = %s;\n\tlastName = %s; \n}", getFirstName(),
                getLastName());
    }

    public static int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count += 1;
    }
}
