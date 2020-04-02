package com.gmail.shonen1988;

import java.util.List;

public class Task5 {
    /**
     * ArrayList:
     * Написать метод(не используя IsEmpty) который будет проверять пуст ли список
     * Написать метод, который будет заменять все вхождения элемента А в массив и заменять его на B
     */
    public static void myIsEmpty (List<Integer> one){
        if(one.size()==0){
            System.out.println("Your ArrayList is empty");
        }else {
            System.out.println("You ArrayList have " + one.size() + " elements");
        }
    }
    public static void replace(List<Integer> one, int a, int b) {
        int size = one.size();
        for (int i = 0; i < size; i++) {
            if (one.get(i) == a) {
                one.set(i, b);
            }
        }
        System.out.println(one.toString());
    }

}
