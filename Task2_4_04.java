package intro_to_java.practice_02;

// На плоскости заданы своими координатами n точек. Написать метод (методы),
// определяющие, между какими из пар точек самое большое расстояние.
// Координаты точек занести в массив.

import java.util.Scanner;

public class Task2_4_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int n = scanner.nextInt();
        int[][] pointXY = new int[2][n];
        fillArray(pointXY);
        showPoint(pointXY);
        System.out.println("Максимальная дистанция между точками: ");
        System.out.println(maxDist(pointXY));

    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                if (Math.random() < 0.5) {
                    array[i][j] *= -1;
                }
            }
        }
    }

    public static void showPoint(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            System.out.println("Точка №" + (i + 1) + ": X = " + array[0][i] +
                                                " Y = " + array[1][i]);
        }
    }

    public static double maxDist (int[][] array) {
        double maxDistance = 0;
        for (int i = 0; i < array[0].length - 1; i++) {
            for (int j = i + 1; j < array[0].length; j++) {
                double dist = distance(array[0][i], array[1][i],
                                        array[0][j], array[1][j]);
                if (dist > maxDistance) {
                    maxDistance = dist;
                }
            }
        }
        return maxDistance;
    }

    // Вычисление растояния между точками по теореме Пифагора
    public static double distance(int X1, int Y1, int X2, int Y2) {
        int distX;
        int distY;
        // Расстояние между координатами отнимаются, если
        // они имеют один знак и складываются если разный
        if (X1 > 0 && X2 > 0 || X1 <= 0 && X2 <= 0) {
            distX = Math.abs(X1 - X2);
        } else
            distX = Math.abs(X1) + Math.abs(X2);
        if (Y1 > 0 && Y2 > 0 || Y1 <= 0 && Y2 <= 0) {
            distY = Math.abs(Y1 - Y2);
        } else
            distY = Math.abs(Y1) + Math.abs(Y2);
        return Math.sqrt(distX * distX + distY * distY);
    }

}
