package intro_to_java.practice_02;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр
// и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения
// задачи использовать декомпозицию.

import java.util.Scanner;

public class Task2_4_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N = scanner.nextInt();
        System.out.println("Количество вычитаний и заданного числа:");
        System.out.println(countSubtraction(N));
    }

    public static int countSubtraction(int num) {
        int count = 0;
        int subtract = findSum(num);
        while (num > 0) {
            num -= subtract;
            count++;
        }
        return count;
    }

    public static int findSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
