package intro_to_java.practice_02;

// Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр

import java.util.Scanner;

public class Task2_4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double A = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double B = scanner.nextDouble();
        whatLonger(A, B);
    }

    public static void whatLonger (double a, double b) {
        String A = String.valueOf(Math.abs(a));
        String B = String.valueOf(Math.abs(b));
        if (A.length() > B.length()) {
            System.out.println("У первого числа цифр больше.");
        } else if (A.length() < B.length()) {
            System.out.println("У второго числа цифр больше.");
        } else
            System.out.println("Количество цифр у чисел одинаково.");
    }

}
