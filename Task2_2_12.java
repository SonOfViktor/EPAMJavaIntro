package Practice2;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;
import java.util.Scanner;

public class Task2_2_12 {
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

        System.out.println("Отсортированные строки матрицы от меньшего к большему: ");
        matrix.sortMinToMax();
        matrix.showMatrix();
        System.out.println();

        System.out.println("Отсортированные строки матрицы от большего к меньшему: ");
        matrix.sortMaxToMin();
        matrix.showMatrix();
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

        // Так как в следующей теме будет подробно рассмотрены сортировки
        // для решения задачи использовался вспомогательный класс
        public void sortMinToMax() {
            for (int i = 0; i < twoArray.length; i++) {
                Arrays.sort(twoArray[i]);
            }
        }

        public void sortMaxToMin() {
            int[] helpArray;
            for (int i = 0; i < twoArray.length; i++) {
                helpArray = Arrays.copyOf(twoArray[i], twoArray[i].length);
                Arrays.sort(helpArray);
                for (int j = 0; j < helpArray.length; j++) {
                    twoArray[i][j] = helpArray[helpArray.length - 1 - j];
                }
            }
        }
    }
}
