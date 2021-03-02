package Practice2;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

import java.util.Scanner;

public class Task2_2_9 {
    public static void main(String[] args) {
        PositiveMatrix matrix = new PositiveMatrix();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int line = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();

        matrix.createMatrix(line, column);
        System.out.println();

        System.out.println("Первоначальная матрица: ");
        matrix.showMatrix();
        System.out.println();

        matrix.maxSumOfColumns();
    }

    static class PositiveMatrix {
        int[][] twoArray;

        public void createMatrix(int line, int column) {
            twoArray = new int[line][column];
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    twoArray[i][j] = (int) (Math.random() * 100);
                }
            }
        }

        public void showMatrix() {
            for (int[] arr : twoArray) {
                for (int el : arr) {
                    System.out.print(el + "\t");
                }
                System.out.println();
            }
        }

        public void maxSumOfColumns() {
            int[] helpArray = new int[twoArray.length];
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j <twoArray[i].length; j++) {
                    helpArray[j] += twoArray[i][j];
                }
            }

            for (int el : helpArray) {
                System.out.print(el + " ");
            }
            System.out.println();

            int maxSum = helpArray[0];
            for (int i = 1; i < helpArray.length; i++) {
                if (maxSum < helpArray[i]) {
                    maxSum = helpArray[i];
                }
            }
            System.out.println("Максимальная сумму столбцов матрицы: " + maxSum);
        }
    }
}
