package Practice1;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа

import java.util.Scanner;

public class Task1_3_1 {
    public static void main (String[] args) {
        int x = 1;
        int sum = 0;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        number = scanner.nextInt();

        while (x <= number) {
            sum += x;
            x++;
        }

        System.out.println("Сумма чисел равна: " + sum);
    }
}
