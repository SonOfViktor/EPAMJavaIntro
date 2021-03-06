package Practice2;

// Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= aN. Требуется
// переставить числа в порядке убывания. Для этого сравниваются два соседних числа aI
// и aI+1. Если aI > aI+1, то делается перестановка. Так продолжается до тех пор, пока
// все элементы не станут расположены в порядке возрастания. Составить алгоритм
// сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3_4 {
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

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Изначальный массив:");
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
