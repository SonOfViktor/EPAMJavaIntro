package intro_to_java.practice_02;

// Даны числа X, Y, Z, T - длины сторон четырёхугольника. Написать метод (методы)
// вычисления его площади, если угол между сторонами X и Y - прямой.

public class Task2_4_09 {
    public static void main(String[] args) {
        double X = 2;
        double Y = 1.5;
        double Z = 1;
        double T = 2.3;

        double D = diagonal(X, Y);
        double XYDTriangS = triangleS(X, Y, D);
        double ZTDTriangS = triangleS(Z, T, D);

        double XYZTArea = XYDTriangS + ZTDTriangS;

        System.out.println("Площадь четырёхугольника XYZT равна " + XYZTArea);
    }

    // По теореме Пифагора находим одну диагональ
    public static double diagonal (double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // Условно четырёхугольник можно разбить на 2 трёхугольника
    // Имея диагональ, площать трёхугольника вычиляется по трём сторонам
    public static double triangleS(double a, double b, double c) {
        double semiPer = (a + b + c) / 2;
        return Math.sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));
    }
}
