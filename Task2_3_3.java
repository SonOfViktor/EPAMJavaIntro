package intro_to_java.practice_02;

// Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= aN. Требуется
// переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве,
// начиная с первого, выбирается наибольший элемент и ставится на первое место, а
// первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
// Написать алгоритм сортировки выбором.

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер для массива: ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (Math.random() < 0.5) {
                array[i] *= -1;
            }
        }

        Arrays.sort(array);

        System.out.println("Изначальный массив:");
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            int max = array[i];
            int maxEl = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    max = array[j];
                    maxEl = j;
                }
            }
            array[maxEl] = array[i];
            array[i] = max;
        }

        System.out.println("Отсортированный массив:");
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
