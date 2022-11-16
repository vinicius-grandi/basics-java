package com.vinicius_grandi.ood;

import java.util.ArrayList;
import java.util.List;

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
        var guitar = new Guitar("fender", 6);
        return guitar;
    }

    private static void getAllGuitars() {
        // type List<> is used to create a list with undetermined length
        List<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 10; i += 1) {
            guitars.add(new Guitar("Fender", i));
        }

        for (Guitar guitar : guitars) {
            System.out.println(guitar.getBrand());
        }
    }

    private static void getAllUsers() {
        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            User actual = new User("nome" + i, "sobrenome" + i);
            users[i] = actual;
        }
        for (User user : users) {
            System.out.println(user.getFullName());
        }
    }

    public static void main(String[] args) {
        User userA = new User("Ligma", "Ballz");
        User userB = new User("Paula", "Tejando");

        login(userA);
        login(userB);

        logout(userA);
        logout(userB);
        getAllGuitars();
    }
}
