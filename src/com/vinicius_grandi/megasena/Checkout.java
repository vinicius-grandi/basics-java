package com.vinicius_grandi.megasena;

// scope visibility modifier
// public ---
public class Checkout {
    // x has default visibility, which allows only classes in the same package scope to access it
    static int x;

    // public modifier allows the variable to be imported by any class
    public static int y;

    // private modifier allows only the current class to access this variable's reference
    private static int z;

    // protected modifier allows only the children classes to access the variable's reference
    protected static int beta;

    public static void main(String[] args) {
        x = 3;
        z = 5;
        sum(1, 2);
    }

    public static void sum(int a, int b) {
        System.out.println(x);
        System.out.println(a + b);
    }
}

class MasterCard extends Checkout {
    public static void main(String[] args) {
        beta = 2;
        System.out.println(beta);
    }
}
