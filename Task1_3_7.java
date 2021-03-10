package intro_to_java.practice_01;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task1_3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.print("Введите промежуток от m: ");
        int m = scanner.nextInt();
        System.out.print("до числа n: ");
        int n = scanner.nextInt();

        System.out.println("Делители числа number  в промежутке от m до n: ");
        for (int i = m; i <= n && i <= number / 2; i++) {
            if (i != 1 && i != number && number % i == 0)
                System.out.print(i + " ");
        }
    }

}
