package Practice1;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
// отверстие.

import java.util.Scanner;

public class Task1_2_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер А для отверстия: ");
        int holeA = scanner.nextInt();
        System.out.print("Введите размер В для отверстия: ");
        int holeB = scanner.nextInt();
        System.out.print("Введите размер X для кирпича: ");
        int brickX = scanner.nextInt();
        System.out.print("Введите размер Y для кирпича: ");
        int brickY = scanner.nextInt();
        System.out.print("Введите размер Z для кирпича: ");
        int brickZ = scanner.nextInt();

        if ((holeA > brickX && holeB > brickY) ||
                (holeA > brickX && holeB > brickZ) ||
                (holeA > brickY && holeB > brickX) ||
                (holeA > brickY && holeB > brickZ) ||
                (holeA > brickZ && holeB > brickX) ||
                (holeA > brickZ && holeB > brickY))
            System.out.println("Кирпич подходит");
        else
            System.out.println("Кирпич не подходит");
    }

}
