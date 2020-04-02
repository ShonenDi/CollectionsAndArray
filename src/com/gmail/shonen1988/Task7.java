package com.gmail.shonen1988;

public class Task7 {
    /**
     * Задачки на работу с матрицами
     * Найти сумму всех неотрицательных чисел в матрице
     *
     * Есть матрица 4 на 7. Вывести 3 строку задом наперед
     *
     * Есть матрица 5 на 6. Отсортировать элементы в каждом столбце
     */

    public static void sumOfNonNegativeValues(int[][] a) {
        int sum = 0;
        int l = a.length;
        for (int i = 0; i < l; i++) {
            int l2 = a[i].length;
            for (int j = 0; j < l2; j++) {
                if (a[i][j] > 0) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println(sum);
    }


    public static void reverseThreeString(int[][] a) {
        int l = a[2].length;
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(a[2][i] + "\t");
        }
    }


    public static int[][] columnSort(int[][] a) {
        int l = a.length;
        int max;
        for (int i = 0; i < l; i++) {
            int l2 = a[i].length;
            for (int j = 0; j < l2; j++) {
                for (int k = i+1; k < l; k++) {
                    if (a[i][j] > a[k][j]) {
                        max = a[i][j];
                        a[i][j] = a[k][j];
                        a[k][j] = max;
                    }
                }
            }
        }
        return a;
    }


}


