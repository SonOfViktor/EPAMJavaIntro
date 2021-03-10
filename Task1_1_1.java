package intro_to_java.practice_01;

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_1 {
    public static void main (String[] args) throws IOException {
        double a;
        double b;
        double c;
        double z;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число a: ");
        a = Double.parseDouble(reader.readLine());
        System.out.print("Введите число b: ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("Введите число с: ");
        c = Double.parseDouble(reader.readLine());

        z = ((a - 3) * b / 2) + c;

        System.out.println("z равно " + z);
    }
}
