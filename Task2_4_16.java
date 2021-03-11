package intro_to_java.practice_02;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечётные
// цифры. Определить также, сколько чётных цифр в найденной сумме. Для решения задачи
// использовать декомпозицию.

import java.util.Scanner;

public class Task2_4_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество знаков для чисел: ");
        int n = scanner.nextInt();
        long sum = oddSum(n);
        System.out.println("Сумма чисел с нечётными цифрами: " + sum);
        System.out.println("Количество чётных чисел в сумме: " + howManyEven(sum));
    }

    public static long oddSum(int n) {
        long sum = 0;
        int firstNum = (int) Math.pow(10, n - 1);
        int lastNum = (int) Math.pow(10, n);
        for (int i = firstNum; i < lastNum; i++) {
            if (isOdd(i, n)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int howManyEven(long num) {
        int count = 0;
        while (num != 0) {
            if (num % 10 % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static boolean isOdd(int num, int length) {
        int[] figures = retrieveFigure(num, length);
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] retrieveFigure(int num, int length) {
        int[] figures = new int[length];
        int index = 0;
        while (num != 0) {
            figures[index] = num % 10;
            num /= 10;
            index++;
        }
        return figures;
    }
}
