package intro_to_java.practice_02;

// Сформировать квадратную матрицу порядка N по правилу A[I,J] = sin ((I^2 - J^2) / N)
// и подсчитать количество положительных элементов в ней.

import java.util.Scanner;

public class Task2_2_7 {
    public static void main(String[] args) {
        int positive = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок матрицы: ");
        int N = scanner.nextInt();

        // Создаём и формируем матрицу по образцу
        double[][] A = new double[N][N];
        for (int I = 0; I < A.length; I++) {
            for (int J = 0; J < A[I].length; J++) {
                A[I][J] = Math.sin((double) (I * I - J * J) / N);
                if (A[I][J] > 0){
                    positive++;
                }
            }
        }

        System.out.println("Сформированная матрица: ");
        for (double[] arr : A) {
            for (double el : arr) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов матрицы: " + positive);
    }
}
