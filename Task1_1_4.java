package Practice1;

// 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//   дробную и целую части числа и вывести полученное значение числа.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_4 {
    public static void main (String[] args) throws IOException {
        double number;
        int beforeDot;
        int afterDot;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число с тремя разрядами в дробной и целой частях: ");
        number = Double.parseDouble(reader.readLine());

        beforeDot = (int) number;
        afterDot = (int) Math.round(((number - beforeDot) * 1000.0));
        number = afterDot + beforeDot / 1000.0;
        System.out.println("Новое значение полученного числа: " + number);

    }
}
