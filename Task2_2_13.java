package intro_to_java.practice_02;

// Отсортировать столбцы матрицы по возрастанию и убыванию значении элементов.

import java.util.Arrays;
import java.util.Scanner;

public class Task2_2_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int line = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();

        Matrix matrix = new Matrix(line, column);
        System.out.println();

        System.out.println("Сформированая матрица: ");
        matrix.showMatrix();
        System.out.println();

        System.out.println("Отсортированные столбцы матрицы от меньшего к большему: ");
        matrix.sortMinToMax();
        matrix.showMatrix();
        System.out.println();

        System.out.println("Отсортированные столбцы матрицы от большего к меньшему: ");
        matrix.sortMaxToMin();
        matrix.showMatrix();
    }

    static class Matrix {
        int[][] twoArray;
        int[] helpArray;

        public Matrix(int line, int column) {
            twoArray = new int[line][column];
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    twoArray[i][j] = (int) (Math.random() * 100);
                    if (Math.random() < 0.5) {
                        twoArray[i][j] *= -1;
                    }
                }
            }
            helpArray = new int[twoArray.length];
        }

        public void showMatrix() {
            for (int[] arr : twoArray) {
                for (int el : arr) {
                    System.out.print(el + "\t");
                }
                System.out.println();
            }
        }

        // Так как в следующей теме будет подробно рассмотрены сортировки
        // для решения задачи использовался вспомогательный класс
        public void sortMinToMax() {
            for (int j = 0; j < twoArray[0].length; j++) {
                for (int i = 0; i < twoArray.length; i++) {
                    helpArray[i] = twoArray[i][j];
                }

                Arrays.sort(helpArray);
                for (int i = 0; i < twoArray.length; i++) {
                    twoArray[i][j] = helpArray[i];
                }
            }
        }

        public void sortMaxToMin() {
            for (int j = 0; j < twoArray[0].length; j++) {
                for (int i = 0; i < twoArray.length; i++) {
                    helpArray[i] = twoArray[i][j];
                }

                Arrays.sort(helpArray);
                for (int i = 0; i < twoArray.length; i++) {
                    twoArray[i][j] = helpArray[helpArray.length - 1 - i];
                }
            }
        }
    }
}
