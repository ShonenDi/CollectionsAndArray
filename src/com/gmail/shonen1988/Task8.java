package com.gmail.shonen1988;

import java.util.Scanner;

public class Task8 {
    /**
     * Задачки на заполнение матриц
     * <p>
     * 1. По двум введенным целочисленным значениям, первое - строки, второе - столбцы,
     * создать матрицу и постолбцово заполнить её целочисленными значениями в порядке убывания начиная с
     * (число ячеек в матрице -1) и заканчивая нулём.
     * <p>
     * . Есть матрица 3 на 4. Заполнить матрицу построчно числами Фибоначчи.
     *
     * Общее условие для задач 3-6: есть матрица 10 на 10. Заполнить матрицу целочисленными значениями по возрастанию.
     *
     *  Старт в [0.0](от начала по спирали)
     *
     *  Старт в [0,0](от начала змейкой)
     *
     *  Старт в [10,10] (змейкой по диагонали)
     *
     *  Старт в [5,5](от центра по спирали)
     */

    public static void main(String[] args) {
//        fillMatrixTwo();
//        fillDiagSnake();
        fillMultArr6();
    }
    public static int[][] fillArr(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of your array, n - string, m - column");
        System.out.println("Enter number of string 'N' ");
        int n = sc.nextInt();
        System.out.println("Enter number of column 'M' ");
        int m = sc.nextInt();
        a = new int[n][m];
        int cell = n * m;
        int fill = cell - 1;
        int l1 = a.length;
        for (int i = 0; i < l1; i++) {
            int l2 = a[i].length;
            for (int j = 0; j < l2; j++) {
                a[j][i] = fill;
                fill--;
            }
        }
        return a;

    }


    public static int[][] fibonacciFill(int[][] a) {
        int size1 = a.length;
        a[0][0] = 1;
        a[0][1] = 1;
        for (int i = 0; i < size1; i++) {
            int size2 = a[i].length;
            for (int j = 2; j < size2; j++) {
                a[i][j] = a[i][j - 1] + a[i][j - 2];
                if (j == size2 - 1 && i != 0) {
                    a[i][0] = a[i - 1][size2 - 1] + a[i - 1][size2 - 2];
                    a[i][1] = a[i][0] + a[i - 1][size2 - 1];
                    for (int k = 2; k < size2; k++) {
                        a[i][k] = a[i][k - 1] + a[i][k - 2];
                    }

                }
            }

        }

        return a;
    }

    public static void fillMatrixOne (){
        int n = 10;
        int lim = n;
        int col = 0, raw = 0, val = 0;
        int[][] a = new int[n][n];
        int sqrcel =n*n;
        for (int cel = 0; val < sqrcel; cel++) {
            for (int i = 0; i < lim; i++) {
                if (i == lim - 1) {
                    a[raw++][col] = val++;
                    lim--;
                    break;
                }
                a[raw][col++] = val++;
            }
            for (int j = 0; j < lim; j++) {
                if (j == lim - 1) {
                    a[raw][col--] = val++;
                    break;
                }
                a[raw++][col] = val++;
            }
            for (int k = 0; k < n; k++) {
                if (k == lim - 1) {
                    a[raw--][col] = val++;
                    lim--;
                    break;
                }
                a[raw][col--] = val++;
            }
            for (int t = 0; t < lim; t++) {
                if (t == lim - 1) {
                    a[raw][col++] = val++;
                    break;
                }
                a[raw--][col] = val++;
            }

        }

    }

    public static void fillMatrixTwo(){
        int size = 10;
        int[][] a = new int[size][size];
        int col = 0;
        int n = size - 1;
        int sqrsize = size * size;
        for (int allMat = 0; allMat < sqrsize; allMat++) {
            if (col % 2 == 0) {
                for (int i = 0; i < size; i++) {
                    if (i == n) {
                        a[i][col] = allMat;
                        col++;
                        break;
                    }
                    a[i][col] = allMat++;
                }
            } else {
                for (int j = n; j >= 0; j--) {
                    if (j == 0) {
                        a[j][col] = allMat;
                        col++;

                        break;
                    }
                    a[j][col] = allMat;
                    allMat++;
                }
            }
        }
        printMultArr(a);
    }

    private static void printMultArr(int[][] a) {
        int length = a.length;
        
        for (int i = 0; i < length; i++) {
            int length1 = a[i].length;
            for (int j = 0; j <length1 ; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void fillDiagSnake(){
        int n = 10;
        int[][] a = new int[n][n];
        int count = 0;
        int raw = n - 1;
        int col = n - 1;
        int value = 0;
        int lim = 2 * n;
        for (int i = 0; i < lim; i++) {
            if (i < n) {
                if (i % 2 == 0) {
                    for (int j = 0; j < count + 1; j++) {
                        if (j == count) {
                            a[raw][col--] = value++;
                            count++;
                            break;
                        }
                        a[raw++][col--] = value++;
                    }
                } else {
                    for (int k = 0; k < count + 1; k++) {
                        if (k == count) {
                            a[raw--][col] = value++;
                            count++;
                            break;
                        }
                        a[raw--][col++] = value++;
                    }
                }
            }
            if (i >= n) {
                if (i == n) {
                    raw++;
                    col--;
                    count--;
                }
                if (i % 2 == 0) {
                    for (int j = 0; j < count; j++) {
                        if (j == count - 1) {
                            a[raw--][col] = value++;
                            count--;
                            break;
                        }
                        a[raw++][col--] = value++;
                    }
                } else {
                    for (int k = 0; k < count; k++) {
                        if (k == count - 1) {
                            a[raw][col--] = value++;
                            count--;
                            break;
                        }
                        a[raw--][col++] = value++;
                    }
                }
            }
        }
        printMultArr(a);

    }

    public static void fillMultArr6(){
        int n = 10;
        int[][] a = new int[n][n];
        int value = 1;
        a[n / 2][n / 2] = 0;
        int raw = (n / 2);
        int col = n / 2;
        int cel = n * n;
        int lim = 1;
        for (int allMat = 0; value < cel; allMat++) {
            --raw;
            for (int j = 0; j < lim; j++) {
                if (j == lim - 1 || value == cel) {
                    a[raw][col--] = value++;
                    break;
                }
                a[raw][col] = value++;
                raw--;
            }
            for (int i = 0; i < lim; i++) {
                if (i == lim - 1 || value == cel) {
                    a[raw++][col] = value;
                    value++;
                    break;
                }
                a[raw][col] = value;
                col--;
                value++;
            }
            lim++;
            for (int k = 0; k < lim; k++) {
                if (lim == n) {
                    --lim;
                }
                if (k == lim - 1 || value == cel) {
                    a[raw][col++] = value;
                    value++;
                    break;
                }
                a[raw++][col] = value++;
            }
            for (int f = 0; f < lim; f++) {
                if (value == cel) {
                    break;
                }
                if (f == lim - 1 || value == cel) {
                    a[raw][col] = value;
                    value++;
                    lim++;
                    break;
                }
                a[raw][col++] = value++;
            }
        }

        printMultArr(a);

    }

    }
