package Practice2;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import java.util.Scanner;

public class Task2_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок матрицы: ");
        int degree = scanner.nextInt();

        // Создание и заполнение матрицы
        int[][] matrix = new int[degree][degree];
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

        System.out.println("Вывод элементов матрицы по диагонали: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
