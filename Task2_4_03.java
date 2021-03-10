package intro_to_java.practice_02;

import java.util.Scanner;

// Вычислить площать правильного шестиугольника со стороной a, используя
// метод вычисления площади треугольника.

public class Task2_4_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону шестиугольника: ");
        int sideA = scanner.nextInt();
        System.out.println("Площадь шестиугольника: " + hexArea(sideA));
    }

    public static double hexArea(int side) {
        return 6 * triangleArea(side);
    }

    public static double triangleArea(int side) {
        return side * side * Math.sqrt(3.0) / 4;
    }
}
