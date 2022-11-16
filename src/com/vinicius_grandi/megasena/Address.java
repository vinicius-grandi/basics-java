package com.vinicius_grandi.megasena;

public class Address {
    private static String[] notAllowedWords = {};
    private static void infiniteSum(int ...numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    // immutable variables or constants
    public static void main(String[] args) {
        final double PI = 3.14159;
    }

    private static int getHouseNum(String a) {
        int houseNum = Integer.parseInt(a);
        double x = 10.10;
        float y = (float) x / 2;
        String beta = "10";
        return houseNum;
    }

    private static String getStreet(String street) {
        var trimmedStreet = street.trim();

        // string.length() shows the length
        if (street.length() > 100) {
            throw new Error("your street's name exceeded my database's plan dude");
        }

        // string.indexOf(occurrence) returns the occurrence's index or -1
        // string.replace(occurrence, newValue) returns a new string replacing the occurrence
        trimmedStreet = trimmedStreet.indexOf("street") > 1 ? trimmedStreet.replace("street", "st.") : trimmedStreet;

        for (String notAllowedWord : notAllowedWords) {
            // string.contains(val) returns true if the val is contained in string
            if (trimmedStreet.contains(notAllowedWord)) {
                throw new Error("Watch your tongue!".toUpperCase());
            }
        }

        if (trimmedStreet.equals("null")) {
            throw new Error("you discovered an easter egg error OMG");
        }

        return trimmedStreet;
    }
}
