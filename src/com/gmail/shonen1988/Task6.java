package com.gmail.shonen1988;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task6 {
    /**
     * LinkedList:
     * Научится добавлять элементы в конец списка
     * Распечатать список в обратном порядке
     * Научится добавлять элемент в заданную позицию
     * Научится сумму четных элементов списка
     * Найти индекс последнего упоминания элемента А в списке
     * Научится менять элементы в списке по двум разным индексам (местами, не используя get)
     * копировать в третий список попеременно элементы с других двух списков (например первый массив - a1a2a3, второй - b1b2b3, третий - a1b1a2b2a3b3)
     * (доп. Условие - нельзя использовать .get(index))
     * Сделать функцию которая LinkedList превращает в ArrayList
     */

    public static void addToLast(LinkedList<Integer> list, int n) {
        list.add(list.size(), n);
    }

    public static void reversePrint(LinkedList<Integer> list) {
        int size = list.size() - 1;
        for (int i = size; i >= 0; i--) {
            System.out.printf("%-2d", list.get(i));
        }
    }

    public static void addElemToPosition(LinkedList<Integer> list, int index, int elem) {
        list.add(index, elem);
    }

    public static void evenSum(LinkedList<Integer> list) {
        int sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);
    }

    public static int lastIndexOf(LinkedList<Integer> list, int element) {
        return list.lastIndexOf(element);
    }

    public static void changePlaces(LinkedList<Integer> list, int indexOne, int indexTwo) {
        ListIterator<Integer> listIterOne = list.listIterator(indexOne);
        ListIterator<Integer> listIterTwo = list.listIterator(indexTwo);
        int k = listIterOne.next();
        int b = listIterTwo.next();
        list.set(indexOne, b);
        list.set(indexTwo, k);
    }

    public static LinkedList<Integer> copyWithIterator(LinkedList<Integer> listOne, LinkedList<Integer> listTwo) {
        LinkedList<Integer> listThree = new LinkedList<>();
        int n = listOne.size() + listTwo.size();
        ListIterator<Integer> listIteratorOne = listOne.listIterator();
        ListIterator<Integer> listIteratorTwo = listTwo.listIterator();
        for (int i = 0; i < n; i++) {
            if (listIteratorTwo.hasNext() && i % 2 != 0) {
                listThree.add(i, listIteratorTwo.next());
            } else {
                listThree.add(i, listIteratorOne.next());
            }
        }
        return listThree;
    }

    public static ArrayList<Integer> linkedToArray(LinkedList<Integer> list) {
        ArrayList<Integer> integers = new ArrayList<>(list);
        return integers;
    }
    public static ArrayList<Integer> linkedToArrayAlt(LinkedList<Integer> list) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(list);
        return integers;
    }

}
