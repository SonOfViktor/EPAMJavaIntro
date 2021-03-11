package intro_to_java.practice_02;

// Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= aN и
// b1 <= b2 <= bM. Требуется указать те места, на которые нужно вставлять элементы
// последовательности b1 <= b2 <= bM в первую последовательность так, чтобы новая
// последовательность оставалась возрастающей

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер для первого массива: ");
        int[] arrayA = new int[scanner.nextInt()];
        System.out.println("Введите размер для второго массива: ");
        int[] arrayB = new int[scanner.nextInt()];
        fillArray(arrayA);
        fillArray(arrayB);
        System.out.println("Первый массив:");
        showArray(arrayA);
        System.out.println("Второй массив:");
        showArray(arrayB);

        System.out.println("Индексы вставки:");
        int[] arrayAB = new int[arrayA.length + arrayB.length];
        for (int ab = 0, a = 0, b = 0; ab < arrayAB.length; ab++) {
            if (b < arrayB.length) {
                if (a >= arrayA.length || arrayB[b] < arrayA[a]) {
                    arrayAB[ab] = arrayB[b];
                    System.out.print(ab + " ");
                    b++;
                } else {
                    arrayAB[ab] = arrayA[a];
                    a++;
                }
            } else {
                arrayAB[ab] = arrayA[a];
                a++;
            }
        }
        System.out.println();
        System.out.println("Общий массив:");
        showArray(arrayAB);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (Math.random() < 0.5) {
                array[i] *= -1;
            }
        }
        Arrays.sort(array);
    }

    private static void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
