package intro_to_java.practice_02;

// Натуральное число, в записи которого n цифр, называется чилом Армстронга, если сумма
// его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга
// от 1 до k. Для решения этой задачи использовать декомпозицию.

import java.util.Scanner;

public class Task2_4_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число k: ");
        int k = scanner.nextInt();
        findArmstrong(k);
    }

    public static void findArmstrong(int k) {
        for (int i = 1; i < k; i++) {
            if (powAndSum(i) == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static double powAndSum(int num) {
        int[] figureArr = retrieveFigure(num);
        int power = countFigure(num);
        double sum = 0;
        for (int i = 0; i < figureArr.length; i++) {
            sum += Math.pow(figureArr[i], power);
        }
        return sum;
    }

    public static int[] retrieveFigure(int num) {
        int power = countFigure(num);
        int[] figures = new int[power];
        int index = 0;
        while (num != 0) {
            figures[index] = num % 10;
            num /= 10;
            index++;
        }
        return figures;
    }

    public static int countFigure(int num) {
        int count = 0;
        while(num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
