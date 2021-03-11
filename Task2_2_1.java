package intro_to_java.practice_02;

// Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего.

import java.util.Scanner;

public class Task2_2_1 {
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

        System.out.println("Нечётные столбцы с первым элементом больше последнего: ");
        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 != 0) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    for (int i = 0; i < matrix.length; i++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
