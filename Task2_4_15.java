package intro_to_java.practice_02;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию

import java.util.Scanner;

public class Task2_4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество знаков для чисел: ");
        int n = scanner.nextInt();
        writeRisenNum(n);
    }

    public static void writeRisenNum(int n) {
        int firstNum = (int) Math.pow(10, n - 1);
        int lastNum = (int) Math.pow(10, n);
        int count = 0;
        for (int i = firstNum; i < lastNum; i++) {
            if (isRise(i)) {
                System.out.print(i + ", ");
                count++;
                if (count == 15) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        System.out.println("\b\b.");
    }

    public static boolean isRise(int num) {
        boolean risen = false;
        int[] figures = retrieveFigure(num);
        for (int i = figures.length - 1; i > 0; i--) {
            if (figures[i] >= figures[i - 1]) {
                risen = true;
            }
        }
        return !risen;
    }

    public static int[] retrieveFigure(int num) {
        int length = countFigure(num);
        int[] figures = new int[length];
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
