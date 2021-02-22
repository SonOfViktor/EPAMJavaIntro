package Practice1;

// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_3 {
    public static void main (String[] args) throws IOException {
        double x;
        double y;
        double z;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число a: ");
        x = Double.parseDouble(reader.readLine());
        System.out.print("Введите число b: ");
        y = Double.parseDouble(reader.readLine());

        z = (Math.sin(x) - Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("z равно " + z);
    }
}
