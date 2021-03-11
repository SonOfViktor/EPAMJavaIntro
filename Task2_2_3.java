package intro_to_java.practice_02;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Task2_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int line = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();

        // Создание и заполнение матрицы
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println();

        System.out.println("Первоначальная матрица");
        for (int[] arr : matrix) {
            for (int el : arr) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Введите номер строки, которую нужно вывести: ");
        int k = scanner.nextInt();
        System.out.println("Строка №" + k + ": ");
        for (int j = 0; j < matrix[k].length; j++) {
            System.out.print(matrix[k][j] + " ");
        }
        System.out.println();

        System.out.print("Введите номер столбца, который нужно вывести: ");
        int p = scanner.nextInt();
        System.out.println("Столбец №" + p + ": ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p] + " ");
        }
    }
}
