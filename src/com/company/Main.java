package com.company;

public class Main {
    public static void main(String[] args) {
        Integer mas[] = {2, 3, 4, 5};
        String mas2[] = {"2", "3", "4", "5"};
        System.out.println(mas.length);
        Lab<Integer> l = new Lab<>();
        System.out.println(l.convertation(mas));
        Lab<String> l2 = new Lab<>();
        System.out.println(l2.convertation(mas2));
    }
}
