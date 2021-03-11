package intro_to_java.practice_02;

// Написать метод(методы) для нахождения наибольшего общео делителя и наименьшего
// общего кратного двух натуральных чисел.

import java.util.Scanner;

public class Task2_4_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int A = scanner.nextInt();
        System.out.println("Введите число B" );
        int B = scanner.nextInt();

        System.out.println("Наибольший общий делитель: " + NODRecursion(A, B));
        System.out.println("Наименьший общий кратный: " + NOK(A, B));
    }

    public static int NODRecursion(int a, int b) {
        if (a % b == 0)
            return b;
        return NODRecursion(b, a % b);
    }

    public static int NOK(int a, int b) {
        return (a * b / NODRecursion(a, b));
    }

}
