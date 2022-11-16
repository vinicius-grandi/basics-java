package com.vinicius_grandi.ood;

public class App {
    private static void login(User user) {
        System.out.println(user.getFullName() + " is logged in");
        user.setLogged(true);
    }

    private static void logout(User user) {
        System.out.println(user.getFullName() + " is logged out");
        user.setLogged(false);
    }

    private static Guitar createNewGuitar(String brand, int strings) {
        var guitar = new Guitar();
        guitar.brand = brand;
        guitar.strings = strings;
        return guitar;
    }

    public static void main(String[] args) {
        User userA = new User("Ligma", "Ballz");
        User userB = new User("Paula", "Tejando");

        login(userA);
        login(userB);

        logout(userA);
        logout(userB);
    }
}
