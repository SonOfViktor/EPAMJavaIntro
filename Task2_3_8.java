package Practice2;

// Даны дроби p1 / q1, p2 / q2, ..., pN / qN (pI, qI - натуральные). Составить
// программу, которая приводит эти дроби к общему знаменателю и упорядочивает их
// в порядке возрастания.

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дробей: ");
        int N = scanner.nextInt();
        int[] numer = new int[N];
        int[] denom = new int[N];
        fillArray(numer);
        fillArray(denom);
        showFract(numer, denom);
        int comDenominator = commonDen(denom);
        commonMult(numer, denom, comDenominator);
        Arrays.sort(numer);
        showFract(numer, comDenominator);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 25) + 1;
        }
    }

    public static void showFract(int[] n, int[] d) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "/" + d[i] + "\t");
        }
        System.out.println();
    }

    public static void showFract(int[] n, int d) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "/" + d + "\t");
        }
        System.out.println();
    }

    public static int commonDen(int[] d) {
        int comDen = NOK(d[0], d[1]);
        for (int i = 2; i < d.length; i++) {
            comDen = NOK(comDen, d[i]);
        }
        return comDen;
    }

    public static void commonMult(int[] n, int[] d, int denom) {
        for (int i = 0; i < n.length; i++) {
            n[i] = denom / d[i] * n[i];
        }
    }

    public static int NOK(int a, int b) {
        return (a * b / NOD(a, b));
    }

    public static int NOD(int a, int b) {
        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}
