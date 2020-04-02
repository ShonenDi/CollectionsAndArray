package com.gmail.shonen1988;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    /**
     * ArrayList:
     * Скопировать в третий список попеременно элементы с других двух списков (например первый массив - a1a2a3, второй - b1b2b3, третий - a1b1a2b2a3b3
     * +хардкор режим, надо чтоб работало и для случая когда массивы разной длины, в итоге должно выйти a1b1a2b2b3b4b5 или a1b1a2a3a4
     */

    public static void main(String[] args) {
        List<Integer>listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        System.out.println(listOne.toString());
        List<Integer>listTwo = new ArrayList<>();
        listTwo.add(6);
        listTwo.add(7);
        listTwo.add(8);
        listTwo.add(9);
        listTwo.add(10);
        List<Integer>listThree = new ArrayList<>();
        listThree.add(6);
        listThree.add(7);
        listThree.add(8);
        System.out.println(listThree.toString());

//        System.out.println(copyArr(listOne,listTwo).toString());
        System.out.println(copyArrHardcore(listOne,listThree).toString());
    }
    public static List<Integer> copyArr(List<Integer> one, List<Integer> two) {
        ArrayList<Integer> three = new ArrayList<>();
        int n = one.size() + two.size();
        for (int i = 0; i < n; i++) {
            int m = i / 2;
            if (i % 2 != 0) {
                three.add(i, two.get(m));
            } else {
                three.add(i, one.get(m));
            }
        }
        return three;
    }
    public static List<Integer> copyArrHardcore(List<Integer> one, List<Integer> two) {
        ArrayList<Integer> three = new ArrayList<>();
        int n = one.size() + two.size();
        int m = one.size();
        int k = two.size();

        for (int i = 0,j=0; i < n; i++,j++) {
            int d = i/2;
            if ((i % 2 != 0) && (d < k)) {
                three.add(i, two.get(d));
            } else if (((i % 2) == 0) && (d < m)) {
                three.add(i, one.get(d));
            }
        }
        return three;
    }

}


