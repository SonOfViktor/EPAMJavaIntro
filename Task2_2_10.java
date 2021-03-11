package intro_to_java.practice_02;
// Найти положительные элементы главной диагонали квадратной матрицы.

import java.util.Scanner;

public class Task2_2_10 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int line = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();

        matrix.createMatrix(line, column);
        System.out.println();

        System.out.println("Сформированая матрица: ");
        matrix.showMatrix();
        System.out.println();

        matrix.pstvDiagonalEl();
    }

    static class Matrix {
        int[][] twoArray;

        public void createMatrix(int line, int column) {
            twoArray = new int[line][column];
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    twoArray[i][j] = (int) (Math.random() * 100);
                    if (Math.random() < 0.5) {
                        twoArray[i][j] *= -1;
                    }
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

        public void pstvDiagonalEl() {
            for (int i = 0, j = 0; i < twoArray.length; i++, j++) {
                if (twoArray[i][j] > 0) {
                    System.out.print(twoArray[i][j] + " ");
                }
            }
        }
    }
}
