package intro_to_java.practice_01;

//  Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Task1_2_2 {
    public static void main (String[] args) {
        int minAB;
        int minCD;
        int max;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число c: ");
        int c = scanner.nextInt();
        System.out.print("Введите число d: ");
        int d = scanner.nextInt();

        // Первый способ
        minAB = (a < b) ? a : b;
        minCD = (c < d) ? c : d;
        max = (minAB > minCD) ? minAB : minCD;

        System.out.println("Искомое число равно " + max);

        // Второй способ
        max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Искомое число равно " + max);
    }
}
