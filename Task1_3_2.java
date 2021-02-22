package Practice1;

// Вычислить значение функции на отрезке [a, b] с шагом h
//      {x, x > 2
//  y = {
//      {-x, x >= 2

import java.util.Scanner;

public class Task1_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало отрезка: ");
        int a = scanner.nextInt();
        System.out.print("Введите конец отрезка: ");
        int b = scanner.nextInt();
        System.out.print("Задайте шаг: ");
        int h = scanner.nextInt();

        while (a <= b) {
            if (a > 2)
                System.out.print(a + " ");
            else
                System.out.print(-a + " ");
            a += h;
        }
    }
}
