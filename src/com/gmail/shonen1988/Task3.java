package com.gmail.shonen1988;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    /**
     * Найти минимальное нечетное число в списке
     */
    public static void main(String[] args) {
        List<Integer>listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        print(listOne);
        System.out.println();
        minOddNumber(listOne);
    }
    public static void minOddNumber(List<Integer> one) {
        int min = one.get(0);
        int n = one.size();
        for (int i = 1; i < n; i++) {
            if ((one.get(i) % 2 != 0) && (one.get(i) < min)) {
                min = one.get(i);
            }
        }
        System.out.println(min);
    }
    public static void print (List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
