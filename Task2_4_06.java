package intro_to_java.practice_02;

// Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми

import java.util.Scanner;

public class Task2_4_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Числа являются взаимно простыми: " + isSimple(a, b, c));
    }

    public static String isSimple(int a, int b, int c) {
        int ab = NOD(a, b);
        return (NOD(ab, c) == 1) ? "да" : "нет";
    }

    public static int NOD(int a, int b) {
        if (a % b == 0)
            return b;
        return NOD(b, a % b);
    }
}
