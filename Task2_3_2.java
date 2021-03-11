package intro_to_java.practice_02;

// Даны две последовательности a1 <= a2 <= ... <= aN и b1 <= b2 <= ... <= bM. Образовать
// из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер первого массива: ");
        int size1 = scanner.nextInt();
        System.out.println("Введите размер второго массива: ");
        int size2 = scanner.nextInt();

        int[] firstArr = new int[size1 + size2];
        int[] secondArr = new int[size2];

        for (int i = 0; i < firstArr.length; i++) {
            if (i < firstArr.length - secondArr.length) {
                firstArr[i] = (int) (Math.random() * 100);
                if (Math.random() < 0.5) {
                    firstArr[i] *= -1;
                }
            } else {
                firstArr[i] = 100;
            }
        }

        for (int j = 0; j < secondArr.length; j++) {
            secondArr[j] = (int) (Math.random() * 100);
            if (Math.random() < 0.5) {
                secondArr[j] *= -1;
            }
        }

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        System.out.println("Изначальный первый массив:");
        for (int el : firstArr) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Изначальный второй массив:");
        for (int el : secondArr) {
            System.out.print(el + " ");
        }
        System.out.println();

        int first = firstArr.length - secondArr.length - 1;
        int second = secondArr.length - 1;
        int common = firstArr.length - 1;
        while (common >= 0) {
            if (first < 0 || secondArr[second] > firstArr[first]) {
                firstArr[common] = secondArr[second];
                second--;
                if (second < 0)
                    break;
            } else {
                firstArr[common] = firstArr[first];
                first--;
            }
            common--;
        }

        System.out.println("Соединённый массив:");
        for (int el : firstArr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}

