package Practice1;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class Task1_2_3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x для точки A: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите координату y для точки A: ");
        int y1 = scanner.nextInt();
        System.out.print("Введите координату x для точки B: ");
        int x2 = scanner.nextInt();
        System.out.print("Введите координату y для точки B: ");
        int y2 = scanner.nextInt();
        System.out.print("Введите координату x для точки C: ");
        int x3 = scanner.nextInt();
        System.out.print("Введите координату y для точки C: ");
        int y3 = scanner.nextInt();

        if ((x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1) == 0)
            System.out.println("Прямые на одной прямой линии");
        else
            System.out.println("Прямые не на одной прямой линии");
    }
}
