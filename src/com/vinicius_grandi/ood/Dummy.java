package com.vinicius_grandi.ood;

public class Dummy {
    public static void main(String[] args) {
        User userA = new User("Jaime");
        User userB = new User("Pauli");
        userA.incrementCount();
        System.out.println(User.getCount());
        userB.incrementCount();
        System.out.println(User.getCount());
    }
}
