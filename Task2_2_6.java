package intro_to_java.practice_02;

// Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное).

import java.util.Scanner;

public class Task2_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите чётный порядок матрицы: ");
        int n = scanner.nextInt();

        // Создаём и формируем матрицу по образцу
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < matrix.length / 2) {
                    matrix[i][j] = (j >= i && j < matrix[i].length - i) ? 1 : 0;
                } else {
                    matrix[i][j] = matrix[matrix.length - i - 1][j];
                }
            }
        }

        System.out.println("Сформированная матрица: ");
        for (int[] arr : matrix) {
            for (int el : arr) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
}
