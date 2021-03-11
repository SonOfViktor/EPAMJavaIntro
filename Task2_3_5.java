package intro_to_java.practice_02;

// Дана последовательность a1, a2, aN. Требуется переставить числа в порядке возрастания.
// Делается это следующим образом. Пусть a1, a2, aN - упорядоченная последовательность, т.е
// a1 <= a2 <= aN. Берется следующее число aI+1 и вставляется в последовательноть так,
// чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор,
// пока все элементы от I + 1 до n не будут перебраны. Место помещения очередного
// элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный
// поиск оформить в виде отдельной функции.

import java.util.Scanner;

public class Task2_3_5 {
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


        System.out.println("Изначальный массив: ");
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            int index = binarySearch(array, i);
            if (i >= index) {
                int temp = array[i + 1];
                for ( ;i >= index; i--) {
                    array[i + 1] = array[i];
                }
                array[index] = temp;
            }
        }

        System.out.println("Отсортированный массив: ");
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    private static int binarySearch(int[] array, int high) {
        int num = array[high + 1];
        int low = 0;
        if (num > array[low] && num < array[high]) {
            while (low <= high) {
                int mid = (low + high) / 2;
                int guess = array[mid];
                if (guess == num)
                    return mid;
                if (guess > num) {
                    if (num >= array[mid - 1])
                        return mid;
                    high = mid - 1;
                } else {
                    if (num < array[mid + 1])
                        return (mid + 1);
                    low = mid + 1;
                }
            }
        }
        if (num <= array[low])
            return 0;
        else
            return ++high;
    }

}
