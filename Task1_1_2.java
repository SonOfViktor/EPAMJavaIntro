package Practice1;

// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_2 {
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

        z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println("z равно " + z);
    }
}
