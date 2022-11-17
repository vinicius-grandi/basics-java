package com.vinicius_grandi.ood;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayMethods {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("nome" + i);
        }
        // Array.size() returns the array length
        for (String name : names) {
            // Array.get(i) returns the value from index
            System.out.println(name);
        }
        // Array.indexOf(val) searches for the val and return its index
        System.out.println(names.indexOf("nome1"));

        // Array.isEmpty() returns a true if array is empty and false, otherwise
        System.out.println(names.isEmpty());

        // Array.contains(val) searches for the val a boolean
        System.out.println(names.contains("nome2"));

        // it sorts the array
        // Collections.sort(names);
        Comparator<String> comparator = (
                o1,
                o2
        ) -> (int) o2.charAt(o1.length() -1) - (int) o1.charAt(o1.length() -1);
        names.sort(comparator);
        for (String name : names) {
            System.out.println(name);
        }

        // Array.clear() deletes all values from list
        names.clear();
    }
    static void createInfiniteArray(String str) {
        List<String> names = new ArrayList<>();
        names.add(str);
    }
    static void createInfiniteArray() {
        List<String> names = new ArrayList<>();
        names.add("nome1");
    }
}
