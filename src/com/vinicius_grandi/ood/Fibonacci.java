package com.vinicius_grandi.ood;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static long fib(int n) {
        long current = 1;
        long prev = 0;
        for (int i = 1; i < n; i++) {
            long fn = current + prev;
            prev = current;
            current = fn;
        }
        return n == 0 ? 0 : current;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                int n = scanner.nextInt();
                if (n < 0) {
                    break;
                }
                System.out.println(fib(n));
            } catch (InputMismatchException e) {
                throw new Error("Please, type an integer");
            }
        }
    }
}
