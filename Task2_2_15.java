package intro_to_java.practice_02;

// Найдите наибольший элемент матрицы и замените все нечетные элементы на него.

import java.util.Scanner;

public class Task2_2_15 {
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

        System.out.print("Заменяем нечётный элемент на максимальное значение матрицы: ");
        matrix.replaceOddEl();
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

        public void replaceOddEl() {
            int maxElem = twoArray[0][0];
            for (int i = 0; i < twoArray[0].length; i++) {
                for (int j = 0; j < twoArray.length; j++) {
                    if (maxElem < twoArray[i][j]) {
                        maxElem = twoArray[i][j];
                    }
                }
            }
            System.out.println(maxElem);

            for (int i = 0; i < twoArray[0].length; i++) {
                for (int j = 0; j < twoArray.length; j++) {
                    if (twoArray[i][j] % 2 != 0) {
                        twoArray[i][j] = maxElem;
                    }
                }
            }
        }
    }
}
