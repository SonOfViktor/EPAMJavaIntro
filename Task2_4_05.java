package intro_to_java.practice_02;

// Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но
// больше всех других элементов).


import java.util.Arrays;
import java.util.Scanner;

public class Task2_4_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        fillArray(A);
        System.out.println("Массив:");
        showArray(A);
        System.out.print("Второе максимальное число: ");
        System.out.println(secondMax(A));
    }

    public static int secondMax(int[] array) {
        int max;
        int secondMax;
        if (array[0] >= array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (Math.random() < 0.5) {
                array[i] *= -1;
            }
        }
    }

    public static void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
