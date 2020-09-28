package com.company;

import java.util.LinkedList;

public class Lab<E> {
    LinkedList<E> l= new LinkedList<>();
    public String convertation(E[] mas){
        for(int i = 0;i<mas.length;i++){
            l.add(mas[i]);
        }
        return l.toString();
    }
}
