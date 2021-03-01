package Practice2;

// Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное)

import java.util.Scanner;

public class Task2_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите чётный порядок матрицы: ");
        int n = scanner.nextInt();

        // Создаём и формируем матрицу по образцу
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < matrix[i].length - i) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
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
