package intro_to_java.practice_02;

// Два простых числа называются "близнецами", если они отличаются друг от друга на 2
// (например, 41 и 43). Найти и напечатать все пары "близнецов" из отрезка [n, 2n], где
// n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию

import java.util.Scanner;

public class Task2_4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        twinNum(n);
    }

    public static void twinNum(int n) {
        for (int i = n; i <= 2 * n; i++) {
            if (isPrime(i)) {
                if ((i + 2 <= 2 * n) && isPrime(i + 2)) {
                    System.out.print(i + " " + (i + 2) + ", ");
                }
            }
        }
        System.out.println("\b\b.");
    }

    public static boolean isPrime(int i) {
        int j = 2;
        while (j <= i / 2) {
            if (i % j == 0) {
                return false;
            }
            j++;
        }
        return true;
    }
}
