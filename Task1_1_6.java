package intro_to_java.practice_01;

// 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_6 {
    public static void main (String[] args) throws IOException {
        int x;
        int y;
        boolean bool;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите x: ");
        x = Integer.parseInt(reader.readLine());
        System.out.print("Введите y: ");
        y = Integer.parseInt(reader.readLine());

        bool = ((x >= -4 && x <= 4 && y >= -3 && y <=0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4));
        System.out.println(bool);

    }
}
