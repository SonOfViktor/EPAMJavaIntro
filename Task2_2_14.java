package Practice2;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причём в каждом столбце число единиц равно номеру столбца.
// Добавлю от себя, что если число m строк меньше номера n столбца, то
// заполнить такой столбец единицами.

import java.util.Scanner;

public class Task2_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int m = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int n = scanner.nextInt();

        Matrix matrix = new Matrix(m, n);
        System.out.println();
        matrix.showMatrix();
    }

    static class Matrix {
        int[][] twoArray;

        public Matrix(int line, int column) {
            twoArray = new int[line][column];
            for (int j = 0; j < twoArray[0].length; j++) {
                int count = 0;
                for (int i = 0; i < twoArray.length; i++) {
                    twoArray[i][j] = (count < j) ? 1 : 0;
                    if (twoArray[i][j] == 1) {
                        count++;
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
    }
}
