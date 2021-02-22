package Practice1;

//  Вычислить значение функции

import java.util.Scanner;

public class Task1_2_5 {

    public static void main (String[] args) {
        double x;
        double F;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = scanner.nextDouble();

        if (x <= 3)
            F = x * x - 3 * x + 9;
        else
            F = 1 / (x * x + 6);

        System.out.println("F равно " + F);
    }
}
