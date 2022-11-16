package com.vinicius_grandi.ood;

public class Guitar {
    private String brand;
    private int strings;

    Guitar(String brand, int strings) {
        this.brand = brand;
        this.strings = strings;
    }
    public void play() {
        System.out.println("The guitar is playing lmao");
    }

    public String getBrand() {
        return this.brand;
    }
}
