package com.vinicius_grandi.ood;

public class DeepComparator {
    public static void main(String[] args) {
        User userA = new User("Tiago", "Vonntoheim");
        User userB = new User("Tiago", "Vonntoheim");
        System.out.println(userA.toString(true));
        System.out.println(userB.toString(true));

        System.out.println(userA.hashCode());
        System.out.println(userB.hashCode());

        // default equals is using the hash code during the comparison
        System.out.println(userA.equals(userB));
    }
}
