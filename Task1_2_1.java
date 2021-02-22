package Practice1;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
// он прямоугольным.


import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1_2_1 {
    public static void main (String[] args) {
        int alpha;
        int beta;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол α: ");
        alpha = scanner.nextInt();
        System.out.print("Введите угол β: ");
        beta = scanner.nextInt();

        if (alpha + beta < 180) {
            System.out.print("Треугольник существует, ");
            if (alpha == 90 || beta == 90 || (180 - alpha - beta) == 90)
                System.out.println("он прямоугольный");
            else
                System.out.println("он не прямоугольный");
        }
        else
            System.out.println("Треугльник не существует");
    }
}
