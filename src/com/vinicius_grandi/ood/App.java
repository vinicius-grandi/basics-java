package com.vinicius_grandi.ood;

public class App {
    private static void login(User user) {
        System.out.println(user.firstName + " is logged in");
    }

    private static Guitar createNewGuitar(String brand, int strings) {
        var guitar = new Guitar();
        guitar.brand = brand;
        guitar.strings = strings;
        return guitar;
    }

    public static void main(String[] args) {
        User userA = new User("João", "Paulo");
        login(userA);

        User userB = new User("Paulaa", "Tejando");
        login(userB);
    }
}
