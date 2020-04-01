package com.gmail.shonen1988;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /**
     * Найти сумму неповторяющихся элементов в используя минимальное количество памяти
     */

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(4);

        int size = list.size();
        int sum = 0;
        List<Integer> listTwo = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            boolean isNotUnique = false;
            for (int j = 0; j < size; j++) {
                if (i != j && list.get(i) == list.get(j)) {
                    isNotUnique = true;
                    break;
                }
            }
            if (!isNotUnique) {
                listTwo.add(list.get(i));
                sum+= list.get(i);
            }
        }
        System.out.println(sum);
        print(listTwo);

    }
    public static void print (List<Integer>list){
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
}
