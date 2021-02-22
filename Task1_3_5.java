package Practice1;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.

import java.util.Scanner;

public class Task1_3_5 {
    public static void main(String[] args) {
        int n = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число е: ");
        double e = scanner.nextDouble();
        if (e < 0)
            e = -e;

        while (true) {
            double a = (1 / Math.pow(2, n) + 1 / Math.pow(3, n));
            if (a >= e) {
                sum += a;
                n++;
            }
            else break;
        }
        System.out.println(sum);
    }
}
