package com.vinicius_grandi.megasena;

import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        String password = "123456";
        String passwordCloneReference = password;
        System.out.println(System.identityHashCode(password));
        System.out.println(System.identityHashCode(passwordCloneReference));

        System.out.println("Digite a sua senha: ");

        Scanner scanner = new Scanner(System.in);
        String passGuess = scanner.nextLine();

        System.out.println(password.equals(passGuess));
        password = "123456789";
        System.out.println(System.identityHashCode(passwordCloneReference));
        System.out.println(System.identityHashCode(password));
    }
}
