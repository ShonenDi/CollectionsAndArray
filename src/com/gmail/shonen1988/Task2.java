package com.gmail.shonen1988;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /**
     * Развернуть коллекцию в обратную сторону
     */


    public static void main(String[] args) {

        List<Integer>listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        print(listOne);
        List<Integer>listTwo = new ArrayList<>();
        System.out.println();
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(4);
        listTwo.add(5);
        listTwo.add(6);
        print(listTwo);
        System.out.println();
        print(listRevers(listOne));
        System.out.println();
        print(listRevers(listTwo));
    }
    public static void print (List<Integer> list){
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> listRevers(List<Integer> one) {
        int n = one.size();
        int half =n/2;
        for (int i = 0; i < half; i++) {
            int temp = one.set(i, one.get(i));
            one.set(i, one.get(n-1 - i));
            one.set(n-1 - i, temp);
        }
        return one;
    }

}
