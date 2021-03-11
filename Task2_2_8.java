package intro_to_java.practice_02;

// В числовой матрице поменять местами два столбца любых столбца, т.е все элементы одного
// столбца поставить на соответствующие им позиции другого, а его элементы второго
// переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task2_2_8 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int line = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();

        matrix.createMatrix(line, column);
        System.out.println();

        System.out.println("Первоначальная матрица: ");
        matrix.showMatrix();
        System.out.println();

        System.out.print("Введите номер первого столбца для замены: ");
        int first = scanner.nextInt();
        System.out.print("Введите номер второго столбца для замены: ");
        int second = scanner.nextInt();
        System.out.println();

        matrix.shuffleMatrix(first, second);
        System.out.println("Изменённая матрица");
        matrix.showMatrix();
    }

    static class Matrix {
        int[][] twoArray;

        public void createMatrix(int line, int column) {
            twoArray = new int[line][column];
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    twoArray[i][j] = (int) (Math.random() * 100);
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

        public void shuffleMatrix(int first, int second) {
            int[] helpArray = new int[twoArray.length];
            for (int i = 0; i < twoArray.length; i++) {
                helpArray[i] = twoArray[i][first];
                twoArray[i][first] = twoArray[i][second];
                twoArray[i][second] = helpArray[i];
            }
        }
    }
}
